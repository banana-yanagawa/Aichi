package jp.co.bananadream.practice6.yanagawa.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Sendエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/08/31 15:03:28")
public class Send implements Serializable {

    private static final long serialVersionUID = 1L;

    /** postelCodeプロパティ */
    @Column(length = 8, nullable = false, unique = false)
    public String postelCode;

    /** addressプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    public String address;

    /** searchプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    public String search;
}