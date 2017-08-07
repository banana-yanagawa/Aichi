package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;



public class BirthdayList {


	public static BirthdayList getInstance(){

		return new BirthdayList();

	}



		Connection conn = null;
		PreparedStatement ps = null;




//		public String inputBirthday() throws SQLException{
//
//			conn = DBManeger.getConnection();
//
//			Statement stmt = conn.createStatement();
//			String sql2 = "SELECT birthday from result order by birthday desc LIMIT 1 OFFSET 0 ";
//			ResultSet rs = stmt.executeQuery(sql2);
//
//			String birthday = null;
//
//			while(rs.next()){
//
//				birthday = rs.getString("birthday");
//
//			}
//
//			return birthday;
//
//		}




		public List<BirthdayBean> birtdayList(ActionForm form) throws SQLException{

		conn = DBManeger.getConnection();

		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す
		String sql3 = "SELECT unsei.unsei_name,result.update_day,omikuji.akinai,omikuji.negaigoto,omikuji.gakumon FROM (omikuji inner join unsei on omikuji.unsei_id = unsei.unsei_id) "
				+ "inner join result on omikuji.omikuji_id = result.omikuji_id where (result.birthday = ?) and ( result.update_day > now() - interval '6 month') order by result.update_day asc";
		ps = conn.prepareStatement(sql3);

		BirthdayForm birthdayForm = (BirthdayForm)form;

		String birthday = birthdayForm.getBirthday();

		Date formatDate = Date.valueOf(birthday);

		//今日の日付と入力された誕生日をセット
		ps.setDate(1,formatDate);

		//実行
		ResultSet rs2 = ps.executeQuery();

		//おみくじオブジェクト生成
		List<BirthdayBean> list = new ArrayList<BirthdayBean>();

		//レコードがある限り繰り返す
		while(rs2.next()){

			//コンソールに出す用と結果テーブルに反映用にセット
			BirthdayBean bir = new BirthdayBean();
			bir.setFortuneDay(rs2.getString("update_day"));
			bir.setUnseiname(rs2.getString("unsei_name"));
			bir.setNegaigoto(rs2.getString("negaigoto"));
			bir.setAkinai(rs2.getString("akinai"));
			bir.setGakumon(rs2.getString("gakumon"));

			list.add(bir);

		}

	//	String result = null;



		return list;


	}

}


