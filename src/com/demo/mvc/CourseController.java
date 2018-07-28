package com.demo.mvc;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*@Controller*/
public class CourseController extends AbstractController {
   // @Autowired
	private CourseService cs;
	
 
	
	  
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("IN CourceController");
		cs=new CourseService();
		ArrayList<String>courseList=cs.getCourses();
		System.out.println("ArrayList get0 "+courseList.get(0));
		
		return new ModelAndView("show", "AL", courseList);
	}
    
   /* @RequestMapping(value= "/course.demo")
	protected String getCourses(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("IN CourceController");
		ArrayList<String>courseList=cs.getCourses();
		System.out.println("ArrayList get0 "+courseList.get(0));
		request.setAttribute("AL",courseList);
		return "show";
		
	}
	*/

}
