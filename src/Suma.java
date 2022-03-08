// Programa que recibe dos números y muestra la suma.
import java.util.Scanner; // el progrma usa la clase Scanner
public class Suma {
	// El metodo main empieza la ejecución de la aplicación en java
	public static void main (String[]args)
	{
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int suma;
		System.out.println("Ingresa el primer dato: ");
		numero1 = entrada.nextInt();
		System.out.println("Ingresa el segundo número: ");
		numero2 = entrada.nextInt();
		suma = numero1 + numero2;
		System.out.println("El resultado es: "+suma);
	}
	}
	
	

