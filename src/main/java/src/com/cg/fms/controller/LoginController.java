package src.com.cg.fms.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;
import src.com.cg.fms.service.ILoginService;
@Controller
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	@RequestMapping("/loginControllerindex.obj")
	public String showIndex(){
		return "index";
	}
	
	
	@RequestMapping("/loginControllerlogin.obj")
	public String showLoginPage(Model model){
		model.addAttribute("employee",new Employee());
		return "login";
	}
	
	@RequestMapping("/loginControllervalidateLogin.obj")
	public ModelAndView validateRole(@ModelAttribute("employee") @Valid Employee employee, BindingResult result) throws FeedbackException{
		
		ModelAndView modelAndView = new ModelAndView();
	    employee = loginService.getRole(employee);
		if(employee == null){
			modelAndView.addObject("message", "Enter Valid Credentials");
			modelAndView.addObject("employee",new Employee());
			modelAndView.setViewName("login");
			return modelAndView;
		}
		
		modelAndView.addObject("employee", employee);
		if(employee.getRole().equals("admin")){
			modelAndView.addObject("admin",true);
			modelAndView.setViewName("adminHome");
		}else if(employee.getRole().equals("coordinator")){
			modelAndView.addObject("coordinator",true);
			modelAndView.setViewName("coordinatorHome");
		}else if(employee.getRole().equals("participant")){
			modelAndView.setViewName("participantHome");
		}
		return modelAndView;
		
	}
	@RequestMapping("/admin.obj")
	public String showAdminPage(Model model){
		//model.addAttribute("employee",new Employee());
		return "adminHome";
	}
	@RequestMapping("/coordinator.obj")
	public String showCoordinatorPage(Model model){
		//model.addAttribute("employee",new Employee());
		return "coordinatorHome";
	}
	@RequestMapping("/participant.obj")
	public String showParticipantPage(Model model){
		model.addAttribute("employee",new Employee());
		return "participantHome";
	}
	
}
