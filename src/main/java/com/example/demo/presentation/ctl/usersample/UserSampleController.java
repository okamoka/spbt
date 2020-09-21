package com.example.demo.presentation.ctl.usersample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usersample")
public class UserSampleController {
   @GetMapping
   String list() {
       return "usersample/users";
   } 
}
