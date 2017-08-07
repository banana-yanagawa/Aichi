package test;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Wariai {






	public static Wariai getInstance(){

		return new Wariai();

	}

	Connection conn = null;
	PreparedStatement ps = null;





	/**
	 * 今日の結果の割合を出すためのメソッド
	 * @return
	 * @throws SQLException
	 */

	public List<WariaiBean> today() throws SQLException{

		conn = DBManeger.getConnection();

		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す


		String sql = "SELECT unsei.unsei_name ,COUNT(omikuji.unsei_id), omikuji.unsei_id FROM ( result left outer join omikuji on result.omikuji_id = omikuji.omikuji_id  and (result.update_day = ?  ) ) right outer join unsei on omikuji.unsei_id = unsei.unsei_id GROUP BY unsei.unsei_name, omikuji.unsei_id order by omikuji.unsei_id asc";


		//		String sql2 = "select count(*) from result where  (update_day = ?) ";

		ps = conn.prepareStatement(sql);
		//		ps = conn.prepareStatement(sql2);

		ps.setDate(1,date());

		ResultSet rs = ps.executeQuery();

		WariaiBean wa = null;
		List<WariaiBean> list = new ArrayList<WariaiBean>();

		BigDecimal all = new BigDecimal(todaySum());
		DecimalFormat df = new DecimalFormat("##0.0%");

		while(rs.next()){

			wa = new WariaiBean();


			BigDecimal cnt = new BigDecimal(rs.getInt("count"));

			wa.setUnseiName(rs.getString("unsei_name"));
			wa.setWariai(df.format(cnt.divide(all,3,BigDecimal.ROUND_HALF_UP)));

			list.add(wa);

		}

		return list;


	}



	/**
	 * 本日の総おみくじ回数メソッド
	 * @return
	 * @throws SQLException
	 */

	public int todaySum() throws SQLException{

		conn = DBManeger.getConnection();

		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す


		//	String sql = "SELECT u.unsei_name ,COUNT(o.unsei_id) FROM result r, omikuji o, unsei u WHERE r.omikuji_id = o.omikuji_id AND o.unsei_id = u.unsei_id and (r.update_day = ?) GROUP BY u.unsei_name, o.unsei_id";
		String sql2 = "select count(*) from result where  (update_day = ?) ";

		//	ps = conn.prepareStatement(sql);
		ps = conn.prepareStatement(sql2);

		ps.setDate(1,date());

		ResultSet rs = ps.executeQuery();

		int sum = 0;

		while(rs.next()){

			sum =  rs.getInt(1);

		}

		return sum;


	}



	/**
	 * 半年分の結果の割合を出すためのメソッド
	 * @return
	 * @throws SQLException
	 */

	public List<WariaiBean> hantoshi() throws SQLException{

		conn = DBManeger.getConnection();

		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す


		String sql = "SELECT unsei.unsei_name ,COUNT(omikuji.unsei_id) , omikuji.unsei_id FROM ( result left outer join omikuji on result.omikuji_id = omikuji.omikuji_id  and (result.update_day > now() - interval '6 month')  ) right outer join unsei on omikuji.unsei_id = unsei.unsei_id GROUP BY unsei.unsei_name, omikuji.unsei_id order by omikuji.unsei_id asc";


		ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		WariaiBean wa = null;
		List<WariaiBean> list2 = new ArrayList<WariaiBean>();

		BigDecimal all2 = new BigDecimal(hantoshiSum());
		DecimalFormat df = new DecimalFormat("##0.0%");

		while(rs.next()){

			BigDecimal cnt = new BigDecimal(rs.getInt("count"));

			wa = new WariaiBean();
			wa.setUnseiName(rs.getString("unsei_name"));
			wa.setWariai(df.format(cnt.divide(all2,3,BigDecimal.ROUND_HALF_UP)));;


			list2.add(wa);

		}

		return list2;



	}


	/**
	 *
	 * 半年分の結果の件数を返すメソッド
	 *
	 * @return sum
	 * @throws SQLException
	 */

	public int hantoshiSum() throws SQLException{

		conn = DBManeger.getConnection();

		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す


		//	String sql = "SELECT u.unsei_name ,COUNT(o.unsei_id) FROM result r, omikuji o, unsei u WHERE r.omikuji_id = o.omikuji_id AND o.unsei_id = u.unsei_id and (r.update_day = ?) GROUP BY u.unsei_name, o.unsei_id";
		String sql2 = "select count(*) from result where (result.update_day > now() - interval '6 month') ";

		//	ps = conn.prepareStatement(sql);
		ps = conn.prepareStatement(sql2);

		ResultSet rs = ps.executeQuery();


		int sum = 0;

		while(rs.next()){

			sum =  rs.getInt(1);

		}

		return sum;


	}





















	//	public String todayOmikuji(ActionForm form) throws SQLException{
	//
	//		conn = DBManeger.getConnection();
	//
	//		//３テーブル結合　入力された誕生日と今日の日付が一致したものだけ取り出す
	//
	//
	//		String sql = "SELECT count (omikuji_id) as id FROM result where (update_day = ?) and (birthday = ?) and (update_day > now() - interval '6 month')";
	//
	//		ps = conn.prepareStatement(sql);
	//
	//		WariaiForm wariaiForm = (WariaiForm)form;
	//
	//		String birthday = wariaiForm.getBirthday();
	//
	//		Date formatDate = Date.valueOf(birthday);
	//
	//		//今日の日付と入力された誕生日をセット
	//		ps.setDate(1,date());
	//		ps.setDate(2,formatDate);
	//
	//		ResultSet rs = ps.executeQuery();
	//
	//		String coung = null;
	//
	//		while(rs.next()){
	//
	//			coung = rs.getString("id");
	//
	//		}
	//
	//		return coung;
	//
	//	}
	//


	//	public String allOmikuji(ActionForm form) throws SQLException{
	//
	//		conn = DBManeger.getConnection();
	//
	//
	//		String sql = "SELECT count (omikuji_id) as id FROM result where (birthday = ?) and (update_day > now() - interval '6 month')";
	//
	//		ps = conn.prepareStatement(sql);
	//
	//		WariaiForm wariaiForm = (WariaiForm)form;
	//
	//		String birthday = wariaiForm.getBirthday();
	//
	//		Date formatDate = Date.valueOf(birthday);
	//
	//		//今日の日付と入力された誕生日をセット
	//		ps.setDate(1,formatDate);
	//
	//		ResultSet rs = ps.executeQuery();
	//
	//		String coung = null;
	//
	//		while(rs.next()){
	//
	//			coung = rs.getString("id");
	//
	//		}
	//
	//		return coung;
	//
	//
	//	}
	//


	/**
	 * 今日の日付生成のためのメソッド
	 * @return　date2
	 */
	public static Date date(){

		//今日の日付を生成
		java.util.Date date1 = new java.util.Date();
		java.sql.Date date2 = new java.sql.Date(date1.getTime());

		return date2;

	}

}
