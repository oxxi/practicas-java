package polimorfismo;

public class Factura implements PorPagar {
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	//constructor de la clase
	public Factura(String pieza, String descripcion,int cuenta, double precio)
	{
		this.numeroPieza = pieza;
		this.descripcionPieza = descripcion;
		
		setCantidad(cuenta);
		setPrecioPorArticulo(precio);
		
	}
	
	//getter y setter
	public String getNumeroPieza() {
		return numeroPieza;
	}


	public String getDescripcionPieza() {
		return descripcionPieza;
	}


	public int getCantidad() {
		return cantidad;
	}


	public double getPrecioPorArticulo() {
		return precioPorArticulo;
	}

//Setters
	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}


	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}


	public void setCantidad(int cantidad) {
		if (cantidad >=0 ) 
			this.cantidad = cantidad;
		else
			throw new IllegalArgumentException("La Cantidad debe ser mayor de 0.0");
		
	}


	public void setPrecioPorArticulo(double precioPorArticulo) {
		if (precioPorArticulo >= 0) 
			this.precioPorArticulo = precioPorArticulo;
		else
			throw new IllegalArgumentException("El precio debe ser mayor a 0.0");
	}


	@Override
	public String toString(){
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%s,.2f",
				"Factura","Numero de Piezas", getNumeroPieza(),getDescripcionPieza(),
				"cantidad",getCantidad(),"Precio Articulo",getPrecioPorArticulo());
	}


	@Override
	public double getMontoPago() {
		return getCantidad() * getPrecioPorArticulo();
	}
}
