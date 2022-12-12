package sample;
import java.util.*;

public class reverse_str {
	String str;
//	int a;
//	char c='b';
//	
	
			
	public void reverse(String str) {
		char[] c=new char[100];
		int j=0;
		for(int i=str.length()-1;i>=0;i--) {
			c[j]=str.charAt(i);
			j++;
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		reverse_str r=new reverse_str();
//		System.out.println(r.a=r.c);

		System.out.println("enter the string value");
		r.str=s.next();
		r.reverse(r.str);
		
	}

}
