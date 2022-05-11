package vehiculos;

public class Autom�vil extends Vehiculo{
	protected int puestos;
	private static int cantidadAutomoviles=0;
	
	public Autom�vil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
	}
	
	public Autom�vil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.puestos = puestos;
		Autom�vil.cantidadAutomoviles = Autom�vil.cantidadAutomoviles + 1;
	}

	public int getPuestos() {return this.puestos;}
	public static int getCantidadAutomoviles() {return Autom�vil.cantidadAutomoviles;}
	
	public void setPuestos(int puestos) {this.puestos = puestos;}
}