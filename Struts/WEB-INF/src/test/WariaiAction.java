package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class WariaiAction extends Action {

	public ActionForward execute(ActionMapping mapping,
			ActionForm form, HttpServletRequest request, HttpServletResponse response)

			throws Exception {


			request.setAttribute("wariai", Wariai.getInstance().today());

			request.setAttribute("day", Wariai.date());

			request.setAttribute("wariai2", Wariai.getInstance().todaySum());

			request.setAttribute("wariai3", Wariai.getInstance().hantoshi());

			request.setAttribute("wariai4", Wariai.getInstance().hantoshiSum());



			return mapping.findForward("success");



	}


}
