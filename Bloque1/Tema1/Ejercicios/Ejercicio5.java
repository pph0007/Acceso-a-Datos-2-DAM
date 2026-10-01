package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio5 {

    public static void main(String[] args) {
        String rutaOriginal = "tema1/archivos/foto.jpg";
        String rutaCopiaSinBuffer = "tema1/archivos/foto_copia_sin_buffer.jpg";
        String rutaCopiaConBuffer = "tema1/archivos/foto_copia_buffer.jpg";

        // 1. Copia Byte a Byte (Sin Buffer)
        long tiempoInicioSin = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream(rutaOriginal);
                FileOutputStream out = new FileOutputStream(rutaCopiaSinBuffer)) {

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            System.err.println("Error en la copia sin buffer: " + e.getMessage());
        }
        long tiempoFinSin = System.currentTimeMillis();
        long duracionSinBuffer = tiempoFinSin - tiempoInicioSin;

        // 2. Copia con Buffer (Array de 4096 bytes)
        int bufferSize = 4096;
        byte[] buffer = new byte[bufferSize];

        long tiempoInicioCon = System.currentTimeMillis();
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(rutaOriginal));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(rutaCopiaConBuffer))) {

            int bytesLeidos;
            while ((bytesLeidos = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesLeidos);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        long tiempoFinCon = System.currentTimeMillis();
        long duracionConBuffer = tiempoFinCon - tiempoInicioCon;

        System.out.println("--- COMPARATIVA DE RENDIMIENTO ---");
        System.out.println("Tiempo sin buffer: " + duracionSinBuffer + " ms");
        System.out.println("Tiempo con buffer: " + duracionConBuffer + " ms");
    }
}
