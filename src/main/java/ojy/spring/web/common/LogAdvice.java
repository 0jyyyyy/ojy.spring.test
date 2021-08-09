package ojy.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect //Asepect = Pointcut + Advice
public class LogAdvice {
	@Pointcut("execution(* ojy.spring.web..*Impl.*(..))")
	public void allPointcut() {

	}
	@Before("allpointcut()")
	public void printLog() {
		System.out.println("[���� �ε�] : ����Ͻ� ���� ���� �� ����");
	}
	@Pointcut("execution(* ojy.spring.web..*Impl.get*(..))")
	public void getPointcut() {
		
	}
}
