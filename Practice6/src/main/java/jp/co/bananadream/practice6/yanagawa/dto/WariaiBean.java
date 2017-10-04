package jp.co.bananadream.practice6.yanagawa.dto;

public class WariaiBean {

	public String unseiName;
	public int count;
	public String persent;



	public String getPersent() {
		return persent;
	}

	public void setPersent(String persent) {
		this.persent = persent;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getUnseiName() {
		return unseiName;
	}

	public void setUnseiName(String unseiName) {
		this.unseiName = unseiName;
	}

//	public String getGoukei() throws SQLException {
//
//		double goukei = (double)this.goukei;
//
//		if(Wariai.getInstance().todaySum() < Wariai.getInstance().hantoshiSum() ){
//
//			String gou = String.format ("%.1f",( (double)goukei / (double)Wariai.getInstance().todaySum()) *100) ;
//
//			return gou;
//
//		}else{
//
//			String gou = String.format ("%.1f",( (double)goukei / (double)Wariai.getInstance().hantoshiSum()) *100) ;
//
//			return gou;
//
//		}

//	}


//
//	public void setGoukei(int goukei) {
//		this.goukei = goukei;
//	}



}
