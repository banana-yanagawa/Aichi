package jp.co.bananadream.practice6.yanagawa.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static jp.co.bananadream.practice6.yanagawa.entity.UnseiNames.*;

/**
 * {@link Unsei}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2017/08/10 18:53:58")
public class UnseiTest extends S2TestCase {

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
        jdbcManager.from(Unsei.class).id(BigDecimal.ONE).getSingleResult();
    }

    /**
     * omikujiListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_omikujiList() throws Exception {
        jdbcManager.from(Unsei.class).leftOuterJoin(omikujiList()).id(BigDecimal.ONE).getSingleResult();
    }
}