package vehiculos;

public class Camion extends Vehiculo{
	protected int ejes;
	private static int cantidadCamiones = 0;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		this(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
	}
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes){
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.ejes = ejes;	
		cantidadCamiones ++;
	}
	public int getEjes() {return this.ejes;}
	public static int getCantidadCamiones() {return Camion.cantidadCamiones;}
	
	public void setEjes(int ejes) {this.ejes = ejes;}
}
