// Programa que recibe dos números y muestra la suma.
import java.util.Scanner; // el progrma usa la clase Scanner
public class Suma 
{
	// El metodo main empieza la ejecución de la aplicación en java
	public static void main (String[]args)
	{
		// crea objeto Scanner para obtener la entrada de la ventana de comando
		Scanner entrada = new Scanner(System.in);
		
		int numero1; // primer número a sumar
		int numero2;// segundo número a sumar
		int suma; // suma de numero1 y numero2
		System.out.println("Ingresa el primer dato: "); // indicador
		
		numero1 = entrada.nextInt(); // leer el primer números de usuario
		
		System.out.println("Ingresa el segundo número: ");//indicador
		
		numero2 = entrada.nextInt();// lee el segundo número de usuario
		
		suma = numero1 + numero2; // suma los números, después almacena el total en suma
		
		System.out.println("El resultado es: "+suma);//muestra la suma
	} // fin del método main
	}// fin  de la clase Suma 
	
	

