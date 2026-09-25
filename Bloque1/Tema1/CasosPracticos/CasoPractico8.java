package CasosPracticos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CasoPractico8 {
    public static void main(String[] args) {

        try {
            int bufferSize = 12;

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("tema1\\archivos\\texto.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("tema1/archivos/foto_copia_buffer.jpg"));
            byte[] buffer = new byte[bufferSize];
            int info;
            int blockNumber = 1;

            while ((info = bufferedInputStream.read(buffer)) != -1) {
                // Convertimos a String SOLO porque queremos MOSTRAR el contenido legible.
                // Si el objetivo fuera COPIAR el fichero (a otro .txt, una imagen, un vídeo...),
                // NO se convertiría a String: se escribiría directamente el buffer con
                // salida.write(buffer, 0, info), sin interpretar los bytes como texto.
                String contenidoBloque = new String(buffer, 0, info);
                System.out.println("Contenido del bloque " + blockNumber + " (bytes=" + info + "):");
                System.out.println(contenidoBloque);

                System.out.println("Fin bloque " + blockNumber);
                blockNumber++;
            }

            bufferedInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
