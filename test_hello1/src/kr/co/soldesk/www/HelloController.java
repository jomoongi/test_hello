package kr.co.soldesk.www;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//ModelAndView : Model+View
		//Model : 전달할 데이터
		//View : 찾아갈 view의 이름(주소)
		
		ModelAndView mav=new ModelAndView();
		
		//test
		
		/*mav.addObject("속성", "전달값");*/
		mav.addObject("msg", "안녕하세요");//안녕하세요 라는 값이 msg에 담긴다.
		mav.setViewName("hello");//hello만 넘어간다.
		
		return mav;
	}
	
}
