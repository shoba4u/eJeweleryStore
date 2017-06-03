package org.launchcode.controllers;

import org.launchcode.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Shoba on 5/11/2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(Model model) {

        model.addAttribute("loginCommand", new LoginCommand());

        return "loginform";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "loginform";
        }

        return "redirect:/";
    }
}
