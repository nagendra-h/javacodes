package sample;
import java.util.*;

class c2{
	
	c2(int k){
		//this();
		System.out.println("yes"+1);
	}
}
public class count extends c2 {
	String str;
	int l=0;
	count(int a){
		super(10);
		System.out.println("Isnide");
	}
	public void check(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' ||str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i) == ' ') {
				l++;
			}
		}
		System.out.println("values"+ l);
	}
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
		count cn=new count(10);
		//c2 c1=new c2(10);
//		System.out.println("enter the string ");
//		cn.str=s.nextLine();
//		System.out.println(cn.str);
//		cn.check(cn.str);
		char c='8';
		int g='a';
		int a=10;
		int b=20;
		System.out.println(g);
	}

}
