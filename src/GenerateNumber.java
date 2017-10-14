import java.util.Random;

public class GenerateNumber {
    private int randomNmber;
    private int minimum;
    private int maximum;

    int GenerateNumber(){
        this.minimum=1;
        this.maximum=100;
        this.randomNmber= minimum+(int)(Math.random()*maximum) ;
        return randomNmber;
    }
}
