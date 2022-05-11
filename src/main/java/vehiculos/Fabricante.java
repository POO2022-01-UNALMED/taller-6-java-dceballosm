package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
	private String nombre;
	private País pais;
	static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();
	
	public static Fabricante fabricaMayorVentas()
	{
		int valorMax = -1;
		Fabricante fabricaMayorVentas = null;

		for (Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()) {
		    final int valorActual = entry.getValue();

		    if (valorActual > valorMax) 
		    {
		    	valorMax = valorActual;
		    	fabricaMayorVentas = entry.getKey();
		    } 	   
		}
		
		return fabricaMayorVentas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public País getPaís() {
		return pais;
	}
	public void setPaís(País pais) {
		this.pais = pais;
	}

}
