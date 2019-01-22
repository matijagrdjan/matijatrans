package com.example.matijatrans.controller;

import com.example.matijatrans.service.LineService;
import com.example.matijatrans.templeteObjects.Greske;
import com.example.matijatrans.templeteObjects.StationsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
public class IndexController {


    @Autowired
    public LineService lineService;


    public Greske greske;


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("stationsTemplate", new StationsTemplate());


        return "index";

    }


    @PostMapping(value = "post")
    public String postStations(@ModelAttribute StationsTemplate stationsTemplate, Model model) {

        try {
            model.addAttribute("trips", lineService.getlinebyfirstStationAndLastStation(
                    stationsTemplate.getFirstStation().toUpperCase(), stationsTemplate.getLastStation().toUpperCase()));

            return "index";

        } catch (Exception e) {

            return "index";
        }


    }


}