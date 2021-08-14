import java.util.*;
public class Activity15 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    //let the 2 digits of number be a,b.
	    int num;//let the num be the 2 digit number i.e., num=a*10+b.
	    int rev_num;//let the rev_num be the number after interchanging 2 digits of num 
	    //i.e., rev_num=b*10+a.
	    int num_diff=36;//num_diff= num - rev_num.
	    //num_diff = (10a+b) - (10b+a) = 9a-9b;
	    int digit_diff = (num_diff) / 9;
	    System.out.print("The difference between digits of the number is : "+digit_diff);
	}
}
