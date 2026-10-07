package Tema2.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué número de linea quiere buscar?");
        int lineaUsuario = Integer.parseInt(sc.nextLine());

        try {
            LineNumberReader ln = new LineNumberReader(new FileReader("Tema2/Archivos/entrada2.txt"));
            String lineaActual;
            boolean lineaEncontrada = false;

            while ((lineaActual = ln.readLine()) != null) {
                if (ln.getLineNumber() == lineaUsuario) {
                    System.out.println("Contenido de la línea número " + lineaUsuario + ":");
                    System.out.println(lineaActual);
                    lineaEncontrada = true;
                    break;
                }
            }
            if (lineaEncontrada == false) {
                System.out.println("No existe la línea nº: " + lineaUsuario);
            }
            ln.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
