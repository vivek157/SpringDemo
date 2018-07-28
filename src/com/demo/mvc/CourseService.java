package com.demo.mvc;

import java.util.ArrayList;

public class CourseService {

	public ArrayList<String> getCourses(){
		ArrayList<String>courseList=new ArrayList<String>();
		courseList.add("Java");
		courseList.add(".Net");
		courseList.add("C++");
		
		return courseList;
		
		
	}
}
