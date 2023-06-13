package com.example.demo.controllers;

import com.example.demo.entities.Location;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OtroController {

    @RequestMapping(value = "/crear" , method =  RequestMethod.GET)
    public String crear(Model model){
        model.addAttribute("location",new Location());
        return "crear";
    }


}
