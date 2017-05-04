/**
 * Printer.java is a singleton to print the game out to console
 */
public class Printer() {

    private static Printer _printer = new Printer();

    private Printer() { }

    public static Printer getInstance() {
        return _printer;
    }
}