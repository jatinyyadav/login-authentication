package com.jatin.springboot.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "hello, what are you learning today";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> HTML </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>my first html page with body</h1>");
		sb.append("</body>");
		sb.append("</html>");
	
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	
}
