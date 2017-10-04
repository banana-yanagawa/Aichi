package jp.co.bananadream.practice6.yanagawa.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.container.SingletonS2Container;

import jp.co.bananadream.practice6.yanagawa.dto.BirthdayBean;
import jp.co.bananadream.practice6.yanagawa.dto.BirthdaySQL;
import jp.co.bananadream.practice6.yanagawa.dto.WariaiBean;
import jp.co.bananadream.practice6.yanagawa.entity.Result;

/**
 * {@link Result}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2017/08/10 18:53:57")
public class ResultService extends AbstractService<Result> {

	protected JdbcManager jdbcManager = SingletonS2Container.getComponent(JdbcManager.class);

	public static ResultService getInstance(){

		return new ResultService();
	}




	public List<BirthdayBean> findSameBirthday(String birthday){

		BirthdaySQL param = new BirthdaySQL();
		param.day = conBirthday(birthday);

		List<BirthdayBean> result =
				jdbcManager
				.selectBySqlFile(BirthdayBean.class,
						"jp/co/bananadream/practice6/yanagawa/service/create.sql"
						,param)
				.getResultList();

		return result;

	}


	public List<WariaiBean> searchHarfWariai(){

		List<WariaiBean> result =
				jdbcManager
				.selectBySqlFile(WariaiBean.class,
						"jp/co/bananadream/practice6/yanagawa/service/hantoshi.sql"
						)
				.getResultList();

		return result;

	}

	public long hantoshiSum(){

		long count =
			    jdbcManager
			        .from(Result.class)
			        .where("updateDay > now() - interval '6 month'")
			        .getCount();

		return count;
	}


	public List<WariaiBean> searchTodayWariai(){

		BirthdaySQL param = new BirthdaySQL();
		param.today = OmikujiService.getInstance().today();

		List<WariaiBean> result =
				jdbcManager
				.selectBySqlFile(WariaiBean.class,
						"jp/co/bananadream/practice6/yanagawa/service/today.sql"
						,param
						)
				.getResultList();

		return result;

	}

	public long todaySum(){

		long count =
			    jdbcManager
			        .from(Result.class)
			        .where("updateDay = ?",OmikujiService.getInstance().today())
			        .getCount();

		return count;
	}








	public Date conBirthday(String birthday){

		//入力された誕生日を取得
		return Date.valueOf(birthday);

	}





}




