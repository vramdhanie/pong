import javafx.scene.transform.Affine;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * @author Vincent Ramdhanie on 20/01/2018.
 */
public class Logo {
    double x;
    double y;
    Shape shape;
    Color colour;

    public Logo(){}

    public Logo(double x, double y){
        this.x = x;
        this.y = y;

        //code to contruct a shape out of areas
        Area a1 = new Area(new Rectangle2D.Double(x, y, 50, 50));
        Area a2 = new Area(new Rectangle2D.Double(x + 15, y + 15, 35, 20));
        a1.subtract(a2);

        AffineTransform af = new AffineTransform();
        af.rotate(Math.toRadians(45), x + 25, y + 25);
        a1.transform(af);

        AffineTransform af2 = new AffineTransform();
        af2.translate(25, 0);
        af2.rotate(Math.PI, x + 25, y+ 25);

        Area a3 = a1.createTransformedArea(af2);
        a1.add(a3);
        shape = a1;
        colour = Color.BLUE;
    }

    public void draw(Graphics2D g){
        Color originalColour = g.getColor();
        g.setColor(colour);
        g.fill(shape);
        g.setColor(originalColour);
    }
}
