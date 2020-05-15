package Controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String result(@Valid @ModelAttribute("userinfo") userinfoDTO uDTO, BindingResult result) {
		
		if (result.hasErrors()) {
	
			List<ObjectError> allErrors=result.getAllErrors();
			
			for (ObjectError temp : allErrors) {
				
				System.out.println(temp);
				
			}
			
			return "Homepage";
			
		}
		
		else {
		return "resultPage";}
	}
	
	

}
