
package zakaz;

/*Rurikk94 2018.03.29*/

import java.util.ArrayList;
import java.util.Iterator;

public class ListaLocales
{
    private ArrayList<Local> listaLocales;

    public ListaLocales(){
        listaLocales = new ArrayList<>();
    }
    
    public boolean agregarLocal(int id, String nombre, String ciudad, String direccion, Persona encargado)
    {
        if (!listaLocales.isEmpty())
        {
            Iterator<Local> iteradorL = listaLocales.iterator();        
            while(iteradorL.hasNext())
            {
                Local dato= iteradorL.next();
                if (dato.getId()==id)
                    return false;
            } 
        }
        Local nuevoLocal = new Local(id,nombre,ciudad,direccion,encargado);
        listaLocales.add(nuevoLocal);
        return true;  
    }
    
    public boolean modificarIdLocal(Integer idNueva, Integer idLocal)
    {
        if (existeLocal(idLocal)!=null && existeLocal(idNueva)==null)
        {
            for(int i=0; i< listaLocales.size(); i++)
            {
                if(listaLocales.get(i).equals(existeLocal(idLocal)))
                {
                    listaLocales.get(i).setId(idNueva);;
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public boolean modificarDireccionLocal(String direccion, Integer idLocal)
    {
        if (existeLocal(idLocal)!=null)
        {
            for(int i=0; i< listaLocales.size(); i++)
            {
                if(listaLocales.get(i).equals(existeLocal(idLocal)))
                {
                    listaLocales.get(i).setDireccion(direccion);;
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public boolean modificarEncargadoLocal(Persona encargado, Integer idLocal)
    {
        
        if (existeLocal(idLocal)!=null)
        {
            for(int i=0; i< listaLocales.size(); i++)
            {
                if(listaLocales.get(i).equals(existeLocal(idLocal)))
                {
                    listaLocales.get(i).setEncargado(encargado);;
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public boolean eliminarLocal(Local local)
    {
        if(listaLocales.contains(local))
        {
            for(int i=0; i< listaLocales.size(); i++)
            {
                if(listaLocales.get(i).equals(local))
                {
                    listaLocales.remove(i);
                    return true;
                }
            }
        }

        return false;
    }
    public boolean eliminarLocal(Integer id)
    {
        if (existeLocal(id)!=null)
        {
            for(int i=0; i< listaLocales.size(); i++)
            {
                if(listaLocales.get(i).equals(existeLocal(id)))
                {
                    listaLocales.remove(i);
                    return true;
                }
            }
            
        }
        

        return false;
    }
    
    public String mostrarLocales()
    {
        String locales="";
        if(!listaLocales.isEmpty())
        {
            for(int i=0; i<listaLocales.size(); i++)
            {
                locales+=("\n"+listaLocales.get(i).getId()+"\t"
                                    +listaLocales.get(i).getNombre()+"\t"
                                    +listaLocales.get(i).getDireccion()+"\t"
                                    +listaLocales.get(i).getCiudad()+"\t"
                                    +listaLocales.get(i).getEncargado().getNombre()+"\t");
            }
        }
        return locales;
    }
	
    public Local retornaLocal(int i)
    {
        if(!listaLocales.isEmpty())
        {
            return listaLocales.get(i);
        }
            return null;
    }
    
	public Local existeLocal(int id){
		if(listaLocales.isEmpty())
			return null;
		else{
			for(int i=0;i<listaLocales.size();i++ ){
				if(id==listaLocales.get(i).getId()){
					return listaLocales.get(i);
				}
			}
			return null;
		}
	}
	/**
	 * @return
	 */
	public int cantidadLocales(){
		if(listaLocales.isEmpty())
			return 0;
		else
			return listaLocales.size();
	}
}