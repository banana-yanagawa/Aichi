package jp.co.bananadream.practice6.yanagawa.entity;

import javax.annotation.Generated;
import jp.co.bananadream.practice6.yanagawa.entity.OmikujiNames._OmikujiNames;
import jp.co.bananadream.practice6.yanagawa.entity.ResultNames._ResultNames;
import jp.co.bananadream.practice6.yanagawa.entity.SendNames._SendNames;
import jp.co.bananadream.practice6.yanagawa.entity.UnseiNames._UnseiNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2017/08/31 15:03:31")
public class Names {

    /**
     * {@link Omikuji}の名前クラスを返します。
     * 
     * @return Omikujiの名前クラス
     */
    public static _OmikujiNames omikuji() {
        return new _OmikujiNames();
    }

    /**
     * {@link Result}の名前クラスを返します。
     * 
     * @return Resultの名前クラス
     */
    public static _ResultNames result() {
        return new _ResultNames();
    }

    /**
     * {@link Send}の名前クラスを返します。
     * 
     * @return Sendの名前クラス
     */
    public static _SendNames send() {
        return new _SendNames();
    }

    /**
     * {@link Unsei}の名前クラスを返します。
     * 
     * @return Unseiの名前クラス
     */
    public static _UnseiNames unsei() {
        return new _UnseiNames();
    }
}