import java.util.*;
public class degrees_to_fahrenheit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		double f = (c * 1.8)+32;
		System.out.println("Temperature in fahrenheit: "+f);
	}
} 