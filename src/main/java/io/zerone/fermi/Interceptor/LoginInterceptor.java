package io.zerone.fermi.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	/*
	 * afterCompletion : Controller에서 return이 끝난 후 호출. 화면 처리가 끝난 후
	 * postHandle : Controller가 요청을 처리하고 response가 나가기 직전. return 직전에 호출.
	 * preHandle : Contorller가 받기 전에 처리
	 */
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String user_id = (String)session.getAttribute("user_id");
		
		if(user_id == null) {
			response.sendRedirect(request.getContextPath() + "/signin");
//			response.sendRedirect("/fermi/signin");
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
	
	
	
	
}
