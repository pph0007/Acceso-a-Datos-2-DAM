public class Ejemplo7 {

    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;

            int c = a / b;

            System.out.println(c);
            System.out.println("Esto es una prueba");

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Esto sí se imprime");
        }
    }
}
