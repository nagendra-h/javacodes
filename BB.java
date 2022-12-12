package sample;
sealed class  s1 permits AA{
	s1(){
	System.out.println("s11111");
	}
}             
final class AA extends s1{
	public void dis() {
	System.out.println("A");
}
}

public class BB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BB b=new BB();
			AA a1=new AA();
			a1.dis();
			
			

	}

}
