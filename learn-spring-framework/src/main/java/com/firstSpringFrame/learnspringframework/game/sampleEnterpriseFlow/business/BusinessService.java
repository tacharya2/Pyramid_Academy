package com.firstSpringFrame.learnspringframework.game.sampleEnterpriseFlow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstSpringFrame.learnspringframework.game.sampleEnterpriseFlow.data.DataService;

// Business logic
@Component
public class BusinessService {
	@Autowired
	private DataService dataService;
	
	public Integer logic() {

		// String result = "";
		List<Integer> list = dataService.solution();
		Integer reduce = list.stream().reduce(Integer::sum).get();// .get() for list
		return reduce;

//		for (int i = 1; i < 13; i++) {
//			for (int j = 0; j < 13; j++) {
//				result += i + " x " + j + " = " + (Integer.valueOf(i * j) + "<br/>");
//			}
//		}
//		return result;
	}
}