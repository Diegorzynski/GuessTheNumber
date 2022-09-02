package academy.learnprogramming;

import org.slf4j.LoggerFactory;

public class GameImpl implements Game{

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(academy.learnprogramming.GameImpl.class);

    // == fields ==
    private NumberGenerator numberGenerator;
    private int guessCount = 10;
    private int number;
    private int smallest;
    private int remainingGuesses;
    private boolean validNumeberRange = true;

    @Override
    public int getNumber(){
        return 0;
    }

    @Override
    public int getGuess(){
        return 0;
    }

    @Override
    public int setGuess(int guess){

    }

    @Override
    public int getSmallest(){
        return 0;
    }

    @Override
    public int getBiggest(){
        return 0;
    }

    @Override
    public int getRemainingGuesses(){
        return 0;
    }

    @Override
    public void reset(){

    }

    @Override
    public void check(){

    }

    @Override
    public boolean isValidNumber(){
        return true;
    }

    @Override
    public boolean isGameWon(){
        return true;
    }

    @Override
    public boolean isGameLost(){
        return true;
    }





}
