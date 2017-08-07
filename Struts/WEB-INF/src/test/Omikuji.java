package test;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;

import org.apache.struts.action.ActionForm;


public class Omikuji {


	public static OmikujiBean main(ActionForm form) throws IOException {


		//変数定義
		Connection conn = null;

		OmikujiBean resOmikuji = null;

		//もしテーブルの中がnullなら
		try {
			if(!OmikujiDAO.getInstance().checkTable()){

				//繋ぐ
				conn = DBManeger.getConnection();

				//insertUnseiとinsertOmikujiを呼ぶ
				OmikujiDAO.getInstance().insertUnsei();
				OmikujiDAO.getInstance().insertOmikuji();

			}


			//繋ぐ
			conn = DBManeger.getConnection();


			//Date型に変換
			Date formatDate = Date.valueOf(birthday(form));

			//入力された誕生日を持って同日チェックしに行く
			resOmikuji = OmikujiDAO.getInstance().searchOmikuji(formatDate);

			//もしnullなら
			if(resOmikuji == null) {

				//おみくじの件数を調べて件数の中でランダム使う　
				Random rnd = new Random();
				int omikujiId = rnd.nextInt(OmikujiDAO.getInstance().checkOmikuji());

				//resOmikujiの中にchoiceOmikujiメソッドの結果を入れる
				resOmikuji = OmikujiDAO.getInstance().choiceOmikuji(omikujiId);

				//結果テーブルに反映
				OmikujiDAO.getInstance().insertResult(formatDate,resOmikuji.getOmikujiId());

			}

			// クローズ処理
			if (conn != null){
				conn.close();

			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


		return resOmikuji;



	}

	public static String birthday(ActionForm form){

		CheckForm checkForm = (CheckForm)form;

		String birthday = checkForm.getBirthday();

		return birthday;


	}

}

