package ex_3javaDemo;

import java.sql.SQLOutput;

public class Reverse {
    public static void main(String[] args) {
        //Stem first
       /* String input ="SUMIT AWADHIYA";
        String rev = new StringBuilder(input).reverse().toString();
        System.out.println("reverse string print: "+ rev);*/
        //Second Stem
        String input  ="Very less time to inprove your self";
        input = input.toLowerCase();
        StringBuilder str= new StringBuilder(input);
        String rev = str.reverse().toString();
        System.out.println("print to reverse string--> "+rev);
    }

}