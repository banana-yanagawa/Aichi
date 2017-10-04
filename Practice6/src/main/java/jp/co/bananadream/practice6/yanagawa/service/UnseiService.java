package jp.co.bananadream.practice6.yanagawa.service;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Generated;
import jp.co.bananadream.practice6.yanagawa.entity.Unsei;

import static jp.co.bananadream.practice6.yanagawa.entity.UnseiNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Unsei}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2017/08/10 18:53:57")
public class UnseiService extends AbstractService<Unsei> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param unseiId
     *            識別子
     * @return エンティティ
     */
    public Unsei findById(BigDecimal unseiId) {
        return select().id(unseiId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Unsei> findAllOrderById() {
        return select().orderBy(asc(unseiId())).getResultList();
    }
}