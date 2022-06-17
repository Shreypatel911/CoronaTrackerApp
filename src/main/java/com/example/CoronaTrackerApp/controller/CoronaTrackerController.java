package com.example.CoronaTrackerApp.controller;

import com.example.CoronaTrackerApp.services.CoronaTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CoronaTrackerController {

    @Autowired
    CoronaTrackerService coronaTrackerService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStates", coronaTrackerService.getFinalStats());
        return "home";
    }
}
