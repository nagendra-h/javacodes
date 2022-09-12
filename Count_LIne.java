package sample;
import java.util.*;

public class Count_LIne {

	String sn;
	int l;
	public void check(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=0;j<=s.length()-1;j++) {
				 

				if(s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
					l++;
				}
			}
			System.out.println(s.charAt(i)+"="+l);
			 l=0;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Count_LIne cn=new Count_LIne();
		System.out.println("Ente rthe line");
		cn.sn=s.nextLine();
		cn.check(cn.sn);
		
		
	}

}
