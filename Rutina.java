import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public Rutina(String txt)
    {
        listaDeEjercicios = new ArrayList<Ejercicio>();
        id = 1;      
         try {
            File archivo = new File(txt);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {                                
                String[] arrayStrings = sc.nextLine().split("#");
                String nombreEjercicio=arrayStrings[0];
                int series=Integer.parseInt(arrayStrings[1]);
                int repeticiones=Integer.parseInt(arrayStrings[2]);
                int peso=Integer.parseInt(arrayStrings[3]);
                String tipo = arrayStrings[4];
                addEjercicio(nombreEjercicio, series, repeticiones, peso, tipo);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * metodo añade ejercicio 
     */
    public void addEjercicio(String nombreEjercicio,int series,int repeticiones,int peso, String tipo)
    {
        Ejercicio nuevoEjercicio = new Ejercicio(nombreEjercicio ,series,repeticiones, peso,tipo ,id);
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
            boolean parar = false;
            Iterator<Ejercicio> ite = listaDeEjercicios.iterator();
            while(ite.hasNext() && parar == false)
            {
                Ejercicio ejercicio = ite.next();
                if (ejercicio.getId() == id)
                {
                    ejercicio.setPeso(peso);
                    parar = true;
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

