package sample;
interface inter1 {
	 
	default void m1() {
		System.out.println("inter1");
	}
 }
	interface inter2 {
		default void m2() {
			System.out.println("inter2");
		}
	}
public class cl1 implements inter1,inter2 {

	public static void main(String[] args) {
		char a='8';
		int r1='1';
		int i=10;
		int n=i++%2;
		int m=++i%7;
		System.out.println(i);
		System.out.println(a);
		System.out.println(r1);
		System.out.println();
		
		System.out.println((a+r1));
		// TODO Auto-generated method stub
		String s=new String("D");
		String s1=new String("D");

		StringBuffer b1=new StringBuffer("B");
		StringBuffer b2=new StringBuffer("B");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
//		s.concat("V");
//		b.append("AAAA");
//		System.out.println(s);
//		System.out.println(b);
		cl1 c=new cl1();
		c.m1();

	}

}
