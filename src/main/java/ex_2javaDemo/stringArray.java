package ex_2javaDemo;


public class stringArray {
    public static void main(String[] args) {
        String[] input = new String[5];
        input[0] = "sumit";
        input[1] = "mohit";
        input[2] = "sonu";
        input[3] = "monu";
        input[4] = "deenu";
        System.out.println("print input String: "+input[4]);
        System.out.println("print input string lenght: "+input.length);
        for(String output:input){
            output.length();
            System.out.println("print output list :"+ output);
        }
        for(int i=0;i<input.length;i++){ //loop
            System.out.println("print input list: "+input[i]);
        }
        for(int i=input.length-1;i>=0; i--){ //loop
            System.out.println("print input list to reverse : "+input[i]);
        }
    }
}
