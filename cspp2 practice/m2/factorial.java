import java.util.*;
public class factorial
{
	static int fact(int num)
	{
	if (num==1)
		return 1;
	else 
		return (num*fact(num-1));
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = fact(num);
		System.out.println(result);
	}
}
