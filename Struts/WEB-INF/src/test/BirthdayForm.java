package test;

import org.apache.struts.action.ActionForm;

public class BirthdayForm extends ActionForm {

	public static BirthdayForm getInstance(){

		return new BirthdayForm();

	}

	String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
