package springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springmvc.Model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/register")
	public String showFom() {
		
		return "contact";
	}
	
	@RequestMapping("/insert")
	public String saveUser(@ModelAttribute User user, Model model) {
		this.service.insetUser(user);
		return "index1";
	}
	@RequestMapping("/update1")
	public String updateUser(@ModelAttribute User user, Model model) {
		this.service.updateUser(user);
		return "index1";
	}
	@RequestMapping("/update/{id}")
	public String saveUser(@PathVariable("id") int id, Model model) {
    User u=this.service.getUserById(id);
    
    model.addAttribute("user",u);
		return "updateForm";
	}
	@RequestMapping("/getAll")
	public String getAllUsers(Model model){
		List<User> list=this.service.getAllUsers();
		model.addAttribute("list", list);
		return "index1";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model){
	
		this.service.delete(id);
		return "index1";
	}
}
