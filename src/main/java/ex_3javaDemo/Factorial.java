package ex_3javaDemo;

import java.util.Scanner;

public class Factorial {
    //Java program to Find Factorial on given Number
    //5* = 5*4*3*2*1 = 120
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int factorial =  1 ;
        int input = scanner.nextInt();
        for(int i=1;i<=input;i++){
            factorial = factorial*i;
        }
        System.out.println("factorial number: "+ factorial);
    }
}
