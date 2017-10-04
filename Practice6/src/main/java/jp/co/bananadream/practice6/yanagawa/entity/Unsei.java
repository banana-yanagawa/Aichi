package jp.co.bananadream.practice6.yanagawa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Unseiエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2017/08/10 18:53:51")
public class Unsei implements Serializable {

    private static final long serialVersionUID = 1L;

    /** unseiIdプロパティ */
    @Id
    @Column(precision = 3, nullable = false, unique = true)
    public BigDecimal unseiId;

    /** unseiNameプロパティ */
    @Column(length = 2, nullable = true, unique = false)
    public String unseiName;

    /** updateUserプロパティ */
    @Column(length = 15, nullable = true, unique = false)
    public String updateUser;

    /** updateDateプロパティ */
    @Column(nullable = true, unique = false)
    public Date updateDate;

    /** createUserプロパティ */
    @Column(length = 15, nullable = true, unique = false)
    public String createUser;

    /** createDateプロパティ */
    @Column(nullable = true, unique = false)
    public Date createDate;

    /** omikujiList関連プロパティ */
    @OneToMany(mappedBy = "unsei")
    public List<Omikuji> omikujiList;
}