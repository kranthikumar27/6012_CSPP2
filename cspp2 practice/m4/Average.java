import java.util.*;
public class Average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double avg=0;
		double sum=0;
		System.out.println("enter the size of an array:");
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0;i < arr.length ;i++ ) {
			arr[i] = s.nextInt();
			sum += arr[i]; 
		}
		avg = sum/size;
		System.out.println(avg);
	}
}