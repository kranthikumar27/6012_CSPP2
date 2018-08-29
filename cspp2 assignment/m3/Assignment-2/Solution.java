
import java.util.Scanner;
/*
    Do not modify this main function.
    */
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
/* Fill the main function to print the number of 7's between 1 to n*/
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        final int value = 10;
        final int number = 7;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int remainder = 0;
            for(int j = i; j > 0; j = j / value) {
                remainder = j % value;
                if (remainder == number) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
