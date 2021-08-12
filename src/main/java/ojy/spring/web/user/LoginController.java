package ojy.spring.web.user;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ojy.spring.web.user.impl.UserDAO;
@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("");
		vo.setPassword("");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("로그인 인증 처리");
		UserVO user = userDAO.getUser(vo);
		if(user != null){
			session.setAttribute("userName", user.getName());
			return "getBoardList.do"; //로그인이 성공적으로 이루어지면 getBoardList.jsp로 리다이렉트
		}else{
			return "login.jsp"; //로그인 실패시
		}

	}
		

}
