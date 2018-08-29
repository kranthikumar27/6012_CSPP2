/**
 * { item_description }
 */
import java.util.Scanner;

/**
 * { item_description }
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**.
	 * { var_description }
	 */
	private static int gcd = 1;
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        gcd(n1, n2);
        System.out.println(gcd(n1, n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
	/**.
	 * { function_description }
	 *
	 * @param      n1    The n 1
	 * @param      n2    The n 2
	 *
	 * @return     { description_of_the_return_value }
	 */
	static int gcd(final int n1, final int n2) {
		int temp = 0;
		int number1 = n1;
		int number2 = n2;
		if (number1 > number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		for (int i = 1; i <= number2; i++) {
			if ((number1 % i == 0) && (number2 % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
	}
}
