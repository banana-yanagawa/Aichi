package test;

import org.apache.struts.action.ActionForm;

public class WariaiForm extends ActionForm {

		public static WariaiForm getInstance(){

			return new WariaiForm();

		}

	String birthday;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
