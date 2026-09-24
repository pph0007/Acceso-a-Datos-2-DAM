import java.io.File;

public class Ejemplo2 {

    public static void main(String[] args) {

        File fichero0 = new File("./Tema1/Ejemplos/crearFichero.txt");
        File carpeta = new File("./Tema1", "backup");
        carpeta.mkdirs();

        File destino = new File("./Tema1/backup/fichero_movido.txt");
        if (fichero0.renameTo(destino)) {
            System.out.println("Fichero se ha movido correctamente");
        } else {
            System.out.println("Fichero no se ha podido mover");
        }
    }
}
