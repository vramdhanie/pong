package tt.edu.sbcs.pong;


import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Ball {

    private double x;
    private double y;
    private double width;
    private double height;
    private double speed;
    private double direction;
    private Color colour;

    public Ball() {
        this(0, 0, 10, 10);
    }

    public Ball(double x, double y, double width, double height) {
        this(x, y, width, height, 2, 0, Color.BLACK);
    }

    public Ball(double x, double y, double width, double height, double speed, double direction, Color colour) {
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
        this.setSpeed(speed);
        this.setDirection(direction);
        this.setColour(colour);
    }


    public void move(){
        //logic for moving
    }

    //bounce ball on boundaries
    public void detectBoundaries(Rectangle2D boundary){

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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
}
