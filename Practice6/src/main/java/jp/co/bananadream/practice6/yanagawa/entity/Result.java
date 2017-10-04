package jp.co.bananadream.practice6.yanagawa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Resultエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/08/10 18:53:51")
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;

	/** fortuneDayプロパティ */
	@Column(nullable = false, unique = false)
	public Date fortuneDay;

	/** birthdayプロパティ */
	@Column(nullable = false, unique = false)
	public Date birthday;

	/** omikujiIdプロパティ */
	@Column(precision = 3, nullable = false, unique = false)
	public BigDecimal omikujiId;

	/** updateUserプロパティ */
	@Column(length = 15, nullable = false, unique = false)
	public String updateUser;

	/** updateDayプロパティ */
	@Column(nullable = false, unique = false)
	public Date updateDay;

	/** omikuji関連プロパティ */
	@ManyToOne
	@JoinColumn(name = "omikuji_id", referencedColumnName = "omikuji_id")
	public Omikuji omikuji;



}