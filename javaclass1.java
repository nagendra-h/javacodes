package sample;
import java.util.*;

import java.lang.reflect.Array;

public class javaclass1 {
	public void add(String c,char vv) {
		String l1=c.toUpperCase();
		// STRINGBUILDER CLASS---------
		StringBuilder nn=new StringBuilder();
		nn.append(c);
		System.out.println(nn.reverse());
		int c1=0;
		System.out.println(c.toUpperCase());
		//COMPARING THE CHARACTERS------
		for(int k=0;k<c.length();k++) {
			if(vv == c.charAt(k)) {
				c1++;
				System.out.println("val" +vv+(c1));
				
				
			}
			
		}
		char[] qq=c.toCharArray();
		char[] o =new char[10];
		int p=0;
		System.out.println(c.length());
		//USING THE ARRAY----
		for(int y=c.length()-1;y>=0;y--) {
			o[p]=qq[y];
			p++;
		}
		System.out.println(o);
		boolean res=true;
		///CHECKS THE PALINDROME-----
		for(int l=0;l<c.length();l++) {
			if(qq[l]!=qq[c.length()-l-1]) {
				res=false;
			}
		}
		if(res==true) {
			System.out.println("pal");
		}
		else
			System.out.println("not palindrome");
	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.next();
		char xx='n';
		
		javaclass1 sk=new javaclass1();
		sk.add(s1,xx);
		
	}

}
