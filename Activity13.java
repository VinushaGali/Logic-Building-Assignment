import java.util.*;
public class Activity13 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int diff_lb = 23;
	    int perimeter = 206;
	    int sum_lb = perimeter/2;
	    int l=(diff_lb+sum_lb)/2;
	    int b=sum_lb-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
}
