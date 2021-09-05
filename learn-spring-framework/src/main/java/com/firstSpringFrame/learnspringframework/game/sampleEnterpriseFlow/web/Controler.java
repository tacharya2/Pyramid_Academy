package com.firstSpringFrame.learnspringframework.game.sampleEnterpriseFlow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstSpringFrame.learnspringframework.game.sampleEnterpriseFlow.business.BusinessService;

// Send the response in the expected format

/*What @RestController will do?
Spring 4.0 introduced the @RestController annotation in order to simplify 
the creation of RESTful web services. It's a convenient annotation that combines
@Controller and @ResponseBody, which eliminates the need to annotate every request
handling method of the controller class with the @ResponseBody annotation */

// Organize imports: (Ctrl + Shift, 2)

@RestController // Refer above note
class Controler {
	// "/sum" ==> 100; When the web application page has a with /sum, return with
	// response 100 in there

	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public String displaySum() {
		return (String.valueOf(businessService.logic()));
		// return businessService.buildLogic(a, b);
	}
}

