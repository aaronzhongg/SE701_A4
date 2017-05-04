/**
 * Rules.java is a singleton to decide the outcomes of a move and determine if the game is finished
 */
public class Rules() {

    private static Rules _rules = new Rules();

    private Rules() { }

    public static Rules getInstance() {
        return _rules;
    }
}