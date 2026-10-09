package Ejercicios;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {
            File fichero = new File("Archivos\\fichero.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(fichero);
            doc.getDocumentElement().normalize();

            NodeList bibliotecas = doc.getElementsByTagName("library");

            for (int i = 0; i < bibliotecas.getLength(); i++) {

                Element biblioteca = (Element) bibliotecas.item(i);
                String nombre = biblioteca.getElementsByTagName("name").item(0).getTextContent();
                String ciudad = biblioteca.getAttribute("location");

                System.out.println("Biblioteca: " + nombre + " (" + ciudad + ")");

                NodeList libros = biblioteca.getElementsByTagName("book");

                for (int j = 0; j < libros.getLength(); j++) {
                    Element libro = (Element) libros.item(j);
                    String titulo = libro.getElementsByTagName("title").item(0).getTextContent();
                    String autor = libro.getElementsByTagName("author").item(0).getTextContent();
                    String year = libro.getElementsByTagName("year").item(0).getTextContent();
                    System.out.println(" - " + titulo + " (" + autor + ", " + year + ")");
                }

                System.out.println("Total de libros: " + libros.getLength());
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}