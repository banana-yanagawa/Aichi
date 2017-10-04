/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
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




public class SendAction {

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
	public String re() {
        return "send.jsp";
	}


	@Execute(validator = false)
	public String send() {

		Send send = SendService.getInstance().sendSearch(sendForm.postelCode);

		SendBean bean = new SendBean();


		if(send != null){


					bean.setPostelCode(send.postelCode);
					bean.setAddress(send.address);

		}

		request.setAttribute("send",bean);

		return "send.jsp";

	}


	 @Execute(validator = false)
		public String jusho() {


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



	        return "send.jsp";
		}


	 @Execute(validator = false)
		public String poston() {

			Send send = SendService.getInstance().sendSearch(sendForm.postelCode);

			SendBean bean = new SendBean();

			if(send != null){

						bean.setAddress(send.address);

			}

			String post = bean.getAddress();


			return post;

		}




//	 @Execute(validator = false)
//		public String juju() {
//
//
//			List<Send> send2 = SendService.getInstance().addressSearch(sendForm.address);
//
//			SendBean bean2 = null;
//
//			List<SendBean> list = new ArrayList<SendBean>();
//
//
//			if(send2 != null){
//
//				for( int i=0; i<send2.size(); i++){
//
//					bean2 = new SendBean();
//					bean2.setPostelCode(send2.get(i).postelCode);
//					bean2.setAddress(send2.get(i).address);
//
//					list.add(bean2);
//
//
//				}
//
//
//
//			}
//
//			request.setAttribute("test",list);
//
//
//
//	        return "subWindow.jsp";
//		}
//
//


	 @Execute(validator = false)
		public String finish() {
	        return "finish.jsp";
		}



//	for( int i=0; i<send.size(); i++){
//
//		bean.setPostalCode(send.get(i).postelCode);
//		bean.setKen(send.get(i).ken);
//		bean.setAddress(send.get(i).address);
//		bean.setAddress2(send.get(i).address2);










}
