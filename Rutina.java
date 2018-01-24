import java.util.ArrayList;
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

    public void ordenaMayorSeries()
    {
        ArrayList<Ejercicio> coleccion = (ArrayList<Ejercicio>) listaDeEjercicios.clone();
        Ejercicio seriesMasAltas = coleccion.get(0);
        int posicion = 0;
        while (posicion < coleccion.size()) 
        {
            if(coleccion.get(posicion).getSeries()>= seriesMasAltas.getSeries()){
                seriesMasAltas = coleccion.get(posicion);
            }
            if(coleccion.size() -1 == posicion)
            {
                System.out.println(coleccion.get(posicion).getDetallesEjercicio());
                coleccion.remove(seriesMasAltas);
                seriesMasAltas = coleccion.get(0);
                posicion=-1;
            }
            posicion++;
        }
    }
       
}
