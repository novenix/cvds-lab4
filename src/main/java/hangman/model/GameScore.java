package hangman.model;

public interface GameScore {
    /*
* @params  correctCount int represents correct guessed characters 
* @params incorrectCount, int represents incorrect guessed characters
* @pos int , return score of game
* @throws trows exeptions when count < 0
*/
   public int calculateScore(int correctCount ,int incorrectCount) throws GameScoreExeption;

}