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
    public void addEjercicio(String nombreEjercicio)
    {
        Ejercicio nuevoEjercicio = new Ejercicio(nombreEjercicio ,id);
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
}
