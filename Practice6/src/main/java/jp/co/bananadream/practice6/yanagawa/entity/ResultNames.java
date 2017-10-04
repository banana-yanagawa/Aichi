package jp.co.bananadream.practice6.yanagawa.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.annotation.Generated;
import jp.co.bananadream.practice6.yanagawa.entity.OmikujiNames._OmikujiNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Result}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/08/31 15:03:31")
public class ResultNames {

    /**
     * fortuneDayのプロパティ名を返します。
     * 
     * @return fortuneDayのプロパティ名
     */
    public static PropertyName<Date> fortuneDay() {
        return new PropertyName<Date>("fortuneDay");
    }

    /**
     * birthdayのプロパティ名を返します。
     * 
     * @return birthdayのプロパティ名
     */
    public static PropertyName<Date> birthday() {
        return new PropertyName<Date>("birthday");
    }

    /**
     * omikujiIdのプロパティ名を返します。
     * 
     * @return omikujiIdのプロパティ名
     */
    public static PropertyName<BigDecimal> omikujiId() {
        return new PropertyName<BigDecimal>("omikujiId");
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
     * omikujiのプロパティ名を返します。
     * 
     * @return omikujiのプロパティ名
     */
    public static _OmikujiNames omikuji() {
        return new _OmikujiNames("omikuji");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ResultNames extends PropertyName<Result> {

        /**
         * インスタンスを構築します。
         */
        public _ResultNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ResultNames(final String name) {
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
        public _ResultNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * fortuneDayのプロパティ名を返します。
         *
         * @return fortuneDayのプロパティ名
         */
        public PropertyName<Date> fortuneDay() {
            return new PropertyName<Date>(this, "fortuneDay");
        }

        /**
         * birthdayのプロパティ名を返します。
         *
         * @return birthdayのプロパティ名
         */
        public PropertyName<Date> birthday() {
            return new PropertyName<Date>(this, "birthday");
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
         * omikujiのプロパティ名を返します。
         * 
         * @return omikujiのプロパティ名
         */
        public _OmikujiNames omikuji() {
            return new _OmikujiNames(this, "omikuji");
        }
    }
}