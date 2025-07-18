package JavaCore;

import java.util.Random;

public class JavaRandom {
    
    public static void main(JavaString[] args) {
        
        Random random = new Random();

        int number1 = random.nextInt(1, 101);
        int number2 = random.nextInt(1, 101);
        int number3 = random.nextInt(1, 101);

        double double1 = random.nextDouble();

        float float1 = random.nextFloat();

        boolean boolean1 = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("\n" + double1);

        System.out.println("\n" + float1);

        System.out.println("\n" + boolean1);

    }   

}   