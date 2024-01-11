package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api")
public class WebController {
    @GetMapping(value = "/getmessage")
    public String getMessage() {
        return "index";
    }
    @GetMapping("/getallstudents")
    public String getAllStudents(Model model) {
        List<String> students = new ArrayList<>(Arrays.asList(
                "Komil", "Obid", "Odil", "Botir", "Mirziyo"
        ));
        model.addAttribute("students", students);
        return "index";
    }
}
