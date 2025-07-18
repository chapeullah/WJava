package JavaCore;

import java.util.Scanner;

public class JavaScanner {
    
    public static void main(JavaString[] args) {

        Scanner scanner = new Scanner("123 456 abc");

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        String str = scanner.next();

        System.out.println(one + two + str);

        scanner.close();

    }  

}