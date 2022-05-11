package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int CantidadVehiculos = 0;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.traccion = traccion;
		
		fabricante.setContador();
		fabricante.getPais().setContador();
		Fabricante.getFabricantes().add(fabricante);
		Pais.getPaises().add(fabricante.getPais());
		
		Vehiculo.CantidadVehiculos = Vehiculo.CantidadVehiculos + 1;
	}
	
	public String getPlaca() {return this.placa;}
	public int getPuertas() {return this.puertas;}
	public int getVelocidadMaxima() {return this.velocidadMaxima;}
	public String getNombre() {return this.nombre;} 
	public int getPrecio() {return this.precio;}
	public int getPeso() {return this.peso;}
	public Fabricante getFabricante() {return this.fabricante;}
	public String getTraccion() {return this.traccion;}
	public int getCantidadVehiculos() {return Vehiculo.CantidadVehiculos;}

	
	public void setPlaca(String placa) {this.placa=placa;}
	public void setPuertas(int puertas) {this.puertas = puertas;}
	public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}
	public void setNombre(String nombre) {this.nombre = nombre;} 
	public void setPrecio(int precio) {this.precio = precio;}
	public void setPeso(int peso) {this.peso = peso;}
	public void setFabricante(Fabricante fabricante) {this.fabricante = fabricante;}
	public void setTraccion(String traccion) {this.traccion = traccion;}
	public static void setCantidadVehiculos(int CantidadVehiculos) {Vehiculo.CantidadVehiculos=CantidadVehiculos;}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
	}
}
