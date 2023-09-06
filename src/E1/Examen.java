package E1;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Examen {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Problema 1 		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero a evaluar: ");
		
		try {
			long x=sc.nextLong();
			System.out.println(x+"puede ser almacenado en: ");
			
			
			if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
			    System.out.println("byte");
			}

			if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
			    System.out.println("short");
			}

			if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
			    System.out.println("int");
			}

			if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
			    System.out.println("long");
			}
		}
		catch(Exception e) {
			System.out.println(sc.next()+"no puede ser almacenado en ningun lado");
		}
		
		
//Problema 2
		
		
		//Si n es impar, imprima “Luna”
		//Si n es par y está dentro del rango de 2 a 5, imprima “Sol”
		//Si n es par y está dentro del rango de 6 a 20, imprima “Tierra”
		//Si n es par y mayor que 20, imprima “Galaxia”
		
		System.out.print("Ingrese su numero: ");
		int N = scanner.nextInt();
		
		
			if(N % 2 != 0 && N > 0) {
				System.out.println("Luna");
			}else 
				if (N >= 2 && N <= 5){
				System.out.println("Sol");
			}else 
				if(N >= 6 && N <= 20) {
				System.out.println("Tierra");
				
			}else {
				System.out.println("Galaxia");
			}
				
				
//Problema 3
			
			double currentSalary;
			double rating;
			double raise=0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print ("Ingrese el salario actual: ");
			currentSalary = scan.nextDouble();
			
			System.out.print ("Ingrese la clasificacion de desempeño: ");
			rating = scan.nextDouble();
			
			if(rating == 1) {
				raise = currentSalary + (100 * 0.6); 
			} else if ( rating == 2) {
				raise = currentSalary + (100 * 0.4);
				
			} else if (rating == 3) {
				raise = currentSalary + (100 * 0.15);
			}
			
			System.out.println("Your new salary : " + raise);
			
//Problema 4
			
			System.out.print("Ingrese su año: ");
			int edad = scanner.nextInt();
			
			
			int a = 0;
			
			a = edad % 12; 
			
			switch(a) {
			case 0:
				System.out.println("monkey");
				break;
			case 1:
				System.out.println("Gallo");
				break;
			case 2:
				System.out.println("Perro");
				break;
			case 3:
				System.out.println("Cerdo");
				break;
			case 4:
				System.out.println("Rata");
				break;
			case 5:
				System.out.println("Buey");
				break;
			case 6:
				System.out.println("Tigre");
				break;
			case 7:
				System.out.println("Conejo");
				break;
			case 8:
				System.out.println("Dragon");
				break;
			case 9:
				System.out.println("Serpiente");
				break;
			default:
				System.out.println("Camello");
				
			}
				
			
				
			
				
			
		
			
		
		
	}

}
