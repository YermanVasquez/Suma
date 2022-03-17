/*
 * Autor: Germán Vásquez Santiago
 * Fecha de creación: 14/03/2022
 * Fecha de actualización: 14/03/2022
 * Descripción: La representación de todos los datos primitivos.
 */


package principal;

public class Principal {
public static void main (String[]args) {
	
		
	byte numero1= 123; 
	short num = 456;
	int numero;
	numero=20;
	long n = -8;
	float pi = (float) 3.14;
	double g= 3.9;
	boolean falso = false;
	boolean opcion = falso;
	char m ='G';
		
	System.out.println("El Ejemplo es: " +numero);
	System.out.println("El Ejemplo es: " +pi);
	System.out.println("El Ejemplo es: " +numero1);
	System.out.println("El Ejemplo es: " +num);
	System.out.println("El Ejemplo es: " +n);
	System.out.println("El Ejemplo es: " +g);
	System.out.println("El Ejemplo es: " +falso);
	System.out.println("El Ejemplo es: " +opcion);
	System.out.println("El Ejemplo es: " +m);
	
	//Tabla de los datos primitivos 
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|Nombre \t|Longitud \t\t\t\t\t\t|Ejemplos \t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|byte    \t|-128 a +127  \t\t\t\t\t\t|Ejemplo = " + numero1 + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|short    \t|-32768 a 32767  \t\t\t\t\t|Ejemplo = " + num + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|int    \t|-2147483648 a 2147483647  \t\t\t\t|Ejemplo = " + numero + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|long    \t|-9223372036854775808 a 9223372036854775807 \t\t|Ejemplo = " + n + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|float    \t|-3.4x10^38 a - 1.4x10^45, 1.4x10^45 a 3.4x10^38 \t|Ejemplo = " + pi + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|double    \t|-1.7x10^308 a -4.9x10^-324, 4.9x10^-324 a 1.7x10^308  \t|Ejemplo = " + g + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|boolean    \t|true, false  \t\t\t\t\t\t|Ejemplo = " + falso + "|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|char    \t|0 a 65535 \t\t\t\t\t\t|Ejemplo = " + m + "\t|");
	System.out.println("-----------------------------------------------------------------------------------------------");
	
	}
}
