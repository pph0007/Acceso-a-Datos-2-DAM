package Ejercicios;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

// Mi XML trata sobre equipos de futbol andaluces: Real Jaén y Málaga FC.
// Cada uno tiene la misma serie de elementos que se componen de:
// Nombre, año, estadio y nº de jugadores (los jugadores de campo y los porteros).

public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            File fichero = new File("Archivos\\futbol.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(fichero);

            doc.getDocumentElement().normalize();

            String clubes = doc.getDocumentElement().getAttribute("name");

            System.out.println("Clubes: " + clubes);
            System.out.println();

            NodeList equipos = doc.getElementsByTagName("equipo");

            for (int i = 0; i < equipos.getLength(); i++) {

                Element equipo = (Element) equipos.item(i);

                String nombre = equipo.getElementsByTagName("nombre").item(0).getTextContent();
                String anio = equipo.getElementsByTagName("anio_fundacion").item(0).getTextContent();
                String estadio = equipo.getElementsByTagName("estadio").item(0).getTextContent();
                String ciudad = equipo.getElementsByTagName("ciudad").item(0).getTextContent();

                int porteros = Integer.parseInt(equipo.getElementsByTagName("porteros").item(0).getTextContent());
                int jugadoresCampo = Integer
                        .parseInt(equipo.getElementsByTagName("jugadores_de_campo").item(0).getTextContent());

                System.out.println("Equipo: " + nombre + " (" + ciudad + ")");
                System.out.println(" - Año de fundación: " + anio);
                System.out.println(" - Estadio: " + estadio);
                System.out.println(" - Porteros: " + porteros);
                System.out.println(" - Jugadores de campo: " + jugadoresCampo);
                System.out.println("Total jugadores: " + (porteros + jugadoresCampo));
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}