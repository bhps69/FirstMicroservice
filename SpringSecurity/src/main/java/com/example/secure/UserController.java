package com.example.secure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("data")
	public String getData() {
		return "welcome to spring security";
	}
	@GetMapping("/account")
	public String displayAccount() {
		return "Welcome to your account";
	}
	@GetMapping("/update")
	public String updateAccount() {
		return "Your update is successful";
	}
	@GetMapping("/main")
	public String Main() {
		return "this is the main page";
	}
	@GetMapping("/balance")
	public String displayBalance() {
		return "your balance is displayed";
	}
}
