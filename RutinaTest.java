
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RutinaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RutinaTest
{
    /**
     * Default constructor for test class RutinaTest
     */
    public RutinaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        Rutina rutina1 = new Rutina();
        System.out.println("Añadimos 5 ejercicios a la rutina");
        System.out.println(" ");
        rutina1.addEjercicio("sentadilla", 4, 8, 90);
        rutina1.addEjercicio("peso muerto", 3, 10, 78);
        rutina1.addEjercicio("elevacion talones", 3, 15, 82);
        rutina1.addEjercicio("extension cuadriceps", 5, 20, 25);
        rutina1.addEjercicio("curl femoral", 3, 14, 25);
        rutina1.mostrarRutina();
        System.out.println(" ");
        System.out.println("imprimimos ejercicios ordenados por mayor serie");
        System.out.println(" ");
        rutina1.ordenaMayorSeries();
        System.out.println("imprimimos ejercicios ordenados por menor repeticiones");
        System.out.println(" ");
        rutina1.ordenaMenorPeso();
        System.out.println("cambiamos peso a 180kg del ejercicio con id 1");
        System.out.println(" ");
        rutina1.cambiarPeso(1, 180);
        rutina1.mostrarRutina();
        System.out.println("cambiamos peso a 20kg del ejercicio con id 3");
        System.out.println(" ");
        rutina1.cambiarPeso(3, 20);
        rutina1.mostrarRutina();                
        System.out.println("eliminamos todos los ejercicios con mas de 12 repeticiones");
        System.out.println(" ");
        rutina1.eliminarEjercMasRepesIndicadas(12);
        rutina1.mostrarRutina();            
    }
}

