package se.sacha.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest req,
			HttpServletResponse res, Object handler) throws Exception {
		// TODO Auto-generated method stub
		
		if(req.getSession().getAttribute("user") !=null){
			System.out.println("i genom interceptorn");
			return true;
		}
		System.out.println("ej user");
		res.sendRedirect("/myblogg");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest req,
			HttpServletResponse res, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
