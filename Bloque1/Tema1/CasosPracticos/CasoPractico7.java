package CasosPracticos;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class CasoPractico7 {

    public static void main(String[] args) {

        try {

            RandomAccessFile file = new RandomAccessFile("Tema1/Archivos/abecedario.txt", "r");
            file.seek(5);
            System.out.println("Puntero después de read: " + file.getFilePointer());

            byte[] arrayBytes = new byte[3];
            file.read(arrayBytes, 0, 3);

            System.out.println("Bytes leidos: " + arrayBytes.length);
            System.out.println("Puntero después de read: " + file.getFilePointer());

            for (int i = 0; i < arrayBytes.length; i++) {
                System.out.println("  arrayBytes[" + i + "] = " + arrayBytes[i] + " -> '" + (char) arrayBytes[i] + "'");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
