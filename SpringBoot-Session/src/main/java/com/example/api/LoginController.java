package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.AccountForm;
import com.example.domain.LoginForm;

@Controller
@RequestMapping(path="/")
public class LoginController {
	
	//@Component登録されたAccountFormをDIする。
	@Autowired
	protected AccountForm accountForm;

	@GetMapping
	public String viewLoginForm(Model model) {
		model.addAttribute(new LoginForm());
		return "LoginForm";
	}
	
	/**
	 * Session登録されたAccountFormに値をセット
	 * 
	 * @param loginForm
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping(path="/menu")
	public String viewPrintSession(LoginForm loginForm, 
			BindingResult result, Model model) {
		if(result.hasErrors()) 
			return "LoginForm";
		accountForm.setName(loginForm.getName());
		accountForm.setMsg(loginForm.getMsg());
		return "Menu";
	}
	
}
