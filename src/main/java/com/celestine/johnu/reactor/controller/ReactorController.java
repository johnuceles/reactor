package com.celestine.johnu.reactor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactorController {

	@GetMapping("testReactor")
	public String testReactor() {
		return "You hit the reactor!";
	}
}
