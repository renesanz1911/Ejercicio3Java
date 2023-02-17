public class Ejercicio3Java {
    public static void main(String[] args) {
        String nombres [] = {"juanito","pepito","juanita","pepita"};
        String concatenacion = "";

        for (String nombre : nombres) {
            concatenacion += nombre + " ";
        }

        System.out.println(concatenacion);
    }
}
