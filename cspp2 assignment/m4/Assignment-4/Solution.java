/* Given an String, Write a java method that returns the
 *  decimal value for the given binary string.*/
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      str   The string.
     *
     * @return     { description_of_the_return_value }.
     */
    public static String reverseString(final String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char rev = str.charAt(i);
            str1 += rev;
        }
        return str1;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);
    }
}


