package jp.co.bananadream.practice6.yanagawa.form;

import org.apache.struts.action.ActionForm;

public class WariaiForm extends ActionForm {

		public static WariaiForm getInstance(){

			return new WariaiForm();

		}

	String birthday;


}
