package com.hpe.pointnext.appex.appsdev2.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/initiative")
public class InitiativeController {

	@GetMapping(path = "/")
	public String getInitiatives() {
		return "Hello Team";
	}

}
