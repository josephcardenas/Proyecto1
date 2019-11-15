import java.util.Scanner;


public class SumaPromedio {
	public static void main(String[] ar) {
		
		 Scanner teclado=new Scanner(System.in);
		 int n1;
		 int n2;
		 int n3;
		 int n4;
		 
		 System.out.print("Ingrese el primer numero:");
		 n1 = teclado.nextInt();
		 
		 System.out.print("Ingrese el segundo numero:");
		 n2 = teclado.nextInt();
		 
		 System.out.print("Ingrese el tercer numero:");
		 n3 = teclado.nextInt();
		 
		 System.out.print("Ingrese el cuarto numero:");
		 n4 = teclado.nextInt();
		 
		 int  suma= n1+n2+n3+n4;
		 int promedio = suma/4;
		 
		 System.out.print(" La suma es :" + suma );
		 
		 System.out.print(" El Promedio es :" + promedio);
		 
	}
	}
		 