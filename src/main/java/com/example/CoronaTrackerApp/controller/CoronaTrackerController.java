package com.example.CoronaTrackerApp.controller;

import com.example.CoronaTrackerApp.models.LocationStats;
import com.example.CoronaTrackerApp.services.CoronaTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CoronaTrackerController {

    @Autowired
    CoronaTrackerService coronaTrackerService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> finalStatesList = coronaTrackerService.getFinalStats();
        int totalCases = finalStatesList.stream().mapToInt(LocationStats::getLatestTotalCases).sum();
        model.addAttribute("locationStats", finalStatesList);
        model.addAttribute("totalReportedCases", totalCases);

        return "home";
    }
}
