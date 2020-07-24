package com.example.controller;

import com.example.domain.Game;
import com.example.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    private ArrayList<Game> listOfGames = new ArrayList<>();

    @PostMapping("/")
    public String create(Model model,
                         //@AuthenticationPrincipal User user,
                         @RequestParam(value = "comment") String comment
    ) {
        //listOfGames.add(new Game(user, comment));
        //model.addAttribute( listOfGames);
        //System.out.println(comment);
        //System.out.println(user);
        return "main";
    }

    @GetMapping("/")
    public String main(@AuthenticationPrincipal User user,
                       Model model) {
        model.addAttribute("listOfGames",  listOfGames);
        return "main";
    }

    @GetMapping("/index")
    public ModelAndView index(Model model) {
        //model.addAttribute("listOfGames",  listOfGames);
        ModelAndView index = new ModelAndView();
        return index;
    }

    @GetMapping("/second")
    public String second(@AuthenticationPrincipal User user,
                         Model model) {
        model.addAttribute("user",  user);
        return "second";
    }

    @GetMapping("/login")
    public String login(Model model) {
        //model.addAttribute("listOfGames",  listOfGames);
        return "login";
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