package demo;

import java.util.Locale;

public class StringHandling {

    //Strings are one of the most commonly used objects in Java.
    //In Java, strings are immutable, meaning once created, they cannot be changed.
    public static void main(String[] args) {
        //Using String literal
        String si = "hello";
        String s2 = "hello"; //point  to same object  in string pool

        // Using new kye word
        String s3 = new String("Hello");

        //1. String immutable  once  created, valve can't change
        String s = "java";
        s.concat("world");
        System.out.println(s); //output java (unchanged)

        //2. StringBuffer (mutable & thread-Safe)
        //can be modified.
        StringBuilder ss = new StringBuilder("java");
        ss.append("world");
        System.out.println(ss); //output java world

        //commonly Used StringMethods
        String str ="Java programming ";
        System.out.println(str.length());//17
        System.out.println(str.charAt(8));//g
        System.out.println(str.substring(5,10)); //progr
        System.out.println(str.toLowerCase()); //java programming
        System.out.println(str.toUpperCase()); //JAVA PRAGRAMMING
        System.out.println(str.contains("java"));//false
        System.out.println(str.indexOf("a")); //1
        System.out.println(str.lastIndexOf("a"));//10
        System.out.println(str.replace("Java", "core java"));// core java programming
        System.out.println(str.trim());//remove leading  /trailing spaces
    }
}
