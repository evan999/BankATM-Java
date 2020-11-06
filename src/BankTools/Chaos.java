package BankTools;

import java.util.Random;

public class Chaos implements UI {
    Random random = new Random();

    @Override
    public int requestInt(String text){
        return random.nextInt(10) + 1;
    }

    @Override
    public String requestString(String text){
        String[] options = {"D", "W", "B", "M", "Q", "Y"};
        return options[random.nextInt(options.length)];
    }
}
