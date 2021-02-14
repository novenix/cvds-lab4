package hangman.model;
import java.lang.Math;
public class PowerScore implements GameScore {
/**El juego inicia en 0 puntos.
La $i-ésima$ letra correcta se bonifica con $5^i$.
Se penaliza con 8 puntos cada letra incorrecta.
El puntaje mínimo es 0
Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500. 
* @params  correctCount int represents correct guessed characters 
* @params incorrectCount, int represents incorrect guessed characters
* @pos int , return score of the game
* @throws trows exeptions when count < 0
*/

    private int bonification = 5;
    private int failValue= 8;
    private int minSc= 0;
    private int score = 0;
    private int maxSc =500;

   @Override
   public int calculateScore(int correctCount ,int incorrectCount) throws GameScoreExeption {
      if( correctCount < 0 || incorrectCount <0 ) {
            throw new GameScoreExeption(GameScoreExeption.NUMBER_UNDER_0);
        }

        for( int i=1 ; i <=correctCount; i++){
            score+= (Math.pow(bonification,i));
        }

        score =( score - (failValue*incorrectCount) < minSc )? minSc :  score - (failValue*incorrectCount);
        score =( score > maxSc )? maxSc :  score ;
        return score;
   };

}