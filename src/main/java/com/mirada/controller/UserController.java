package com.mirada.controller;

import com.mirada.dto.UserDTO;
import com.mirada.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());
        return "/user/create";
    }


    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") @Valid UserDTO user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            return "/user/create";
        }

        userService.save(user);
        return "redirect:/user/create";

    }
}