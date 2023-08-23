package Javasclassic;

import java.util.Random;

public class Exercise48 {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(6)+1;
        System.out.println("value : "+value);
    }
}
