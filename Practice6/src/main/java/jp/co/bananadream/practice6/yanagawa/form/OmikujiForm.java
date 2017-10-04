package jp.co.bananadream.practice6.yanagawa.form;

import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

public class OmikujiForm {

	public static OmikujiForm getInstance(){

		return new OmikujiForm();

	}

	@Required
	@DateType(datePatternStrict="yyyy-MM-dd")
	public String birthDay;



}
