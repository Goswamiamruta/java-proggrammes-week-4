package homework_week_8;

import java.util.Scanner;

public class Programme_9_FibonacciNumber {
    public static void isFibonacci(int count){
        int n1 = 0, n2 = 1 , n3;
        System.out.println(n1 + " " +  n2);
        // loop start from because 0 and 1 are already printed
        for (int i = 2; i < count; ++i){
            n3 = n1 + n2 ;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(scanner.nextInt());
        // closing the scanner object
        scanner.close();

    }
}
