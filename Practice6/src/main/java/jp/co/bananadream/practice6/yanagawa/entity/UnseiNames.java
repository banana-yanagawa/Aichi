package jp.co.bananadream.practice6.yanagawa.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.annotation.Generated;
import jp.co.bananadream.practice6.yanagawa.entity.OmikujiNames._OmikujiNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Unsei}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/08/31 15:03:31")
public class UnseiNames {

    /**
     * unseiIdのプロパティ名を返します。
     * 
     * @return unseiIdのプロパティ名
     */
    public static PropertyName<BigDecimal> unseiId() {
        return new PropertyName<BigDecimal>("unseiId");
    }

    /**
     * unseiNameのプロパティ名を返します。
     * 
     * @return unseiNameのプロパティ名
     */
    public static PropertyName<String> unseiName() {
        return new PropertyName<String>("unseiName");
    }

    /**
     * updateUserのプロパティ名を返します。
     * 
     * @return updateUserのプロパティ名
     */
    public static PropertyName<String> updateUser() {
        return new PropertyName<String>("updateUser");
    }

    /**
     * updateDateのプロパティ名を返します。
     * 
     * @return updateDateのプロパティ名
     */
    public static PropertyName<Date> updateDate() {
        return new PropertyName<Date>("updateDate");
    }

    /**
     * createUserのプロパティ名を返します。
     * 
     * @return createUserのプロパティ名
     */
    public static PropertyName<String> createUser() {
        return new PropertyName<String>("createUser");
    }

    /**
     * createDateのプロパティ名を返します。
     * 
     * @return createDateのプロパティ名
     */
    public static PropertyName<Date> createDate() {
        return new PropertyName<Date>("createDate");
    }

    /**
     * omikujiListのプロパティ名を返します。
     * 
     * @return omikujiListのプロパティ名
     */
    public static _OmikujiNames omikujiList() {
        return new _OmikujiNames("omikujiList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UnseiNames extends PropertyName<Unsei> {

        /**
         * インスタンスを構築します。
         */
        public _UnseiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UnseiNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _UnseiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * unseiIdのプロパティ名を返します。
         *
         * @return unseiIdのプロパティ名
         */
        public PropertyName<BigDecimal> unseiId() {
            return new PropertyName<BigDecimal>(this, "unseiId");
        }

        /**
         * unseiNameのプロパティ名を返します。
         *
         * @return unseiNameのプロパティ名
         */
        public PropertyName<String> unseiName() {
            return new PropertyName<String>(this, "unseiName");
        }

        /**
         * updateUserのプロパティ名を返します。
         *
         * @return updateUserのプロパティ名
         */
        public PropertyName<String> updateUser() {
            return new PropertyName<String>(this, "updateUser");
        }

        /**
         * updateDateのプロパティ名を返します。
         *
         * @return updateDateのプロパティ名
         */
        public PropertyName<Date> updateDate() {
            return new PropertyName<Date>(this, "updateDate");
        }

        /**
         * createUserのプロパティ名を返します。
         *
         * @return createUserのプロパティ名
         */
        public PropertyName<String> createUser() {
            return new PropertyName<String>(this, "createUser");
        }

        /**
         * createDateのプロパティ名を返します。
         *
         * @return createDateのプロパティ名
         */
        public PropertyName<Date> createDate() {
            return new PropertyName<Date>(this, "createDate");
        }

        /**
         * omikujiListのプロパティ名を返します。
         * 
         * @return omikujiListのプロパティ名
         */
        public _OmikujiNames omikujiList() {
            return new _OmikujiNames(this, "omikujiList");
        }
    }
}