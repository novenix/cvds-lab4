package hangman.model;
import java.lang.Math;
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
    private int bonification = 10;
    private int failValue= 5;
    private int minSc= 0;
    private int score = 0;
    @Override
    public int calculateScore(int correctCount ,int incorrectCount)  throws GameScoreExeption{
       if( correctCount < minSc|| incorrectCount < minSc ) {
           throw new GameScoreExeption(GameScoreExeption.NUMBER_UNDER_0);
       }
       if ((bonification*correctCount - failValue*incorrectCount) <= minSc){
           score =0;
           return score;
       }
       else {
           score = bonification*correctCount - failValue*incorrectCount;
           return score;
       }
   };
}