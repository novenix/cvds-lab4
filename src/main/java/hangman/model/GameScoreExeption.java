package hangman.model;

public class GameScoreExeption extends Exeption {
    public final String NUMBER_UNDER_0 = "sumbers cannot be under 0";
    public GameScoreExeption (String error){
        super(error);
    }
}