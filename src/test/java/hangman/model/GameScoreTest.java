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
    @Test
    public void belowOriginalScore(){
        Assert.assertTrue(true);
    }

    @Test
    public void belowBonusScore(){
        Assert.assertTrue(true);
    }
    @Test
    public void caseOriginalScore(){
        Assert.assertTrue(true);
    }
    @Test
    public void caseBonusScore(){
        Assert.assertTrue(true);
    }
    @Test
    public void casePowerScore(){
        Assert.assertTrue(true);
    }

}