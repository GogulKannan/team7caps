package edu.iss.caps.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.iss.caps.model.Courses;
import edu.iss.caps.model.Lecture;
import edu.iss.caps.service.showallle;



@Controller
@RequestMapping("/L")

public class myfirstcontroller {
	
	
	@Autowired
	private showallle sh; 
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView employeeListPage() {
		ModelAndView mav = new ModelAndView("le-list");
		List<Lecture> employeeList =sh.findAlllec() ;
		mav.addObject("List", employeeList);
		return mav;
	}
	
	@RequestMapping(value = "/v", method = RequestMethod.GET)
	public ModelAndView viewtaught() {
		ModelAndView mav = new ModelAndView("courselist");
		List<Courses> course =sh.allcourse() ;
		mav.addObject("list", course);
		return mav;
	}
//	
//	@RequestMapping(value = "/viewenrolmentstatus", method = RequestMethod.GET)
//	public ModelAndView employeeListPage() {
//		ModelAndView mav = new ModelAndView("le-list");
//		List<Lecture> employeeList =sh.findAlllec() ;
//		mav.addObject("List", employeeList);
//		return mav;
//	}
//	
//	
//	
//	@RequestMapping(value = "/gradestudents", method = RequestMethod.GET)
//	public ModelAndView employeeListPage() {
//		ModelAndView mav = new ModelAndView("le-list");
//		List<Lecture> employeeList =sh.findAlllec() ;
//		mav.addObject("List", employeeList);
//		return mav;
//	}
//	
//	
//	@RequestMapping(value = "/viewstudentperformance", method = RequestMethod.GET)
//	public ModelAndView employeeListPage() {
//		ModelAndView mav = new ModelAndView("le-list");
//		List<Lecture> employeeList =sh.findAlllec() ;
//		mav.addObject("List", employeeList);
//		return mav;
//	}
	
	
	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String logic(Model model) {
		//model.addAttribute("user");
		return "index";
	}

}
