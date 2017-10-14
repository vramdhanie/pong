import java.awt.*;

/**
 * Tracks the score of the user and displays on the screen
 */
public class Score {
    int value;

    double x;
    double y;
    int fontSize;
    Color colour;
    boolean showBorder;

    /**
     * Initialize the score at 0 with default
     * position and colour
     */
    public Score(){
        this(0);
    }

    /**
     * Initialize the score to value with default
     * position and colour
     * @param value The score to set
     */
    public Score(int value){
        this(value, 0, 0);
    }

    /**
     * Initialize the score to value at position(x, y)
     * and default colour
     * @param value The score to set
     * @param x The horizontal position of the score
     * @param y The vertical position of the score
     */
    public Score(int value, double x, double y){
        this(value, x, y, 16, Color.WHITE, true);
    }

    /**
     * Initialize the score to value at position (x, y)
     * with colour, fontSize and border provided
     * @param value The score to set
     * @param x The horizontal position of the score
     * @param y The vertical position of the score
     * @param fontSize The font size to use for display
     * @param colour The colour to use for the score
     * @param showBorder Display a border if true
     */
    public Score(int value, double x, double y, int fontSize, Color colour, boolean showBorder){
        this.value = value;
        this.x = x;
        this.y = y;
        this.fontSize = fontSize;
        this.colour = colour;
        this.showBorder = showBorder;
    }
}
