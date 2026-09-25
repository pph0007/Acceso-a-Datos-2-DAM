package Ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("./tema1/archivos/texto.txt");
            FileWriter escritor = new FileWriter("./tema1/archivos/copia.txt");
            int data;

            while ((data = lector.read()) != -1) {
                escritor.write(data);
                System.out.print((char) data);
            }
            lector.close();
            escritor.close();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
