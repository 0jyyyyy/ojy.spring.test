package ojy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import ojy.spring.web.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		//1.사용자 입력 정보 추출
		String id= request.getParameter("id");
		String password = request.getParameter("password");
		
		//2. 데이터베이스 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
		//3. 화면 네비게이션
		ModelAndView mav = new ModelAndView();
		if(user != null){
			mav.setViewName("redirect:getBoardList.do"); //로그인이 성공적으로 이루어지면 getBoardList.jsp로 리다이렉트
		}else{
			mav.setViewName("redirect:login.jsp"); //로그인 실패시
		}
		return mav;
	}

}
