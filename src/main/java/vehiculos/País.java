package vehiculos; 

import java.util.HashMap; 
import java.util.Map;
import java.util.Map.Entry;

public class Pa�s {
	private String nombre;
	static Map<Pa�s, Integer> ventasPorPais = new HashMap <Pa�s, Integer>();
	
	public Pa�s(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pa�s paisMasVendedor() 
	{
		int valorMax = -1;
		Pa�s paisMasVendedor = null;

		for (Entry<Pa�s, Integer> entry : ventasPorPais.entrySet()) {
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