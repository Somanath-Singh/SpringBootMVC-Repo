package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;


@Controller
public class WishMessegeOperationController {

	@Autowired
	private IWishService service;
	
	@RequestMapping("/home")
	public String showHomePage() {
		//return LVN
		return "welcome";
	}
	
	
	/*	@RequestMapping("/wish")
		public ModelAndView fetchWishMessege() {
			
			//use servicefo
			String msg=service.generateWishMessage();
			//keep result and other data as Model attributes in MAV object
			ModelAndView mav=new ModelAndView();
			mav.addObject("wMsg",msg);//attribute name, value
			mav.addObject("sysDate",new Date());//attribute name, value
			mav.setViewName("show_result");
			//return MAV
			return mav;
			
		}*/
	
	
	/*@RequestMapping("/wish")
	public String fetchWishMessege(HashMap<String,Object> map) {
		System.out.println("shared memory object class name::"+map.getClass());
		//use servicefo
		String msg=service.generateWishMessage();
		//keep data into model attribute
		map.put("wMsg", msg);
		map.put("sysDate", new Date());
		//return MAV
		return "show_result";
		
	}*/
	
	
	/*@RequestMapping("/wish")
	public String fetchWishMessege(Model model) {
		System.out.println("shared memory object class name::"+model.getClass());
		//use servicefo
		String msg=service.generateWishMessage();
		//keep data into model attribute
		model.addAttribute("wMsg", msg);
		model.addAttribute("sysDate", new Date());
		//return MAV
		return "show_result";
		
	}*/
	
	/*@RequestMapping("/wish")
	public String fetchWishMessege(ModelMap map) {
		System.out.println("shared memory object class name::"+map.getClass());
		//use servicefo
		String msg=service.generateWishMessage();
		//keep data into model attribute
		map.addAttribute("wMsg", msg);
		map.addAttribute("sysDate", new Date());
		//return MAV
		return "show_result";
		
	}*/
	
	
	@RequestMapping("/wish")
	public String fetchWishMessege(Map<String,Object> map) {
		System.out.println("shared memory object class name::"+map.getClass());
		//use servicefo
		String msg=service.generateWishMessage();
		//keep data into model attribute
		map.put("wMsg", msg);
		map.put("sysDate", new Date());
		//return MAV
		return "show_result";
		
	}
	
}
