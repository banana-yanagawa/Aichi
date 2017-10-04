package jp.co.bananadream.practice6.yanagawa.dto;


public class OmikujiBean {

	 public int omikujiId;
	 public String unseiName;
	 public String unsei;
	 public String negaigoto;
	 public String akinai;
	 public String gakumon;




	public static OmikujiBean getInstance(){
		return new OmikujiBean();
	}

	public int getOmikujiId() {
		return omikujiId;
	}

	public void setOmikujiId(int omikujiId) {
		this.omikujiId = omikujiId;
	}

	public String getUnseiName() {
		return unseiName;
	}

	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
	}

	public void setUnsei(String unsei) {
		this.unsei = unsei;
	}

	public String getUnsei() {
		return unsei;
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



