package jp.co.bananadream.practice6.yanagawa.form;

import org.apache.struts.action.ActionForm;

public class BirthdayForm extends ActionForm {

	public static BirthdayForm getInstance(){

		return new BirthdayForm();

	}


	public String birthday;


}
