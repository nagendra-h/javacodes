package sample;
import java.util.*;

public class Take_input {
	int n;
	public void check(int n) {
		for(int i=n;i>0;i--) {
			
			System.out.print(i +" ");
			if(i==0) {
				
			}
		}
		for(int i=0;i<=n;i++) {
			
			System.out.print(i +" ");
		}	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Take_input t1=new Take_input ();
		t1.n=5;
		t1.check(t1.n);
		
		
	}

}
