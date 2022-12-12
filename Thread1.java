package sample;
class Th implements Runnable {
	
}
class Th1 implements Runnable{
	
}
public class Thread1 {

	public static void main(String[] args) throws Exception {
		int a=10;
		var b=20;
		
		System.out.println(""+a+b);
////////// Lambda function      
		Runnable o1= () -> {
				for(int i=0;i<5;i++ ) {
				System.out.println("hello");
				try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}
				}
			
			
			
				};
		Thread o2=new Thread(new Th1()
				{
			public void run() {
				for(int i=0;i<5;i++ ) {
				System.out.println("hi");
				try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}

				}
			}
				});
		
		
		Thread t1=new Thread(o1);
		t1.start();
		try{Thread.sleep(10);} catch(Exception e) {System.out.println(e);}

		o2.start();
	}

}
