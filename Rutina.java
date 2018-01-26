import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Rutina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rutina
{
    private ArrayList<Ejercicio> listaDeEjercicios;
    private int id;

    /**
     * Constructor for objects of class Rutina
     */
    public Rutina()
    {
        listaDeEjercicios = new ArrayList<Ejercicio>();
        id = 1;       
    }

    /**
     * metodo añade ejercicio 
     */
    public void addEjercicio(String nombreEjercicio,int series,int repeticiones,int peso)
    {
        Ejercicio nuevoEjercicio = new Ejercicio(nombreEjercicio ,series,repeticiones, peso,id);
        listaDeEjercicios.add(nuevoEjercicio);
        id++;        
    }

    /**
     * imprime detalles rutina
     */
    public void mostrarRutina()
    {
        int posicionEjercicioActual = 0;
        while (posicionEjercicioActual < listaDeEjercicios.size()) {
            System.out.println(listaDeEjercicios.get(posicionEjercicioActual).getDetallesEjercicio());
            posicionEjercicioActual++;
        }        
    }

    /**
     * imprime lista ordenada de mayor a menor por series
     */
    public void ordenaMayorSeries(){
        ArrayList<Ejercicio> coleccion = (ArrayList<Ejercicio>) listaDeEjercicios.clone();
        int posicionMasSeries = 0;
        if (coleccion.size() > 0)
        {
            while(coleccion.size() > 0)
            {    
                Ejercicio ejerMasSeries = coleccion.get(0);
                int posicion = 0; 
                while(posicion < coleccion.size()){                
                    if(coleccion.get(posicion).getSeries() >= ejerMasSeries.getSeries()){
                        ejerMasSeries = coleccion.get(posicion);
                        posicionMasSeries = posicion;
                    }
                    posicion++;
                }              
                System.out.println(coleccion.get(posicionMasSeries).getDetallesEjercicio());
                coleccion.remove(posicionMasSeries);
            }
        }
    }

    /**
     * imprime lista ordenada de menor a mayor por peso
     */
    public void ordenaMenorPeso()
    {
        ArrayList<Ejercicio> coleccion = (ArrayList<Ejercicio>) listaDeEjercicios.clone();         
        int posicionMenosPeso = 0;
        if (coleccion.size() > 0)
        {
            while(coleccion.size() > 0)
            {    
                Ejercicio ejerMenosPeso = coleccion.get(0);
                int posicion = 0; 
                while(posicion < coleccion.size()){                
                    if(coleccion.get(posicion).getSeries() <= ejerMenosPeso.getSeries()){
                        ejerMenosPeso = coleccion.get(posicion);
                        posicionMenosPeso = posicion;
                    }
                    posicion++;
                }              
                System.out.println(coleccion.get(posicionMenosPeso).getDetallesEjercicio());
                coleccion.remove(posicionMenosPeso);
            }
        } 
    }

    /**
     * permite cambiar peso indicando el id
     */
    public void cambiarPeso(int id , int peso)
    {   
        {
            Iterator<Ejercicio> ite = listaDeEjercicios.iterator();
            while(ite.hasNext())
            {
                Ejercicio ejercicio = ite.next();
                if (ejercicio.getId() == id)
                {
                    ejercicio.setPeso(peso);
                }
            }
        }
    }

    /**
     * permite eliminar ejercicios con mas repeticiones a las indicadas
     */
    public void eliminarEjercMasRepesIndicadas(int repeticiones)
    {   
        {   
            {
                Iterator<Ejercicio> ite = listaDeEjercicios.iterator();
                while(ite.hasNext())
                {
                    Ejercicio ejercicio = ite.next();
                    if (ejercicio.getRepeticiones() > repeticiones)
                    {
                        ite.remove();
                    }
                }
            }
        }
    }
}

