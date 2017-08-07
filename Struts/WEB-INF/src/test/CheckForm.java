package test;

import org.apache.struts.validator.ValidatorForm;

public class CheckForm extends ValidatorForm {

	String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
