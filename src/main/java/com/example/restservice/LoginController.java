package com.example.restservice;

//import java.util.concurrent.atomic.AtomicLong;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	// example.
//	private static final String template = "Hello, %s!";
//	private final AtomicLong counter = new AtomicLong();
	
	// 굳이 final로?
//	private static final String userIDtemplate = "%s";
//	private static final String pwTemplate = "%s";

	//@GetMapping("/login")
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public LoginResult greeting(@RequestParam(name = "userID") String userID
								, @RequestParam(name = "pw") String pw) {
		return new LoginResult(userID, pw);
	}
}