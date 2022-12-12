package sample;
import java.util.*;
public class Square {
	
	
	
	
	
	int m,n;
	public void square(int a,int b) {
		int sum=1;
		for(int i=0;i<m;i++) {
			sum =sum*n;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Square s1=new Square();
		System.out.println("Enter the two numbera");
		s1.n=s.nextInt();
		s1.m=s.nextInt();
		s1.square(s1.n,s1.m);
		
	}

}
