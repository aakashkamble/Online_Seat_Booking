package Capg.OnlineSeatBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Capg.OnlineSeatBooking.entity.Register;
import Capg.OnlineSeatBooking.service.RegisterService;


@Controller
public class RegisterGreetingController {
	@Autowired
	private RegisterService service;
	
	@GetMapping("/register")
	public String greetingForm(Model model) {
	    model.addAttribute("register", new Register());
	    return "register";
	  }
	@PostMapping("/register")
	 public String greetingSubmit(@ModelAttribute Register register, Model model) {
		    model.addAttribute("register", register);
		    service.registerData(register);
		    return "result";
		  }

}
