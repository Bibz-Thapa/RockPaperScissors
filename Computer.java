import java.util.Random;
//Random results generator for the computer to use

public class Computer {
    public String opponent(){

        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int)(Math.random() * choices.length);
        return choices[randomIndex];
    }
}
