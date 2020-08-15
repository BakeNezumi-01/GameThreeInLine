package com.example.controller;

import com.example.domain.Game;
import com.example.domain.Greeting;
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

    private final ArrayList<Game> listOfGames = new ArrayList<>();

    @PostMapping("/")
    public String create(Model model,
                         @AuthenticationPrincipal User user,
                         @ModelAttribute Game game,
                         @RequestParam(value = "comment") String comment
    ) {
       listOfGames.add(game);
        model.addAttribute("listOfGames",  listOfGames);
        model.addAttribute("game", new Game());
        model.addAttribute("user", user);
        System.out.println(comment);
        System.out.println(user);
        return "main";
    }

    @GetMapping("/")
    public String main(@AuthenticationPrincipal User user,
                       Model model) {
        model.addAttribute("listOfGames",  listOfGames);
        model.addAttribute("game", new Game());
        model.addAttribute("user", user);
        return "main";
    }

    @PostMapping("/startGame")
    public String join(Model model,
                         @AuthenticationPrincipal User user,
                         @RequestParam(value = "firstUserOfGame") String gameUser1
    ) {
        System.out.println(gameUser1 + "usere1");

        //toDo
        // replace it to service package or ...
        for(Game game: listOfGames){
            if (game.getUser1().getUsername().equals(gameUser1)){
                game.setUser2(user);
            }
        }
        return "index";
    }

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView();
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }


    @PostMapping("/sendMove")
    @ResponseBody
    public Map<String, Object> sendMove(@RequestParam(value = "x") int x,
                                        @RequestParam(value = "y") int y,
                                        @RequestParam(value = "direction") String direction) {
        Map<String, Object> answer = new HashMap<>();
        answer.put("x", (int) (1 + Math.random() * 11));
        answer.put("y", (int) (1 + Math.random() * 11));
        answer.put("direction", direction);
        System.out.println(111);

        return answer;
    }

    @GetMapping("/greeting")
    public String greetingForm(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("user", user);
        model.addAttribute("game", new Game());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@AuthenticationPrincipal User user,
                                 @ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        model.addAttribute("user", user);
        return "greeting";
    }

}