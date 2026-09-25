package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio4 {

    public static void main(String[] args) {

        int bufferSize = 1024;
        byte[] buffer = new byte[bufferSize];

        int info;
        int blockNumber = 1;

        try {
            BufferedInputStream fotoOriginal = new BufferedInputStream(new FileInputStream("tema1/archivos/foto.jpg"));
            BufferedOutputStream fotoCopia = new BufferedOutputStream(new FileOutputStream("tema1/archivos/foto_copia_buffer.jpg"));

            while ((info = fotoOriginal.read(buffer)) != -1) {
                fotoCopia.write(buffer, 0, info);

                System.out.println("Fin bloque " + blockNumber + " bytes de cada bloque " + info);
                blockNumber++;
            }

            System.out.println("Copia finalizada correctamente");
        
            fotoOriginal.close();
            fotoCopia.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
