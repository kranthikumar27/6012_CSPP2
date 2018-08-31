import java.util.Scanner;
//import java.lang.*;
public class Concatinate {
	public static final String helloWorld(String str) {
		String str1 = "Hello ";
		String str2 = str1.concat(str);
		String str3 = str2 + "!";
		return str3;

	}
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		//String s = "kranthi";
		String str = sc.nextLine();
		String hello = helloWorld(str);
		System.out.println(hello);

	}
}
