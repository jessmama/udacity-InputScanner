import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        GenerateNumber computerNumber=new GenerateNumber();
        int getComputerNumber=computerNumber.GenerateNumber();
        System.out.println(getComputerNumber);

        GuessNumber guess=new GuessNumber();

        for (int leftTimes=9;leftTimes>=0;leftTimes--){

            System.out.println("Guess a number between 1 to 100:");
            Scanner scanner = new Scanner(System.in);
            int guessNumber = scanner.nextInt();

            String isRight=guess.GuessNumber(guessNumber,getComputerNumber);
            if(isRight=="Right"){
                System.out.println("You win!");
                break;
            }else{
                if(leftTimes==0){
                    System.out.println("Game Over.");
                }else {
                    System.out.println(isRight + " You left " + leftTimes + " times to guess.");
                }
            }

        }
    }
}
