package sample;
import java.util.*;

public class Vshape {
	int i,j,k,l;
	int[][] a= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	public void vsh(int[][] a) {
		int q,w;
		for(i=1;i<=3;i++) {
			for(j=1;j<=3;j++) {
				System.out.println("1");
				for(q=1;q<=3;q++) {
					for(w=1;w<=3;w++) {
				if(a[i][j]==1&&a[q][w]==1 || a[i][j]==2 && a[q][w]==2||a[i][j]==3 &&a[q][w]==3) {
					System.out.print("1");
				}
			}
				}
			if(a[i][j]==3) {
				System.out.print(" ");
			}
			else {
				continue;
			}

			}
		}
	}
			
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vshape v1=new Vshape();
	
//	Vshape v3,v4,v5;
//	Vshape[] v9=new Vshape[] {v3,v4,v5};	
//	v3.i=0;

		System.out.println("values");
		
		v1.vsh(v1.a);
		
	}

}
