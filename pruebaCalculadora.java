public class pruebaCalculadora {

    /*
     * Main method to test Calculadora class.
     * @see Calculadora
     * @msuabar049
     */
    public static void main(String[] args) {
        // Suma
        Calculadora calculadora = new Calculadora(2, 3, "+");
        calculadora.realizarOperacion();
        System.out.println("Suma: " + calculadora.getResultado());

        // Resta
        Calculadora calculadora2 = new Calculadora(2, 3, "-");
        calculadora2.realizarOperacion();
        System.out.println("Resta: " + calculadora2.getResultado());

        // Multiplicación
        Calculadora calculadora3 = new Calculadora(2, 3, "*");
        calculadora3.realizarOperacion();
        System.out.println("Multiplicación: " + calculadora3.getResultado());

        // División
        Calculadora calculadora4 = new Calculadora(2, 3, "/");
        calculadora4.realizarOperacion();
        System.out.println("División: " + calculadora4.getResultado());

        // Módulo
        Calculadora calculadora5 = new Calculadora(2, 3, "%");
        calculadora5.realizarOperacion();
        System.out.println("Módulo: " + calculadora5.getResultado());
    }
}
