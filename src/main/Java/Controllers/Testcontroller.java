package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {
	
	
	@RequestMapping("/test")
	public String sayHello() {
		
return "Hellosearch";	}

}
