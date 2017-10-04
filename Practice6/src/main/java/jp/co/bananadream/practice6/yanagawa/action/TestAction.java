package jp.co.bananadream.practice6.yanagawa.action;

import org.seasar.struts.annotation.Execute;

public class TestAction {


    @Execute(validator = false)
	public String index() {
        return "send.jsp";
	}

}
