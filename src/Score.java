import java.awt.*;

/**
 * Tracks the score of the user and displays on the screen
 */
public class Score {
    private int value;

    private double x;
    private double y;
    private int fontSize;
    private Color colour;
    private boolean showBorder;

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
        this.setValue(value);
        this.setX(x);
        this.setY(y);
        this.setFontSize(fontSize);
        this.setColour(colour);
        this.setShowBorder(showBorder);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public boolean isShowBorder() {
        return showBorder;
    }

    public void setShowBorder(boolean showBorder) {
        this.showBorder = showBorder;
    }

    public String toString(){
        return String.format("The current score is %d", getValue());
    }

}
