package vehiculos; 

import java.util.HashMap; 
import java.util.Map;
import java.util.Map.Entry;

public class País {
	private String nombre;
	static Map<País, Integer> ventasPorPais = new HashMap <País, Integer>();
	
	public País(String nombre) {
		this.nombre = nombre;
	}
	
	public static País paisMasVendedor() 
	{
		int valorMax = -1;
		País paisMasVendedor = null;

		for (Entry<País, Integer> entry : ventasPorPais.entrySet()) {
		    final int valorActual = entry.getValue();

		    if (valorActual > valorMax) 
		    {
		    	valorMax = valorActual;
		    	paisMasVendedor = entry.getKey();
		    } 	   
		}
		
		return paisMasVendedor;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}