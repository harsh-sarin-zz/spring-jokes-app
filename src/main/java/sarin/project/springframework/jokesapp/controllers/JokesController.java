package sarin.project.springframework.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sarin.project.springframework.jokesapp.services.Joker;

/**
 * @author Harsh Sarin.
 */
@Controller
public class JokesController {

   private Joker joker;

   public JokesController(Joker joker) {
      this.joker = joker;
   }

   @RequestMapping(value={"","/"})
   public String getJokes(Model model) {
      model.addAttribute("jokerName", this.joker.whoIsTheJoker());
      model.addAttribute("joke", this.joker.generateJoke());
      return "jokes";
   }

}
