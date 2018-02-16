import java.util.HashSet;
/**
 * Write a description of class ejercicios here.
 * 
 * @author (Garcol) 
 * @version (10.35)
 */
public class Ejercicio
{
    // nombre ejercicio
    private String ejercicio;
    // numero de series
    private int series;
    //numero repeticiones
    private int repeticiones;
    //peso en kilogramos
    private int peso;
    //volumen total
    private int volumen;
    //id ejercicio
    private int id;
    //tipo basico , multiarticular, aislado
    private String tipo;
    /**
     * Constructor for objects of class ejercicios
     */
    public Ejercicio(String nombreEjercicio,int series,int repeticiones,int peso,String tipo, int id)
    {
        // initialise instance variables
        ejercicio = nombreEjercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
        String local = tipo.toLowerCase();
        if(local.equals("basico")||local.equals("multiarticular")||local.equals("aislado")){
            this.tipo = tipo;
        }
        else{
            this.tipo = "";
        }
        this.id= id;
        volumen = peso * repeticiones * series;
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

    /**
     * devuelve numero id 
     */
    public int getId()
    {
        return id;
    }

    /**
     * cambia tipo de ejercicio basico , multiarticular, aislado
     */
    public void setTipo(String tipo)
    {
        String local = tipo.toLowerCase();
        if(local.equals("basico")||local.equals("multiarticular")||local.equals("aislado")){
            this.tipo = tipo;
        }
        else{
            this.tipo = "";
        }
    }
    
    /**
     * devuelve tipo
     */
    public String getTipo()
    {
        return tipo;
    }

    /**
     * imprime detalles del erjercicio
     */
    public String getDetallesEjercicio()
    {
        String detalles ="ID: "+ id +" "+ ejercicio +" "+ series + "X" + repeticiones +" " + peso +"Kg" +" VOlUMEN :"+ volumen+"Kg"+ " Tipo: "+ tipo;
        return detalles;
    }

}
