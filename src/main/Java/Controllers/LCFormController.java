package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import LCapi.userinfoDTO;

@Controller
public class LCFormController {
	
	@RequestMapping("/")
	public String Homepage(@ModelAttribute("userinfo") userinfoDTO uDtO) {
	
		return "Homepage";
	}
	
	@RequestMapping("/process-homepage")
	public String result(@ModelAttribute("userinfo") userinfoDTO uDTO) {
		
		
		
		return "resultPage";
	}
	
	

}
