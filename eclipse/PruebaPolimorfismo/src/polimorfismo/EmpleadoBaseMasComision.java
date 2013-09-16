package polimorfismo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double salarioBase;
	
	//Constructor de la clase
	public EmpleadoBaseMasComision(String nombre, String apellido, String nss,
			double ventas, double tarifa, double salario){
		super(nombre,apellido,nss,ventas,tarifa);
		setSalarioBase(salario);
	}
	//setter y getter salario base
	public void setSalarioBase(double salario){
		if(salario >= 0.0)
			this.salarioBase = salario;
		else
			throw new IllegalArgumentException("El Salario base debe ser mayor a 0.0");
	}
	public double getSalarioBase(){
		return this.salarioBase;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s; \n%s: $%,.2f", 
					"con salario base",super.toString(),
					"salario base",getSalarioBase());
	}
}
