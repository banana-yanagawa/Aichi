package jp.co.bananadream.practice6.yanagawa.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.annotation.Generated;
import jp.co.bananadream.practice6.yanagawa.entity.ResultNames._ResultNames;
import jp.co.bananadream.practice6.yanagawa.entity.UnseiNames._UnseiNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Omikuji}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/08/31 15:03:31")
public class OmikujiNames {

    /**
     * omikujiIdのプロパティ名を返します。
     * 
     * @return omikujiIdのプロパティ名
     */
    public static PropertyName<BigDecimal> omikujiId() {
        return new PropertyName<BigDecimal>("omikujiId");
    }

    /**
     * unseiIdのプロパティ名を返します。
     * 
     * @return unseiIdのプロパティ名
     */
    public static PropertyName<BigDecimal> unseiId() {
        return new PropertyName<BigDecimal>("unseiId");
    }

    /**
     * negaigotoのプロパティ名を返します。
     * 
     * @return negaigotoのプロパティ名
     */
    public static PropertyName<String> negaigoto() {
        return new PropertyName<String>("negaigoto");
    }

    /**
     * akinaiのプロパティ名を返します。
     * 
     * @return akinaiのプロパティ名
     */
    public static PropertyName<String> akinai() {
        return new PropertyName<String>("akinai");
    }

    /**
     * gakumonのプロパティ名を返します。
     * 
     * @return gakumonのプロパティ名
     */
    public static PropertyName<String> gakumon() {
        return new PropertyName<String>("gakumon");
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
     * updateDayのプロパティ名を返します。
     * 
     * @return updateDayのプロパティ名
     */
    public static PropertyName<Date> updateDay() {
        return new PropertyName<Date>("updateDay");
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
     * createDayのプロパティ名を返します。
     * 
     * @return createDayのプロパティ名
     */
    public static PropertyName<Date> createDay() {
        return new PropertyName<Date>("createDay");
    }

    /**
     * unseiのプロパティ名を返します。
     * 
     * @return unseiのプロパティ名
     */
    public static _UnseiNames unsei() {
        return new _UnseiNames("unsei");
    }

    /**
     * resultListのプロパティ名を返します。
     * 
     * @return resultListのプロパティ名
     */
    public static _ResultNames resultList() {
        return new _ResultNames("resultList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _OmikujiNames extends PropertyName<Omikuji> {

        /**
         * インスタンスを構築します。
         */
        public _OmikujiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OmikujiNames(final String name) {
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
        public _OmikujiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * omikujiIdのプロパティ名を返します。
         *
         * @return omikujiIdのプロパティ名
         */
        public PropertyName<BigDecimal> omikujiId() {
            return new PropertyName<BigDecimal>(this, "omikujiId");
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
         * negaigotoのプロパティ名を返します。
         *
         * @return negaigotoのプロパティ名
         */
        public PropertyName<String> negaigoto() {
            return new PropertyName<String>(this, "negaigoto");
        }

        /**
         * akinaiのプロパティ名を返します。
         *
         * @return akinaiのプロパティ名
         */
        public PropertyName<String> akinai() {
            return new PropertyName<String>(this, "akinai");
        }

        /**
         * gakumonのプロパティ名を返します。
         *
         * @return gakumonのプロパティ名
         */
        public PropertyName<String> gakumon() {
            return new PropertyName<String>(this, "gakumon");
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
         * updateDayのプロパティ名を返します。
         *
         * @return updateDayのプロパティ名
         */
        public PropertyName<Date> updateDay() {
            return new PropertyName<Date>(this, "updateDay");
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
         * createDayのプロパティ名を返します。
         *
         * @return createDayのプロパティ名
         */
        public PropertyName<Date> createDay() {
            return new PropertyName<Date>(this, "createDay");
        }

        /**
         * unseiのプロパティ名を返します。
         * 
         * @return unseiのプロパティ名
         */
        public _UnseiNames unsei() {
            return new _UnseiNames(this, "unsei");
        }

        /**
         * resultListのプロパティ名を返します。
         * 
         * @return resultListのプロパティ名
         */
        public _ResultNames resultList() {
            return new _ResultNames(this, "resultList");
        }
    }
}