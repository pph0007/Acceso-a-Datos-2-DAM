package Ejercicios;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Ejemplo de uso de FileInputStream y FileOutputStream

public class Ejercicio2 {

    public static void main(String[] args) {

        try {
            FileInputStream lector = new FileInputStream("./tema1/Archivos/medac.png");
            FileOutputStream escritor = new FileOutputStream("./tema1/Archivos/medac_copia.png");

            int data;
            int num = 0;
            while ((data = lector.read()) != -1) {
                num++;
                escritor.write(data);
                System.out.print((char) data);
            }
            lector.close();
            escritor.close();
            System.out.println(" Lectura correcta");
            System.out.println("Nº de Bytes: " + num);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
