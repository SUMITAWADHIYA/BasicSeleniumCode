package ex00_selenium_basic;



public class ArrayListOldAndEvenNumber {
    public static void main(String[] args) {
        int a[] = {10,2,3,4,5,6,4,6,7,8,9,11};
        int n=a.length;
        System.out.println(" old number");
        for (int i=0;i<n;i++){
            if(a[i] % 2 != 0){
                System.out.println("print old number: "+a[i]);
            }
        }
        System.out.println("even number");
        for(int i=0;i<n;i++){
        if(a[i] % 2 == 0){
            System.out.println("print even number: "+a[i]);
        }
        }
    }
}
