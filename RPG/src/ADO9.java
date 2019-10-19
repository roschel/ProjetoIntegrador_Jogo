import java.util.Random;
import java.util.Scanner;

public class ADO9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		double resultado,a,b;
		
		do {
			System.out.print("Mínimo: ");
			min=sc.nextInt();
			
			System.out.print("Máximo: ");
			max=sc.nextInt();
			
			a=gerador.nextInt((max-min)+1)+min;
			
			b=gerador.nextInt((max-min)+1)+min;
			
					
		} while ((a==0) || min>max);
		
		resultado=-b/a;
				
		if (b==0) {
			System.out.println(a+"x=0");
		}else if(b>0) {
			System.out.println(a+"x + "+b+"=0");
		}else {
			System.out.println(a+"x"+b+"=0");
		}
		
		System.out.println("x = "+resultado);
		sc.close();
	}

}
