package ojy.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import ojy.spring.web.user.UserVO;
@Service
@Aspect
public class AfterReturningAdvice {
	@Pointcut("execution(* ojy.spring.web..*Impl.get*(..))")
	public void getPointcut() {
		
	}
	@AfterReturning(pointcut = "getPointcut()",returning = "returnObj")
	public void afterLog(JoinPoint joinPoint, Object returnObj)throws Throwable {
		String method = joinPoint.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO)returnObj;
			if(user.getRole().equals("admin")) {
				System.out.println(user.getName() + "로그인(관리자)");
			}
			
		}
		System.out.println("[사후처리] : " + method + "()메서드의 리턴값 : " + returnObj.toString());
	}
}
