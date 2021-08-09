package ojy.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
//	public LgTV() {
//		System.out.println("LgTV 객체 생성");
//	} 
//	public void powerOn() {
//		System.out.println("LgTV 전원을 켠다.");
//	}
//	public void powerOff() {
//		System.out.println("LgTV 전원을 끈다.");
//	}
//	private Speaker speaker; // 생성자 powerOn() powerOff() 메서드 생략 
//	public void volumeUp() { 
//		speaker.volumeUp();
//	} 
//	public void volumeDown() {
//		speaker.volumeDown(); 
//	}

}
