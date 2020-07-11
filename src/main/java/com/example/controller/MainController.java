package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Model model) {
        return "main";
    }

    @GetMapping("/")
    public String basic(Model model) {
        return "index";
    }


    @RequestMapping(value = "/sendMove", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> sendMove(@RequestParam(value = "x") int x,
                                @RequestParam(value = "y") int y,
                                @RequestParam(value = "direction") String direction) {
        Map<String, Object> answer = new HashMap<>();
        answer.put("x", (int) (1 + Math.random() * 11));
        answer.put("y", (int) (1 + Math.random() * 11));
        answer.put("direction", direction);

        return answer;
    }



}