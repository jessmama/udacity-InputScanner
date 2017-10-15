
public class GuessNumber {
    private int numberIGuess;

    String GuessNumber(int g,int s){
        numberIGuess=g;
        if (numberIGuess == s) {
            return "Right";
        }else if(numberIGuess>s){
            return "It's smaller than you guess. ";
        }else{
            return "It's geater than you guess. ";
        }

    }
}
