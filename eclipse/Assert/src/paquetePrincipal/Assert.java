package paquetePrincipal;

import java.util.Scanner;

public class Assert {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba un numero entre 0 y 10: ");
		int numero = entrada.nextInt();
		
		assert ( numero >= 0 && numero <= 10 ) : "numero incorrecto : " + numero;
		System.out.printf("Usted Escribio %d\n: "+ numero);
	}

}
