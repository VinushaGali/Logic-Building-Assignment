import java.util.*;
public class Activity1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int i,n=25;
	    int Array[] = new int[n];
	    System.out.println("Enter 25 elements of array : ");
		for(i=0;i<n;i++){
			Array[i]=sc.nextInt();	
		}
	    int max = Array[0];
	    for (i = 1; i < n; i++){
	        if (Array[i] > max)
	            max = Array[i];
	       }
	    System.out.println(max);
	}
}
