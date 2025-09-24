package ex00_selenium_basic;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int  n ,m, c, d; //veriable  name
        int frist[][] = {{1,2},{3,4},{5,6}}; // add to array form
        int sceond[][] ={{7,8},{9,10},{11,12}};
        m= frist.length;
        n = frist[0].length;
        int sum [][] = new int[m][n];
        System.out.println("calculating Sum of 2 matrix: ");
        for(c=0;c<m;c++)
            for(d=0;d<n; d++)
                sum[c][d] = frist[c][d]+sceond[c][d];
                System.out.println("Sum of two matrix: ");

        for(c=0;c<m;c++)
            for(d=0;d<n; d++)
                System.out.println(sum[c][d]+  "\t");
        System.out.println();

    }
}
