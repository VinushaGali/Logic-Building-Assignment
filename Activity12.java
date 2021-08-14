import java.util.*;
public class Activity12 {
	 public static void main(String[] args){
	        int i,m=0,flag=0;      
	        int N; 
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        N=sc.nextInt();
	        m=N/2;      
	        if(N==0||N==1){  
	        	System.out.println(N+" is not prime number");      
	        	}
	        else{  
	        	for(i=2;i<=m;i++){      
	        		if(N%i==0){      
	        			System.out.println(N+" is not prime number");      
	        			flag=1;      
	        			break;      
	        			}      
	        		}      
	        	if(flag==0){ 
	        		System.out.println(N+" is prime number");
	        		}  
	        	}  
	    }    
}
