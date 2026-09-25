package Ejercicios;

import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String archivoNuevo = "datos.txt";

        try {
            FileWriter file = new FileWriter("tema1/Archivos/archivoNuevo.txt");
            file.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            file.close();

            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce la posición a modificar: ");
            int posicion = Integer.parseInt(sc.nextLine());

            System.out.print("Introduce el nuevo carácter: ");
            char caracterUsuario = sc.nextLine().charAt(0);

            RandomAccessFile random = new RandomAccessFile(archivoNuevo, "rw");

            random.seek(posicion);      
            random.writeByte(caracterUsuario); 

            random.close();
            sc.close();

            System.out.println("Carácter modificado correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}