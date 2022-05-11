package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int contador;
	
	public Pais(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {return nombre;}
	
	public int getContador() {return contador;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public void setContador() {contador++;}
	
	public static ArrayList<Pais> getPaises() {return paises;}
	
	public static Pais paisMasVendedor() {
		Pais summit = paises.get(0);
		for(int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getContador() > summit.getContador()) {
				summit = paises.get(i);
			}
		}
		return summit;
	}

}