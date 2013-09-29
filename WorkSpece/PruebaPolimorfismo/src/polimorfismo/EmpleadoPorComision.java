package polimorfismo;

public class EmpleadoPorComision  extends Empleado{
	private double ventasBrutas;
	private double tarifaComision;
	//constructor de la clase
	public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa)
	{
		super(nombre,apellido,nss);
		setVentasBrutas(ventas);
		setTarifaComision(tarifa);
	}
	//setter y getter ventas brutas
	public void setVentasBrutas(double vts){
		if(vts>=0.0)
			this.ventasBrutas = vts;
		else
			throw new IllegalArgumentException("Las ventas deben se mayor a 0.0");
	}
	public double getVentasBrutas(){
		return this.ventasBrutas;
	}
	//setter y getter tarifa por comision 
	public void setTarifaComision(double trf){
		if((trf > 0.0) && (trf < 1.0))
			this.tarifaComision = trf;
		else
			throw new IllegalArgumentException("La tarifa debe ser mayor a 0.0 y menor a 1.0");
	}
	
	public double getTarifaComision(){
		return this.tarifaComision;
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s:\n%s:$%,.2f;\n %s: %.2f", 
				"Empleado por Comision ", super.toString(),
				"Ventas Brutas ", getVentasBrutas(),
				"Tarifa por Comision ", getTarifaComision());
	}
	@Override
	public double getMontoPago() {
		// TODO Auto-generated method stub
		return 0;
	}

}
