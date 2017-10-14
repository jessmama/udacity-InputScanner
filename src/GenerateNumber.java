import java.util.Random;

public class GenerateNumber {
    private int randomNmber;
    private int minimum;
    private int maximum;

    public int GenerateNumber{
        minimum=1;
        maximum=100;
        this.randomNmber= minimum + (int)(Math.random() * maximum);
    }
}
