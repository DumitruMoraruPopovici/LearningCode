package Codebat;

import java.util.Scanner;

public class nFactorial {
    public static void main(String[] args) {
        int n=4;
        int[] array = new int[n];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int factorial = 1;
        for(int i=0;i< array.length;i++) {
            System.out.println("Enter a number: ");
            array[i] = input.nextInt();
            if(array[i] > 0 ) {
                sum += array[i];
            }
        }
        for(int j = 1; j<=sum; j++) {
            factorial *= j;
        }

        System.out.println(factorial);
    }
}
