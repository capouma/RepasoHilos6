/*
 * Realiza un programa en java que ejecute tres hilos de forma concurrente.
 * Uno de ellos debe sumar los números pares del 1 al 1000, otro los impares,
 * y otro, los que terminan en dos o en tres.
 */
package repaso6;

/**
 *
 * @author findag
 */
public class Repaso6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Creamos los 3 hilos.
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");
        
        // Lanzamos nuestros hilos.
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
