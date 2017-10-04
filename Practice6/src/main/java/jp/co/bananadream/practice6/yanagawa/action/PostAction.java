package jp.co.bananadream.practice6.yanagawa.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import jp.co.bananadream.practice6.yanagawa.dto.SendBean;
import jp.co.bananadream.practice6.yanagawa.entity.Send;
import jp.co.bananadream.practice6.yanagawa.form.SendForm;
import jp.co.bananadream.practice6.yanagawa.service.SendService;

public class PostAction {

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected HttpServletResponse response;

	@Resource
	protected HttpSession session;

	@Resource
	@ActionForm
	protected SendForm sendForm;

	@Execute(validator = false)
	public String poston() {

		Send send = SendService.getInstance().sendSearch(sendForm.postelCode);

		SendBean bean = new SendBean();

		if(send != null){

					bean.setAddress(send.address);

		}

		String post = bean.getAddress();
		ResponseUtil.write(post);

		return null;

	}


}
