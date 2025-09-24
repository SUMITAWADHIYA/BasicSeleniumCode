package ex_3javaDemo;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number =scanner.nextInt();
        int reverse =0;
        int original = number;
        while (number !=0){
            int digit = number % 10; // get last digit
            reverse = reverse*10 +digit; //append digit
            number = number/10; //remove Last digit
        }
        System.out.println("Original number: "+original);
        System.out.println("reverse number: "+reverse);
    }
    /*8int a = 4588524;
    int reverse = 0;
    int c = a;
     while(a != 0){
        int d = a % 10;// get last digit
        reverse  = reverse *10+d; //append digit
        a = a/10 ;//remove last digit.
    }
     System.out.println("print number: "+c);
     System.out.println("print reverse number "+reverse);

}*/
}
