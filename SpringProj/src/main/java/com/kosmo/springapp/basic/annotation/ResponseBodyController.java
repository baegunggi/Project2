package com.kosmo.springapp.basic.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyController {
	//웹브라우저로 직접 출력하기	
	//방법1]반환타입은 void,매개변수는 서블릿 API사용-@ResponseBody어노테이션 미 사용
//	@RequestMapping("/Annotation/ResponseBody.do")
//	public void exec(HttpServletResponse resp) throws IOException {
//		//한글처리
//		resp.setContentType("text/html; charset=UTF-8");
//		//브라우저로 출력하기 위한 출력 스트림
//		PrintWriter out=resp.getWriter();
//		out.print("<h2>반환타입:void , 서블릿 API 사용:HttpServletResponse</h2>");
//		//스트림 닫기]
//		out.close();
//	}///////////////
	//방법2]반환타입 String ,서블릿 API 미사용 및 @ResponseBody어노테이션 사용
	@RequestMapping(value="/Annotation/ResponseBody.do",produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String exec() {
		//반환되는 문자열이 응답바디에 쓰인다
		//한글처리는 @RequestMapping에 produces = "text/html; charset=UTF-8" 컨텐트 타입 추가
		return "<h2>반환타입:String , 서블릿 API 未 사용 , @ResponseBody어노테이션 사용</h2>";
	}
}
