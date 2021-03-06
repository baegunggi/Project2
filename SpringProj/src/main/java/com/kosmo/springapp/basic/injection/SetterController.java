package com.kosmo.springapp.basic.injection;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SetterController {
	/*현재 클래스가 Person객체 필요]
	-new하지않고 세터를 통해서 주입 받자*/
	//STEP1]멤버변수(속성) 선언*/
	private Person personType,personProperty;	
	
	@Resource(name="personType")//빈 설정파일의 id속성에 지정한 값과 일치
	@Qualifier("perosn1")
	public void setPersonType(Person personType) {
		this.personType = personType;
	}//////////////
	@Resource(name="personProperty")//빈 설정파일의 id속성에 지정한 값과 일치
	@Qualifier("perosn3")
	public void setPersonProperty(Person personProperty) {
		this.personProperty = personProperty;
	}///////////////////////
	//컨트롤러 메소드]
	@RequestMapping("/Injection/Setter.do")
	public String execute(Map map) {
		//데이타 저장]
		map.put("personInfo",personType+"<br/>"+personProperty);
		//뷰정보 반환
		return "injection05/Injection";
	}
}
