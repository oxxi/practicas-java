package polimorfismo;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	//crear constructor
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
		super(nombre,apellido,nss);
		setSalarioSemanal(salario);
	}
	public void setSalarioSemanal(double salario){
		if(salario >= 0.0)
			salarioSemanal = salario;
		else
			throw new IllegalArgumentException("El salario semanal debe ser mayor a 0.0");
	}
	public double getSalarioSemanal(){
		return salarioSemanal;
	}
	
	@Override
	public String toString(){
		return String.format("Empleado Asalariado: %s\n%s $%, .2f",
				super.toString()," Salario Semanal: ", getSalarioSemanal());
	}
	@Override
	public double getMontoPago() {
		// TODO Auto-generated method stub
		return getSalarioSemanal();
	}
	
}
