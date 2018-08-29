import java.util.*;
/**
 * Class for sum of n numbers.
 */
public class SumOfNNumbers {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 0;
		/**
		 * { item_description }
		 */
		while(i<=n) {
			sum = sum + i;
			i++;

		}
		System.out.println(sum);

	}
}