
package jp.co.bananadream.practice6.yanagawa.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.co.bananadream.practice6.yanagawa.dto.SendBean;
import jp.co.bananadream.practice6.yanagawa.entity.Send;
import jp.co.bananadream.practice6.yanagawa.form.SendForm;
import jp.co.bananadream.practice6.yanagawa.service.SendService;

public class WindowAction {


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
		public String window() {


			List<Send> send2 = SendService.getInstance().addressSearch(sendForm.address);

			SendBean bean2 = null;

			List<SendBean> list = new ArrayList<SendBean>();


			if(send2 != null){

				for( int i=0; i<send2.size(); i++){

					bean2 = new SendBean();
					bean2.setPostelCode(send2.get(i).postelCode);
					bean2.setAddress(send2.get(i).address);

					list.add(bean2);


				}



			}

			request.setAttribute("test",list);



	        return "subWindow.jsp";
		}

}
