
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++) {
            int remainder = 0;
            for(int j = i;j > 0;j = j/10) {
                remainder = j % 10;
                if (remainder == 7) {
                    count += 1;
                }
            }
            System.out.println(count);

        }
    }
            
}

    
