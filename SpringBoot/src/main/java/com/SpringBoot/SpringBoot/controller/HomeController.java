package com.SpringBoot.SpringBoot.controller;


import com.SpringBoot.SpringBoot.Data.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String getReponse()
    {
        return "HEllo World";
    }

    @RequestMapping( value = "/user" ,method = RequestMethod.POST)
    public User getUser()
    {
        User user = new User();
        user.setId(1);
        user.setName("Sanchit");
        user.setEmail("Sanchit@email.com");
        return user;
    }

    @GetMapping( "/{id}/{id2}")
    public String greet(@PathVariable("id") String name ,@PathVariable("id2") String id)
    {
        return "Welcome, "+ name +" : "+ id;
    }

    @GetMapping("/requestParam")
    public String getDetails(@RequestParam String name ,@RequestParam(name = "email") String emailId)
    {
        return " name of the user is :"+ name +" and EmailId : "+ emailId;
    }


}
