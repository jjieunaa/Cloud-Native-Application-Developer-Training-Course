package kr.kwangan2.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}
	
	@GetMapping("/member")
	public String member() {
		return "/member";
	}
	
	@GetMapping("/manager")
	public String manager() {
		return "/manager";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "/admin";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "/loginSuccess";
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "/accessDenied";
	}

}	// class
