import java.util.*;
import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args) {
		int N,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			f=f*i;
		}
		System.out.println("The factorial of number "+N+" is: "+f);

	}
}
