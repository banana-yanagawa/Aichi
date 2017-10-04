package jp.co.bananadream.practice6.yanagawa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Omikujiエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/08/10 18:53:51")
public class Omikuji implements Serializable {

    private static final long serialVersionUID = 1L;

    /** omikujiIdプロパティ */
    @Id
    @Column(precision = 2, nullable = false, unique = true)
    public BigDecimal omikujiId;

    /** unseiIdプロパティ */
    @Column(precision = 3, nullable = false, unique = false)
    public BigDecimal unseiId;

    /** negaigotoプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String negaigoto;

    /** akinaiプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String akinai;

    /** gakumonプロパティ */
    @Column(length = 10, nullable = false, unique = false)
    public String gakumon;

    /** updateUserプロパティ */
    @Column(length = 15, nullable = false, unique = false)
    public String updateUser;

    /** updateDayプロパティ */
    @Column(nullable = false, unique = false)
    public Date updateDay;

    /** createUserプロパティ */
    @Column(length = 15, nullable = false, unique = false)
    public String createUser;

    /** createDayプロパティ */
    @Column(nullable = false, unique = false)
    public Date createDay;

    /** unsei関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "unsei_id", referencedColumnName = "unsei_id")
    public Unsei unsei;

    /** resultList関連プロパティ */
    @OneToMany(mappedBy = "omikuji")
    public List<Result> resultList;
}