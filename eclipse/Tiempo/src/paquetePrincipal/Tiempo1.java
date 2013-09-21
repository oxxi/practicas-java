package paquetePrincipal;

public class Tiempo1 {
	private int hora;
	private int minuto;
	private int segundo;
	
	public  void setTiempo(int h, int m, int s)
	{
		if ((h >= 0 && h < 24) && (m >=0 && m < 60) && (s >=0 && s < 60)) 
		{
			this.hora = h;
			this.minuto=m;
			this.segundo=s;
		}else{
			throw new IllegalArgumentException("Hora minuto y segundo fuera de rango ");
		}
	}
	/*convertir formato string a hora HH:MM:SS*/
	public String aStringUvinersal(){
		return String.format("%02d:%02d:%02d", this.hora,this.minuto,this.segundo);
	}
	/*convertir a hora standar*/
	public String toString(){
		return String.format("%d:%02d:%02d %s", ((this.hora==0 || this.hora ==12)? 12 : this.hora %12),
				this.minuto,this.segundo, (this.hora < 12 ? "AM" :"PM"));
	}
}
