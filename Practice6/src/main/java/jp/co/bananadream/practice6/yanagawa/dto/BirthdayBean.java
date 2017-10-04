package jp.co.bananadream.practice6.yanagawa.dto;

import java.sql.Date;

public class BirthdayBean {

	public Date updateDay;
	public String unseiName;
	public String negaigoto;
	public String akinai;
	public String gakumon;

	public Date getUpdateDay() {
		return updateDay;
	}
	public void setUpdateDay(Date updateDay) {
		this.updateDay = updateDay;
	}
	public String getUnseiName() {
		return unseiName;
	}
	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
	}
	public String getNegaigoto() {
		return negaigoto;
	}
	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}
	public String getAkinai() {
		return akinai;
	}
	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}
	public String getGakumon() {
		return gakumon;
	}
	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
	}

}
