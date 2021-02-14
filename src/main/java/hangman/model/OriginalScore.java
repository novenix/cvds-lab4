package hangman.model;

public class OriginalScore implements GameScore {
    /**
    * @pre 
    * @pos int , return score of the game
    * @params  correctCount int represents correct guessed characters 
    * @params incorrectCount, int represents incorrect guessed characters
    * @throws trows exeptions when count < 0
    */
    private int score = 100;
    private int failValue=10;
    private int minSc=0;
    public int calculateScore(int correctCount ,int incorrectCount) throws GameScoreExeption{

       if( correctCount < minSc || incorrectCount <minSc ){
            throw new GameScoreExeption( GameScoreExeption.NUMBER_UNDER_0);

        }
        if( (score - failValue*incorrectCount) < minSc ){
            score=minSc;
            return score;
        }
        else{
            score=score - (failValue*incorrectCount);
            
            return score;
        }
   };

}