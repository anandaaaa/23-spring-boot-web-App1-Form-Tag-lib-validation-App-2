package in.anand.controller;

import javax.script.Bindings;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.anand.binding.user;

@Controller
public class UserController {
	
	@GetMapping("/loadform")
	public String loadForm(Model model){
		
		
		  user userobj = new user();
		  
		  model.addAttribute("user","userobj");
		  
		 return "index";
		
		
	}
	@PostMapping("/saveuser")
	public String saveUser(@Valid user user,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "index";
		}
		
		model.addAttribute("msg", "message inserted successfull");
		
		return "dashbord";
	}
	

}
