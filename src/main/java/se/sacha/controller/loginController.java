package se.sacha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="login")
public class loginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loginPage(Model model){
		return "login";
	}
	
	@RequestMapping(value = "submit",method = RequestMethod.POST)
	public String loginSUBMITPage(HttpSession ses,Model model,@RequestParam("id") String id, @RequestParam("pass")String pass){
		
		if(id.equals("1") && pass.equals("a")){
			ses.setAttribute("user", "user");
			return "/admin/adminstart";
		}else{
			return "redirect:/login";
		}
	}

	@RequestMapping(value = "logout",method = RequestMethod.GET)
	public String logOutPage(HttpSession ses){
		
		
		ses.removeAttribute("user");
		ses.invalidate();
		return "redirect:/";
	}
}
