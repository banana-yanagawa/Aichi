package jp.co.bananadream.practice6.yanagawa.service;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;
import org.seasar.framework.container.SingletonS2Container;

import jp.co.bananadream.practice6.yanagawa.entity.Send;

/**
 * {@link Send}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2017/08/29 11:59:24")
public class SendService extends AbstractService<Send> {

	protected JdbcManager jdbcManager = SingletonS2Container.getComponent(JdbcManager.class);


	public static  SendService getInstance(){

		return new SendService();
	}



	public Send sendSearch(String postelCode){

		Send postal =
				jdbcManager
				.from(Send.class)
				.where("postelCode = ?",postelCode)
				.getSingleResult();

		return postal;

	}

	public List<Send> addressSearch(String address){


	//	String Ken = ken;
		String Address = address;
		String change = "ケ";
		String addressResult = Address.replaceAll(change, "ヶ");

		List<Send> addressList =
				jdbcManager
				.from(Send.class)
				.where(
						new SimpleWhere()
						.contains("search", addressResult)
						)
				.getResultList();

		return addressList;

	}








}