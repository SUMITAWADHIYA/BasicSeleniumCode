package ex_3javaDemo;

import java.util.Scanner;

public class FibonacciSeries {
    /* fibonacci sequence explained
    golden ratio
   formula f(n) = f(n-1)+f(n-2)
   example 0, 1 (0+1),2(1+1),3(1+2),5(2+3),8(3+5)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to fibonacci number");
        int input = scanner.nextInt();
        int first =0,second =1 ,next;
        for(int i=0;i<=input;i++){
            System.out.println(first+ "");
          next = first+second;
          first = second;
          second= next;
        }
    }
}
