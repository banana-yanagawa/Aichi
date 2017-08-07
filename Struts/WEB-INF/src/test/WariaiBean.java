package test;

public class WariaiBean {

	String unseiName;
	String wariai;

	public String getWariai() {
		return wariai;
	}

	public void setWariai(String wariai) {
		this.wariai = wariai;
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
