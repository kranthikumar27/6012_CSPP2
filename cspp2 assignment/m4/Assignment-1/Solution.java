/**
 * { item_description }
 */
import java.util.*;
/**
 * Class for solution.
 */
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr.length-1);
	}
}
