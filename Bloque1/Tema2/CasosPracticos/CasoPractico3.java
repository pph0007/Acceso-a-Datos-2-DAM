package Tema2.CasosPracticos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CasoPractico3 {
    public static void main(String[] args) {
        try {

            DataOutputStream dps = new DataOutputStream(new FileOutputStream("Tema2/Archivos/salida.txt"));
            dps.writeInt(123);
            dps.writeInt(987);
            dps.writeFloat(123.45F);
            dps.writeLong(953325447);
            dps.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("Tema2/Archivos/salida.txt"));
            int entero1 = dis.readInt();
            int entero2 = dis.readInt();
            float numeroFloat = dis.readFloat();
            long numeroLong = dis.readLong();
            dis.close();

            System.out.println("El número entero es: " + entero1 + " y " + entero2);
            System.out.println("El número float es: " + numeroFloat);
            System.out.println("El numero long es: " + numeroLong);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}