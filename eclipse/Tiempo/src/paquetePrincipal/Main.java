package paquetePrincipal;

public class Main {

	public static void main(String[] args) {
		//instanciacion de clase tiempo
		Tiempo1 tiempo = new Tiempo1();
		//impresion de la clase tiempo
		System.out.print("La hora inicial es:");
		System.out.println(tiempo.aStringUvinersal());
		System.out.print("La hora Estandar universal es:");
		System.out.println(tiempo.toString());
		System.out.println();
		
		//setiar el tiempo
		tiempo.setTiempo(11, 20, 15);
		System.out.print("Hora universal despues del seteo: ");
		System.out.println(tiempo.aStringUvinersal());
		System.out.print("hora Estandar despues del seteo: ");
		System.out.println(tiempo.toString());
		System.out.println();

		
		/*establecer tiempo con valores no validos */
		try {
			tiempo.setTiempo(99, 99, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("Excepcion : %s\n\n", e.getMessage());
		}
		/*informacion despues de establecer valores invalidos */
		System.out.println("Despues de setiar valores invalidos");
		System.out.print("Hora universal: ");
		System.out.println(tiempo.aStringUvinersal());
		System.out.print("Hora Estandar: ");
		System.out.println(tiempo.toString());
	}

}
