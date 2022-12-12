package sample;
import java.util.*;
public class trial {
	static int c;
	static {
		 c=899;
	}
		public static int add(int ... i) {
			int s=0;
			
			for(int l : i) {
				s +=l;
			}return s;
		}
	public static void main(String[] args) {
		
		trial b=new trial();
		
		trial b1=new trial();
		System.out.println(trial.c);
		System.out.println(trial.c);

		Scanner s = new Scanner(System.in);
		
		System.out.println(add(5,6,7));
		/*for(int i=1;i<=6;i--) {
			for(int j=6;j>=(6-i);j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		  for (int i = 1; i <= 6; i++) {
			  
	            // loop to print the number of spaces before the star
	            for (int j = 6; j >= i; j--) {
	                System.out.print(" ");
	            }
	  
	            // loop to print the number of stars in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	  
	            // for new line after printing each row
	            System.out.println();
	        }
	    
		for (int i = 0; i < 5; i++) 
			  System.out.println("      *********".substring(i, 5 + 2*i));
		for(int h=1;h<=3;h++) {
			for(int y=1;y<=3;y++) {
				if(h==1||h==3||y==2) {
					System.out.print("$");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int h=1;h<=4;h++) {
			for(int y=1;y<=4;y++) {
				if(h==1||h==4||y==1||y==4) {
					System.out.print("$");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i=1;i<=7;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		for (char i=65;i<=70;i++){
			for (char j = 65; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
		
	}

}
