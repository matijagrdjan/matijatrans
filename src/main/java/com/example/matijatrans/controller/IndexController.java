package com.example.matijatrans.controller;

import com.example.matijatrans.service.LineService;
import com.example.matijatrans.templeteObjects.StationsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
public class IndexController {




    @Autowired
    public LineService lineService;


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("stationsTemplate", new StationsTemplate());


        return "index";

    }



    @RequestMapping(value = "post")
    public String postStations(@ModelAttribute StationsTemplate stationsTemplate, Model model, Errors errors){

        if(errors.hasErrors()){
            return "index";
        }

        model.addAttribute("trips", lineService.getlinebyfirstStationAndLastStation( stationsTemplate.getFirstStation(), stationsTemplate.getLastStation()));

        return "index";

    }











}