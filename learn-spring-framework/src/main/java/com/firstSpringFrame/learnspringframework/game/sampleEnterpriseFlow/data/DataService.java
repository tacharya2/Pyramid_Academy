/****************************************************************************************************
 NOTE: You can start using a same class with class Class and later refactor it
 using Ctrl + 1 and using move the current class to its own package and updating the package uisng 
 class name follow this to expand even batter. Don't forget to organize the imports using 
 Ctrl + Shift + o
 
 ***************************************************************************************************/
package com.firstSpringFrame.learnspringframework.game.sampleEnterpriseFlow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

// Getting data from database
@Component
public class DataService {
	public List<Integer> solution() {
		return Arrays.asList(12, 15, 99, 45, 32, 18);
	}
}
/*
 * Go to view menu Package Presentation Hierarchical
 */