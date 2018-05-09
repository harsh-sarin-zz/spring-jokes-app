package sarin.project.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Harsh Sarin.
 */
@Service
public class ChuckNorrisJoker implements Joker {

   private static final String JOKER_NAME = "Chuck Norris Joker";
   private final ChuckNorrisQuotes chuckNorrisQuotes;

   public ChuckNorrisJoker() {
      this.chuckNorrisQuotes = new ChuckNorrisQuotes();
   }

   @Override public String whoIsTheJoker() {
      return JOKER_NAME;
   }

   @Override public String generateJoke() {
      return chuckNorrisQuotes.getRandomQuote();
   }
}
