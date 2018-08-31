/*Given an String, Write a java method that returns the
 decimal value for the given binary string.*/
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }.
     *
     * @param      s     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */

    static String binaryToDecimal(final String s) {
        int binary = 1;
        int decimal = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                decimal += binary;
            }
            binary = binary * 2;
        }
        String res = Integer.toString(decimal);
    return res;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }

}
