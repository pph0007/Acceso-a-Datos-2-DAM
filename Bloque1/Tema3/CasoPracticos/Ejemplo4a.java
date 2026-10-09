import java.io.FileReader;
import java.io.IOException;

public class Ejemplo4a {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("Archivos\\fichero.xml");
        int data;

        while ((data = file.read()) != -1) {
            System.out.println((char) data);
        }
    }
}
