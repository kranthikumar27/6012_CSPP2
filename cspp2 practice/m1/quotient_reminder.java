import java.util.*;
public class quotient_reminder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int quot = a / b;
		int rem = a % b;
		System.out.println("quotient: "+quot + "reminder: "+rem);
	}
}