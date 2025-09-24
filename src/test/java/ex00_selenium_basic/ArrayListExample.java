package ex00_selenium_basic;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String >list = new ArrayList<>();
        list.add("John");
        list.add("Mohan");
        list.add("Shyam");
        list.add("Amit");
        list.add("kapil");
        System.out.println("array list size: "+list.size());
        System.out.println("array list size: "+list);
        for(String s:list){
            System.out.println(s);
        }

    }
}
