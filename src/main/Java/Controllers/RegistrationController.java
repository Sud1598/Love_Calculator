 package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import LCapi.registrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String doregistartion(@ModelAttribute("userReg") registrationDTO rDTO ) {
		
		return "Registration";
	}

	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg") registrationDTO rDtO) {
		
		return "registration-success";
		
	}
}


