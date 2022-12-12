package sample;
import java.util.*;

public class trial2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);int n=300;
		for(int i=2;i<=n;i++) {
			int c=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					c +=1;
				}
				
			}
			if(c==2) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
			
		}
		String c="123";
		int a=Integer.parseInt(c);
		System.out.println("Enter the number");

		int l = s.nextInt();
		int k = s.nextInt();
		 int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

		for (i = l; i <= k; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	       int n

	}

}
