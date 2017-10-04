package jp.co.bananadream.practice6.yanagawa.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.co.bananadream.practice6.yanagawa.dto.OmikujiBean;
import jp.co.bananadream.practice6.yanagawa.entity.Omikuji;
import jp.co.bananadream.practice6.yanagawa.entity.Result;
import jp.co.bananadream.practice6.yanagawa.form.OmikujiForm;
import jp.co.bananadream.practice6.yanagawa.service.OmikujiService;



public class OmikujiAction {

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected HttpServletResponse response;

	@Resource
	protected HttpSession session;

	@Resource
	@ActionForm
	protected OmikujiForm omikujiForm;

	@Execute(validator = true , input = "index.jsp")
	public String result(){
		//String bday = (String)request.getParameter("birthDay");

		Result result = OmikujiService.getInstance().findSameResult(omikujiForm.birthDay);

		if(result != null){

			Omikuji omikuji = OmikujiService.getInstance().setOmikuji(result.omikujiId);
			OmikujiBean bean = new OmikujiBean();

			if(omikuji != null){

				bean.setUnsei(omikuji.unsei.unseiName);
				bean.setAkinai(omikuji.akinai);
				bean.setGakumon(omikuji.gakumon);
				bean.setNegaigoto(omikuji.negaigoto);

			}

			request.setAttribute("result", bean);
			request.setAttribute("birthday", omikujiForm.birthDay);


		}else{


			Omikuji omikuji = OmikujiService.getInstance().choiceOmikuji();
			OmikujiBean bean = new OmikujiBean();

			if(omikuji != null){

				bean.setUnsei(omikuji.unsei.unseiName);
				bean.setAkinai(omikuji.akinai);
				bean.setGakumon(omikuji.gakumon);
				bean.setNegaigoto(omikuji.negaigoto);

			}

			request.setAttribute("result", bean);

			OmikujiService.getInstance().insertResult(omikujiForm.birthDay);
			request.setAttribute("birthday", omikujiForm.birthDay);

		}

		return "result.jsp";

	}






}

