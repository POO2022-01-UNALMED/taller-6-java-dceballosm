package vehiculos;

public class Automovil extends Vehiculo{
	protected int puestos;
	private static int cantidadAutomoviles=0;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
	}
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.puestos = puestos;
		cantidadAutomoviles ++;
	}

	public int getPuestos() {return this.puestos;}
	public static int getCantidadAutomoviles() {return Automovil.cantidadAutomoviles;}
	
	public void setPuestos(int puestos) {this.puestos = puestos;}
}