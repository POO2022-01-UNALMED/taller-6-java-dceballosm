package vehiculos;

public class Automovil extends Vehiculo{
	protected int puestos;
	private static int cantidadAutomoviles=0;
	
	public Automovil(String placa, String nombre, int precio, float peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puestos = puestos;
		cantidadAutomoviles++;
		
	}

	public int getPuestos() {return this.puestos;}
	public static int getAutomoviles() {return Automovil.cantidadAutomoviles;}
	
	public void setPuestos(int puestos) {this.puestos = puestos;}
}