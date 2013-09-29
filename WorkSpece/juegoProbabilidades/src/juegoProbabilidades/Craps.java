package juegoProbabilidades;

import java.util.Random;

public class Craps {
	public Craps(){
		
	}
	@SuppressWarnings("unused")
	private static final Random randomNumber = new Random();
	//estados del juegos
	@SuppressWarnings("unused")
	private enum Estado {CONTINUA,GANO,PERDIO};
	//tiros comunes del dado
	private static final int DOS_UNOS = 2;
	private static final int TRES = 3;
	private static final int SIETE = 7;
	private static final int ONCE = 11;
	private static final int DOCE =12;
	
	public static void main(String[] args){
		int Puntos = 0;
		Estado estadoJuego;
		int sumaDatos = tirarDados();
		switch(sumaDatos)
		{
		case SIETE:
		case ONCE:
			estadoJuego = Estado.GANO;
			break;
		case DOS_UNOS:
		case TRES:
		case DOCE:
			estadoJuego = Estado.PERDIO;
			break;
		default:
			estadoJuego = Estado.CONTINUA;
			Puntos = sumaDatos;
			System.out.printf("El Punto es %d\n", Puntos);
		}//fin del switch sumaDatoa
		
		while (estadoJuego == Estado.CONTINUA) {
			sumaDatos = tirarDados();
			if (sumaDatos==Puntos) 
				estadoJuego = Estado.GANO;
			else 
				if(sumaDatos == SIETE)
					estadoJuego = Estado.PERDIO;
		}//fin del While
		
		if (estadoJuego == Estado.GANO) {
			System.out.println("El jugador Gano");
		} else {
			System.out.println("El jugador Perde");
		}
	}
	
	public static int tirarDados(){
		int dado1 =1 + randomNumber.nextInt(6);
		int dado2 =1+ randomNumber.nextInt(6);
		int suma = dado1+dado2;
		
		System.out.printf("El jugador tiro %d + %d = %d \n", dado1,dado2,suma);
		return suma;
	}
	

}
