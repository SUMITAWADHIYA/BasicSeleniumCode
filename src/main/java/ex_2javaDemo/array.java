package ex_2javaDemo;

public class array {
    public static void main(String[] args) {
        //step first
      int[] mark ; //Declaration
        mark = new int[5]; //memory allocate
        mark[0] = 100;
        mark[1] = 99;
        mark[2] = 95;
        mark[3] = 94;
        mark[4] = 80;
       // mark[5] = 70; error

        System.out.println("print to array: "+mark[1]);//index base array search
        System.out.println("print to all array list: "+mark.length);// print to length

        // step second
        int[] school = new int[10]; //declaration+ memory allocate
        school[0] =41; //initialization
        school[1] =42;
        school[2] =43;
        school[3] =44;
        school[4] =45;
        school[5] =46;
        school[6] =47;
        school[7] =48;
        school[8] =49;
        school[9] =50;
        System.out.println("print number length: "+school.length);
        System.out.println("print number: "+school[5]);
        for(int i=0;i<school.length;i++){
            System.out.println("print number: "+school[i]);
        }
        //reverse order to print arrry
        for(int i=school.length-1;i>=0;i--){
            System.out.println("print to reverse arrry print: "+school[i]);
        }

        //step third
        int[] number = {100,99,88,74,85,65,45,56};//Declaration, memory allocation and initialization together
        System.out.println("print number: "+number[2]);
        System.out.println("print number lenght: "+number.length);
        for(int i=0;i< number.length;i++){
            System.out.println("print all number: "+number[i]);
        }


    }
}
