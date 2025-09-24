package ex_1javaDemo;

public class OppositeStart {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop for rows, starting with a full row and decreasing
        for (int i = n; i >= 1; i--) {
            // Inner loop for columns, printing stars equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is complete
            System.out.println();
        }
    }
}
