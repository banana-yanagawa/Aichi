package jp.co.bananadream.practice6.yanagawa.service;

import static jp.co.bananadream.practice6.yanagawa.entity.OmikujiNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import jp.co.bananadream.practice6.yanagawa.entity.Omikuji;
import jp.co.bananadream.practice6.yanagawa.entity.Result;

/**
 * {@link Omikuji}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2017/08/10 18:53:57")
public class OmikujiService extends AbstractService<Omikuji> {

	//	@Resource
	protected JdbcManager jdbcManager = SingletonS2Container.getComponent(JdbcManager.class);

	public static OmikujiService getInstance(){

		return new OmikujiService();

	}

	/**
	 * 識別子でエンティティを検索します。
	 *
	 * @param omikujiId
	 *            識別子
	 * @return エンティティ
	 */
	public Omikuji findById(BigDecimal omikujiId) {
		return select().id(omikujiId).getSingleResult();
	}

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */
	public List<Omikuji> findAllOrderById() {
		return select().orderBy(asc(omikujiId())).getResultList();
	}

	public Result findSameResult(String birthDay){

		//結果テーブルに今日の日付で誕生日が同じ結果がないか見に行く
		Result check =
				jdbcManager
				.from(Result.class)
				.where("birthday = ? and updateDay = ?",convBirthday(birthDay),today())
				.getSingleResult();

		return check;

	}

	public Omikuji setOmikuji(BigDecimal omikujiId){

		Omikuji omikuji =
				jdbcManager
				.from(Omikuji.class)
				.innerJoin("unsei")
				.where("omikujiId = ?",omikujiId)
				.getSingleResult();


		return omikuji;

	}



	public Omikuji choiceOmikuji(){

		//おみくじテーブルの件数を取得してint型に変換
		long count = jdbcManager.from(Omikuji.class).getCount();
		int kensu = (int)count;

		//件数分ランダムかける
		Random rnd = new Random();
		int omikujiId = rnd.nextInt(kensu);

		//ランダムで出た数のおみくじIDをおみくじテーブルから持ってくる
		Omikuji omikuji =
				jdbcManager
				.from(Omikuji.class)
				.innerJoin("unsei")
				.where("omikujiId = ?", omikujiId)
				.getSingleResult();



//		List<BeanMap> omikujiItems = new ArrayList<BeanMap>();
//
//		BeanMap map = Beans.createAndCopy(BeanMap.class, omikuji).execute();
//
//		omikujiItems.add(map);


		return omikuji;

	}


		public void insertResult(String birthDay){


			//結果テーブルに書き込み
			Result result = new Result();
			result.fortuneDay = today();
			result.birthday = convBirthday(birthDay);
			result.omikujiId = choiceOmikuji().omikujiId;
			result.updateUser = "柳川留衣";
			result.updateDay = today();
		    jdbcManager.insert(result).execute();

		}


	public Date convBirthday(String birthDay){

		//入力された誕生日を取得
		return Date.valueOf(birthDay);

	}

	public Date today(){

		//今日の日付を取得
		java.util.Date date1 = new java.util.Date();
		java.sql.Date date2 = new java.sql.Date(date1.getTime());

		return date2;

	}













}