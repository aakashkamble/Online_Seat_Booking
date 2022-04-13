package Capg.OnlineSeatBooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Capg.OnlineSeatBooking.entity.Register;
import Capg.OnlineSeatBooking.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@GetMapping("/registration")
	public String getRegisterPage(Model model)
	{
		model.addAttribute("register", new Register());
		return "registration";
	}
	@PostMapping("/submitForm")
	public String register(@ModelAttribute Register register, Model model) {
		service.registerData(register);
		model.addAttribute("result", "Success");
		return "success";
	}
}
