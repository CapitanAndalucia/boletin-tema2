import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char volver;
		do {
			
		
		System.out.println("¿QUE DESEA REALIZAR?");
		System.out.println("____________________");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACION");
		System.out.println("4. DIVISION");
		System.out.println("____________________");
		System.out.println("  ");
		int operacion = sc.nextInt();
		
		System.out.println("Digame un numero:");
		double num1 = sc.nextInt();
		
		System.out.println("____________________");
		System.out.println("Digame otro numero");
		double num2 = sc.nextInt();
		
		
		switch (operacion) {
		case 1:
			int solucionsuma = (int) (num1 + num2);
			
			System.out.println("La solucion es: " + (solucionsuma));
			break;
			
		case 2:
			
			int solucionresta = (int) (num1 - num2);
			
			solucionresta = Math.abs(solucionresta);
			
			System.out.println("La solucion es: " + (solucionresta));
			
			break;
			
		case 3:
	
			System.out.println("La solucion es: " + (num1 * num2));
			
			break;
			
		case 4:
			
			System.out.println("La solucion es: " + (num1 / num2));
	
			break;

		default:
			System.out.println("Error vuelva a intentarlo");
			break;
		}
		System.out.println("¿Desea repetir? S / N");
		volver = sc.next().charAt(0);
		
		} while (volver == 'S');
		
		System.out.println("¡¡GRACIAS VUELVA PRONTO!!");
	}

}
