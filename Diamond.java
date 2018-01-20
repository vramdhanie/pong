import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * @author Vincent Ramdhanie on 20/01/2018.
 */
public class Diamond {

    double x;
    double y;
    Shape shape;
    Color colour;

    public Diamond(){}

    public Diamond(double x, double y){
        this.x = x;
        this.y = y;

        //code to contruct a shape out of areas
        Area a1 = new Area(new Rectangle2D.Double(x, y, 50, 50));
        AffineTransform af = new AffineTransform();
        af.rotate(Math.toRadians(45), x + 25, y + 25);
        a1.transform(af);

        Area a2 = new Area(new Rectangle2D.Double(x + 10, y + 10, 30, 30));
        a1.subtract(a2);
        shape = a1;
        colour = Color.RED;
    }

    public void draw(Graphics2D g){
        Color originalColour = g.getColor();
        g.setColor(colour);
        g.fill(shape);
        g.setColor(originalColour);
    }
}
