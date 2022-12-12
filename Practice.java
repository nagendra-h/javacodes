package sample;
import java.util.*;


final class bb{
	final int h=10;
	public void ll() {
		System.out.println(h);
	}
	
}
class try1 {
	int n;
	
}
interface Inter1{
	void a1();
	int kk=90;
	int dis1();
	int dis2();
     default void sh() {
    	 System.out.println("inside the interface");
     }
	//  k=330;   cannot do bcz by default it is final;
	
	
}
abstract class aa implements Inter1{
	abstract Number ret(Number n);
// 		super.dd1(); we cannot use it here;;;;;;;;;

	public void a1() {
		System.out.println("inside abstract class");
	}
	public int dis1() {
		System.out.println("inside the abstract and interface"+Inter1.kk);
		return 0;
	}
	public int dis2() {
		System.out.println("duplicate1 sir ");
		return 0;
	}
	public int dd1(){
		System.out.println("duplicate1 sir ");
		return 0;
	}


}
class A2 extends aa{
	public Number ret(Number k) {
		Number v=k;
		super.a1();
		super.dis1();
		super.dd1();
		return v;
	}
	
	public void dis() {
		System.out.println("inside the dis");
	}
	public int dis2() {
		super.dis2();
		System.out.println("duplicate2 sir ");
		return 0;
	}
	
}
public class Practice extends try1{
	int l;
	// VARGS---
	Practice(int a){
		this.n=a;
		this.l=20;
		System.out.println("yes1");
	}
	public void add(int ... c) {
		for( int h:c) {
			h=h++;
			System.out.print(h);

		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Practice p=new Practice(5);
		p.add(10,20);
//		Inter1 i3 = new Inter1()
//		{
//			public void sh() {
//				System.out.println("interface");
//			}
//		};
//		i3.sh();
//		Practice p[]= new Practice[2];
//		Practice p1=new Practice();
//		Practice p2=new Practice();
//		p[0]=p1;
//		p[1]=p2;
//		p1.add(1,2,3,4,5);
//		A2 obj=new A2();
//		Number ss=obj.ret(33);
//		obj.dis();
//		obj.dis2();
//		System.out.println(ss);
//		bb b1=new bb();
//		b1.ll();
//		

	}

}
