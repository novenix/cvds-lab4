package hangman.model;

public class GameScoreExeption extends Exception {
    public static final String NUMBER_UNDER_0 = "numbers cannot be under 0";
    public GameScoreExeption (String error){
        super(error);
    }
}