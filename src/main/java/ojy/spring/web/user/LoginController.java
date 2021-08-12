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
		System.out.println("�α��� ȭ������ �̵�");
		vo.setId("");
		vo.setPassword("");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("�α��� ���� ó��");
		UserVO user = userDAO.getUser(vo);
		if(user != null){
			session.setAttribute("userName", user.getName());
			return "getBoardList.do"; //�α����� ���������� �̷������ getBoardList.jsp�� �����̷�Ʈ
		}else{
			return "login.jsp"; //�α��� ���н�
		}

	}
		

}
