package jp.co.bananadream.practice6.yanagawa.action;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.co.bananadream.practice6.yanagawa.dto.BirthdayBean;
import jp.co.bananadream.practice6.yanagawa.form.BirthdayForm;
import jp.co.bananadream.practice6.yanagawa.service.ResultService;

public class BirthdayListAction {


	@Resource
	protected HttpServletRequest request;

	@Resource
	protected HttpServletResponse response;

	@Resource
	protected HttpSession session;

	@Resource
	@ActionForm
	protected BirthdayForm birthdayForm;


	/**
	 * 入力された誕生日の過去半年間の
	 * 結果のリストを渡すメソッド
	 *
	 * @return　birthdayList.jsp
	 */
	@Execute(validator = false)
	public String birthdayList(){

		List<BirthdayBean> list = ResultService.getInstance().findSameBirthday(birthdayForm.birthday);
		BirthdayBean bean = null;

		List<BirthdayBean> list2 = new ArrayList<BirthdayBean>();

		for( int i=0; i<list.size(); i++){

			bean = new BirthdayBean();
			bean.setUpdateDay(list.get(i).updateDay);
			bean.setUnseiName(list.get(i).unseiName);
			bean.setAkinai(list.get(i).akinai);
			bean.setGakumon(list.get(i).gakumon);
			bean.setNegaigoto(list.get(i).negaigoto);

			list2.add(bean);

		}

		request.setAttribute("birthdayList", list2);

		return "birthdayList.jsp";

	}



}
