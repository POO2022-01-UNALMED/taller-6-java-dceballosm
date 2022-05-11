package vehiculos;

public class Camioneta extends Vehiculo{
	protected boolean volco;
	private static int cantidadCamionetas = 0;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		this(placa, puertas, 90, nombre, precio, peso, "4X", fabricante, volco);	
	}
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco){
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.volco = volco;
		cantidadCamionetas ++;
	}
	public boolean isVolco() {return this.volco;}
	public static int getCantidadCamionetas() {return Camioneta.cantidadCamionetas;}
	
	public void setVolco(boolean volco) {this.volco = volco;}
}
