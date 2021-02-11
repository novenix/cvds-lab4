package hangman.model;

public class BonusScore implements GameScore {
    /**
        El juego inicia en 0 puntos.
        Se bonifica con 10 puntos cada letra correcta.
        Se penaliza con 5 puntos cada letra incorrecta.
        El puntaje mínimo es 0
         * @params  correctCount int represents correct guessed characters 
        * @params incorrectCount, int represents incorrect guessed characters
        * @pos int , return score of the game
        * @throws trows exeptions when count < 0
     */
   

   public int calculateScore(int correctCount ,int incorrectCount)

}