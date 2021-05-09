package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.AccountForm;

@Controller
public class SessionController {
	
	//セッション機能によりBeanに値が登録されている。
	@Autowired
	AccountForm accountForm;

	@GetMapping(path="/viewSession")
	public String viewSession(Model model) {
		model.addAttribute("name", accountForm.getName());
		model.addAttribute("msg", accountForm.getMsg());
		return "Session";
	}
}
