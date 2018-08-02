package fartiyal.jitindra.joke.JokeApp.controllers;

import fartiyal.jitindra.joke.JokeApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("jokes",jokeService.getJoke());

        return "chucknorris";
    }
}
