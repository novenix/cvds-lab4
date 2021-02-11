package hangman.model;

public class PowerScore implements GameScore {
/**El juego inicia en 0 puntos.
La $i-ésima$ letra correcta se bonifica con $5^i$.
Se penaliza con 8 puntos cada letra incorrecta.
El puntaje mínimo es 0
Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500. 
* @params  correctCount int represents correct guessed characters 
* @params incorrectCount, int represents incorrect guessed characters
* @pos int , return score of game
* @throws trows exeptions when count < 0
*/

   public int calculateScore(int correctCount ,int incorrectCount)

}