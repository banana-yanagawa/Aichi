package jp.co.bananadream.practice6.yanagawa.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static jp.co.bananadream.practice6.yanagawa.entity.OmikujiNames.*;

/**
 * {@link Omikuji}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2017/08/10 18:53:58")
public class OmikujiTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Omikuji.class).id(BigDecimal.ONE).getSingleResult();
    }

    /**
     * unseiとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_unsei() throws Exception {
        jdbcManager.from(Omikuji.class).leftOuterJoin(unsei()).id(BigDecimal.ONE).getSingleResult();
    }

    /**
     * resultListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_resultList() throws Exception {
        jdbcManager.from(Omikuji.class).leftOuterJoin(resultList()).id(BigDecimal.ONE).getSingleResult();
    }
}