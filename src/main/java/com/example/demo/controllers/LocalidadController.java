package com.example.demo.controllers;

import com.example.demo.Greeting;
import com.example.demo.entities.Location;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/local")
public class LocalidadController {


    @RequestMapping(value = "/crear" , method =  RequestMethod.GET)
    public String crear(Model model){
        model.addAttribute("location",new Location());
        return "crear";
    }

    @PostMapping("/crear")
    public String greetingSubmit(@ModelAttribute Location location, Model model) {
        model.addAttribute("location", location);
        String msg = "Location saved with id: " + location.getId();
        model.addAttribute("msg", msg);
        return "crear";
    }

}
