import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Ejemplo6 {
    
    public static void main(String[] args) {
        
        try {
            RandomAccessFile file = new RandomAccessFile("Tema1\\abecedario.txt", "rw");
            file.seek(5);
            System.out.println("Puntero ANTES de leer: " +  file.getFilePointer()); // escribirá 5
            int unbyte = file.read();
            System.out.println("Puntero DESPUÉS de leer: " +  file.getFilePointer()); // escribirá 6
            System.out.println((char)unbyte);
            file.write('0');
            System.out.println("Puntero DESPUÉS de leer: " +  file.getFilePointer()); // escribirá 6

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
