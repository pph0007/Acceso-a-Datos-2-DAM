import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4 {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("Archivos\\fichero.xml");
            int data;
            
            while ((data = file.read()) != -1) {
                System.out.println((char) data);
            }
            file.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Esto se ejecuta siempre");
        }
    }
}
