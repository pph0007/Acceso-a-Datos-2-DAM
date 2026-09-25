package CasosPracticos;
import java.io.File;
import java.io.IOException;

public class CasoPractico1 {
    
    public static void main(String[] args) {
        
        File fichero = new File(".\\Tema1\\Ejemplos\\crearFichero.txt");
            
        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException ioe) {
            System.out.println("No se pudo crear el fichero: " + ioe.getMessage());
        }
    }
}
