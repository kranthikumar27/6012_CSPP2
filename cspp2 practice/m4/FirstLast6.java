import java.util.Scanner;
public class FirstLast6 {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for( int i = 0; i<arr.length;i++) {
            arr[i] = s.nextInt();
        }
        if(arr[0] == 6 || arr[arr.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
    }
}