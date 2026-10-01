package Ejercicios;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        String rutaFichero = "tema1/archivos/asientos.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de asiento que quieres comprar (0-19): ");
        int numeroUsuario = scanner.nextInt();

        // 1. Validar el rango del asiento solicitado
        if (numeroUsuario < 0 || numeroUsuario > 19) {
            System.out.println("Error: El asiento introducido no existe o no está disponible.");
            scanner.close();
        }

        // 2. Modificar el fichero de forma aleatoria (modo lectura/escritura "rw")
        try (RandomAccessFile raf = new RandomAccessFile(rutaFichero, "rw")) {

            raf.seek(numeroUsuario);
            int caracterActual = raf.read();

            if (caracterActual == 'C') {
                System.out.println("El asiento " + numeroUsuario + " ya está ocupado.");
            } else if (caracterActual == 'L') {
                raf.seek(numeroUsuario);
                raf.write('C');
                System.out.println("El asiento " + numeroUsuario + " ahora está reservado.");
            } else {
                System.out.println("Error");
            }

            scanner.close();

        } catch (Exception e) {
            System.err.println("Se ha producido un error al acceder al fichero: " + e.getMessage());
        }
    }
}
