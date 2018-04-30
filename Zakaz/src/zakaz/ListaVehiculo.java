package zakaz;

import java.util.ArrayList;

public class ListaVehiculo 
{

	private ArrayList<Vehiculo> listaVehiculos;
	
	public ListaVehiculo()
	{
		listaVehiculos = new ArrayList<>();
	}
	
	
	
	
	
	/* M�todos */
	
	public boolean agregarVehiculo(	String marcaVehiculo,
                                    	String tipoVehiculo,
                                    	String modeloVehiculo,
                                    	String patenteVehiculo)
        {
		
		if(existeVehiculo(patenteVehiculo)==false){
			Vehiculo nuevo= new Vehiculo(marcaVehiculo, tipoVehiculo, modeloVehiculo, patenteVehiculo);
			listaVehiculos.add(nuevo);
			return true;
		}
		return false;
	}
	
	public boolean eliminarVehiculo(Vehiculo v)
	{
		if(listaVehiculos.contains(v))
		{
			for(int i=0; i<listaVehiculos.size(); i++)
			{
				if(listaVehiculos.get(i).equals(v))
				{
					listaVehiculos.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean editarVehiculo(String marca, String tipo, String modelo, String patente, Vehiculo v)
	{
		if(listaVehiculos.contains(v))
		{
			for(int i=0; i<listaVehiculos.size(); i++)
			{
				if(listaVehiculos.get(i).equals(v))
				{
					listaVehiculos.get(i).setMarca(marca);
					listaVehiculos.get(i).setTipo(tipo);
					listaVehiculos.get(i).setModelo(modelo);
					listaVehiculos.get(i).setPatente(patente);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void mostrarVehiculos()
	{
		if(listaVehiculos.isEmpty())
		{
			return;
		}
		
		else
		{
			for(int i=0; i<listaVehiculos.size(); i++)
			{
				System.out.println(i+1+"-. "+listaVehiculos.get(i).getTipo()+" "+listaVehiculos.get(i).getMarca()+" "+listaVehiculos.get(i).getModelo()+" PATENTE:"+listaVehiculos.get(i).getPatente());
			}
		}
		
	}
	
	public Vehiculo mostrarVehiculo(int i)
	{
		if(!listaVehiculos.isEmpty())
		{
				return listaVehiculos.get(i);
		}
		return null;
	}
        
	public Vehiculo mostrarVehiculosPorTipo(String tipo, int indicador) //Este metodo recibe el tipo de vehiculo que se desea mostrar y un indicador/iterador de la posicion de la lista donde se busca 
	{	
		if(!listaVehiculos.isEmpty())
		{
			if(listaVehiculos.get(indicador).getTipo() !=null)
			{
				if(listaVehiculos.get(indicador).getTipo().equalsIgnoreCase(tipo))
				{
					return listaVehiculos.get(indicador);
				}
			}
		}
		
		return null;
	}
	
	public boolean existeVehiculo(Vehiculo v)
	{
		if(!listaVehiculos.isEmpty())
		{
			if(listaVehiculos.contains(v))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean existeVehiculo(String patente)
	{
		if(!listaVehiculos.isEmpty())
		{
			for(int i=0; i<listaVehiculos.size();i++)
			{
				if(listaVehiculos.get(i) != null)
				{
					if(listaVehiculos.get(i).getPatente().equalsIgnoreCase(patente))
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public int cantidadVehiculos()
	{
		int contador=0;
		
		for(int i=0; i<listaVehiculos.size(); i++)
		{
			if(listaVehiculos.get(i) != null)
			{
				contador++;
			}
		}
		
		return contador;
	}
        
	public Vehiculo buscarVehiculo(String patente)
	{
		if(!listaVehiculos.isEmpty())
		{
			for(int i=0; i<listaVehiculos.size();i++)
			{
				if(listaVehiculos.get(i) != null)
				{
					if(listaVehiculos.get(i).getPatente().equalsIgnoreCase(patente))
					{
						return listaVehiculos.get(i);
					}
				}
			}
		}
		
		return null;
	}
	
}
