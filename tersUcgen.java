package yildiz;
import java.util.Scanner;

public class tersUcgen {
	 public static void main(String[] args) {
		 /*			bo�luk		y�ld�z		sat�r:5
		  *****			0		5
		   ***			2		3
		    *			4		1
		  
		  */
		 int satir;
		 Scanner inp = new Scanner(System.in);
		 System.out.print("Sat�r say�s� giriniz: ");
		 satir=inp.nextInt();
		 
		 for(int i=satir; i>=0 ;i--) {
			 for(int j=0; j<satir-i;j++) {
				 System.out.print(" "); 
				 
			 }
			 for(int k=0;k<(2*i)+1;k++) {
				 System.out.print("*"); 
			 }
			 System.out.println(); 
			 			 			 		
		 }
	 }
}
