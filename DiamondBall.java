import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiamondBall extends Ball {
    public DiamondBall(){
        super();
    }

    public DiamondBall(double x, double y, double size, double dx, double dy, Color colour){
        super(x, y, size, dx, dy, colour);
        shape = new Rectangle2D.Double(0, 0, size, size);
    }

    @Override
    public void draw(Graphics2D g){
        Color originalColour = g.getColor();
        g.setColor(this.colour);

        g.translate(x, y);
        g.rotate(Math.PI/4);

        g.fill(shape);

        g.rotate(-Math.PI/4);
        g.translate(-x, -y);
        g.setColor(originalColour);

    }

}
