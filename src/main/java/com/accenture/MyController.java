package com.accenture;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/validateUser")
	public Principal user(Principal user) {
		return user;
	}
}
