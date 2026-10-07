package Tema2.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {
            LineNumberReader ln = new LineNumberReader(new FileReader("Tema2/Archivos/entrada.txt"));
            String linea;

            while ((linea = ln.readLine()) != null) {
                StreamTokenizer st = new StreamTokenizer(new StringReader(linea));
                System.out.println("Línea " + (ln.getLineNumber()) + ": " + linea);
                int palabras = 0;
                int numeros = 0;

                System.out.println(linea);

                while ((st.nextToken()) != StreamTokenizer.TT_EOF) {
                    if (st.ttype ==  StreamTokenizer.TT_WORD) {
                        palabras++;
                    } else if (st.ttype == StreamTokenizer.TT_NUMBER) {
                        numeros++;
                    }
                }
                System.out.println("Palabras: " + palabras + ", Números: " + numeros);
            }
            ln.close();
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
