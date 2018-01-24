
/**
 * Write a description of class ejercicios here.
 * 
 * @author (Garcol) 
 * @version (10.35)
 */
public class Ejercicios
{
    // nombre ejercicio
    private String ejercicio;
    // numero de series
    private int series;
    //numero repeticiones
    private int repeticiones;
    //peso en kilogramos
    private int peso;
    /**
     * Constructor for objects of class ejercicios
     */
    public Ejercicios()
    {
        // initialise instance variables
        ejercicio = null;
        series = 0;
        repeticiones = 0;
        peso = 0;
    }

    /**
     * devuelve nombre ejercicio
     */
    public String getEjercicio()
    {
        return ejercicio;
    }
    
    /**
     * cambio valor ejercicio
     */
    public void setEjercicio(String nombreEjer)
    {
       this.ejercicio = nombreEjer;
    }
    
    /**
     * devuelve numero series;
     */
    public int getSeries()
    {
        return series;
    }
    
    /**
     * cambia numero series;
     */
    public void setSeries(int numero)
    {
        this.series = numero;
    }
    
    /**
     * devuelve numero repeticiones;
     */
    public int getRepeticiones()
    {
        return repeticiones;
    }
    
    /**
     * cambia numero repeticiones;
     */
    public void setRepeticiones(int numero)
    {
        this.repeticiones = numero;
    }
    
    /**
     * devuelve numero repeticiones;
     */
    public int getPeso()
    {
        return peso;
    }
    
    /**
     * cambia numero repeticiones;
     */
    public void setPeso(int kg)
    {
        this.peso = kg;
    }
    
}
