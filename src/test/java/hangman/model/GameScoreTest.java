package hangman.model;

import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;
public class GameScoreTest {
    /**
    Pruebas vergas
    */
    private GameScore bonusSc = new BonusScore();
    private GameScore powerBonus = new PowerScore();
    private GameScore originalSc = new OriginalScore();
   
    /*
    Power
     */
    @Test
    public void abovePowerScore() throws GameScoreExeption {
        
        // si esta arriba de 500 se queda en 500
        int score = powerBonus.calculateScore(4,0);
        Assert.assertTrue(score == 500);
    }

    @Test
    public void belowPowerScore(){
        //cuando etan con valores menores a 0
         try{
             powerBonus.calculateScore(-1,-100);
        }
        catch( Exception e ){
             Assert.assertTrue( true );
        }
    }

    @Test
    public void score0PowerScore() throws GameScoreExeption {
        int score = powerBonus.calculateScore(0,15);
        Assert.assertEquals(score,0);
    }

    @Test
    public void  calculatePowerScore() throws GameScoreExeption {
        //debe hacer una prueba normal
        int score = powerBonus.calculateScore(4,63);
        Assert.assertEquals(score,276);

    }

    /*
    Bonus
    */
    @Test
    public void belowBonusScore(){
        try{
            bonusSc.calculateScore(-1,-100);
        }
        catch( Exception e ){
            Assert.assertTrue( true );
        }
    }
    @Test
    public void onPointBonusScore() throws GameScoreExeption{
        int score = bonusSc.calculateScore(2,6);
        Assert.assertEquals(score,0);
    }
    @Test
    public void caseBonusScore() throws GameScoreExeption{
        int score = bonusSc.calculateScore(2,3);
        Assert.assertEquals(score,5);
    }

    /*
    Original
     */
    @Test
    public void caseOriginalScore()  throws GameScoreExeption{
       int score = originalSc.calculateScore(1,2);
        Assert.assertEquals(score,80);
    }
    @Test
    public void belowOriginalScore()  throws GameScoreExeption{
         try{
            originalSc.calculateScore(-1,-100);
        }
        catch( Exception e ){
            Assert.assertTrue( true );
        }
    }
     @Test
    public void caseOriginalScoreminimumvalue()  throws GameScoreExeption{
       int score = originalSc.calculateScore(1,11);
        Assert.assertEquals(score,0);
    }


}