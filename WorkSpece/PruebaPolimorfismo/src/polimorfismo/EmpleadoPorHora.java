package polimorfismo;

public class EmpleadoPorHora extends Empleado {

	private double sueldo;
	private double horas;
	//Constructor de la clase
	public EmpleadoPorHora(String nombre, String apellido, String nss, double sueldoPorHora,
			double horasTrabajadas){
		super(nombre,apellido,nss);
		setSueldo(sueldoPorHora);
		setHoras(horasTrabajadas);
	}
	//establecer el sueldo(setter y getters)
	public void setSueldo(double sueldoPorHoras){
		if(sueldoPorHoras >=0.0)
			sueldo = sueldoPorHoras;
		else
			throw new IllegalArgumentException("El sueldo Por Hora debe ser mayor a 0.0");
	}
	public double getSueldo(){
		return this.sueldo;
	}
	//Establecer horas
	public void setHoras(double horasTrabajo){
		if((horasTrabajo >= 0.0) && (horasTrabajo <=168.0))
			horas = horasTrabajo;
		else
			throw new IllegalArgumentException("Las Horas de Trabaja deben ser mayor a 0.0"
					+" y menor a 168");
	}
	public double getHoras(){
		return this.horas;
	}
	
	
	@Override
	public String toString(){
		return String.format("Empleado por Hora: %s\n%s $%, .2f; %s: %, .2f",
				super.toString()," Sueldo por Hora: ", getSueldo(), " Horas Trabajadas: ", getHoras());
	}
	@Override
	public double getMontoPago() {
		// TODO Auto-generated method stub
		return 0;
	}

}
