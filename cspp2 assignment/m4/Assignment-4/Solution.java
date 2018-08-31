
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution {
	public static String reverseString(String str) {
		String str1 = "";
		for (int i = str.length() - 1;i >= 0 ; i--) {
			char rev = str.charAt(i);
			str1 += rev;
		}
		return str1;
	}
/*
	Do not modify the main function 
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse = reverseString(str);	
		System.out.println(reverse);
		
	}
	//Write reverseString function

}
