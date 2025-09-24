package ex_3javaDemo;

public class swapTwo {
    //Java program to swap two numbers without using third variable
    public static void main(String[] args) {
        int a =5;
        System.out.println("before swap first number: "+a);
        int b = 10;
        System.out.println("before swap second number: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping number: "+a+ " "+ b);

    }
}
