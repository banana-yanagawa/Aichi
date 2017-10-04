package jp.co.bananadream.practice6.yanagawa.action;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import jp.co.bananadream.practice6.yanagawa.dto.WariaiBean;
import jp.co.bananadream.practice6.yanagawa.form.WariaiForm;
import jp.co.bananadream.practice6.yanagawa.service.OmikujiService;
import jp.co.bananadream.practice6.yanagawa.service.ResultService;



public class WariaiAction {

	@Resource
	protected HttpServletRequest request;

	@Resource
	protected HttpServletResponse response;

	@Resource
	protected HttpSession session;

	@Resource
	@ActionForm
	protected WariaiForm wariaiForm;


	//メモ　SQLファイルを使うからBeanに詰めたものはそのまま使える

	/**
	 *
	 * @return
	 */

	@Execute(validator=false)
	public String wariai(){

		//半年分の各運勢の件数をリストに入れる
		List<WariaiBean> list = ResultService.getInstance().searchHarfWariai();

		//合計をBigDecimal型に変換
		BigDecimal all2 = new BigDecimal(ResultService.getInstance().hantoshiSum());
		DecimalFormat df = new DecimalFormat("##0.0%");

		for (WariaiBean bean : list) {

			//件数をBigDecimal型に変換
			BigDecimal cnt = new BigDecimal(bean.count);
			bean.setPersent(df.format(cnt.divide(all2,3,BigDecimal.ROUND_HALF_UP)));

		}


		//今日の各運勢の件数をリストに入れる
		List<WariaiBean> list2 = ResultService.getInstance().searchTodayWariai();

		BigDecimal all = new BigDecimal(ResultService.getInstance().todaySum());
		DecimalFormat df2 = new DecimalFormat("##0.0%");

		for (WariaiBean bean2 : list2) {

			BigDecimal cnt2 = new BigDecimal(bean2.count);
			bean2.setPersent(df2.format(cnt2.divide(all,3,BigDecimal.ROUND_HALF_UP)));

		}


		request.setAttribute("hantoshi", list);
		request.setAttribute("hantoshiSum", all2);
		request.setAttribute("day", OmikujiService.getInstance().today());
		request.setAttribute("todaySum", all);
		request.setAttribute("today", list2);

		return "wariai.jsp";

	}




}
