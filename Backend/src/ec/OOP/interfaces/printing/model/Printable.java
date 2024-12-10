package ec.OOP.interfaces.printing.model;

/**
 * Esta interfaz define el contrato para los objetos que son "imprimibles".
 * Proporciona un método abstracto para implementar la lógica de impresión
 * y métodos por defecto y estáticos como utilidades adicionales.
 */
public interface Printable {
    String VALUE_DEFAULT = "Its a value of default";

    /**
     * Método abstracto que debe ser implementado por las clases que
     * implementen esta interfaz. Devuelve una cadena que representa
     * el contenido a imprimir.
     *
     * @return una representación en texto del objeto imprimible.
     */
    String print();

    /**
     * Método por defecto que permite imprimir un mensaje directamente
     * en la consola. Este método no necesita ser sobrescrito, pero puede
     * ser usado como una herramienta adicional por las clases que implementan
     * la interfaz.
     *
     * @param message el mensaje que se imprimirá en la consola.
     */
    default void print(String message) {
        System.out.println(message);
        System.out.println(VALUE_DEFAULT);
    }

    /**
     * Método estático que recibe un objeto Printable, llama a su método
     * `print` y luego imprime el resultado en la consola. Es útil para
     * realizar una impresión directa sin necesidad de crear una instancia
     * de clase adicional.
     *
     * @param printable un objeto que implementa la interfaz Printable.
     */
    static void print(Printable printable) {
        System.out.println(printable.print());
    }
}
