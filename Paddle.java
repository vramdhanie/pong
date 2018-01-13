import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;

public class Paddle {

    public static final int PADDLE_SPEED = 10;
    public static final int PADDLE_WIDTH = 40;

    double x;
    double y;
    double width;
    Shape shape;

    public Paddle(){}

    public Paddle(double x, double y, double width){
        this.x = x;
        this.y = y;
        this.width = width;

        shape = new Rectangle2D.Double(0, 0, width, 5);
    }

    public void draw(Graphics2D g){
        Color originalColor = g.getColor();
        g.setColor(Color.ORANGE);
        AffineTransform af = new AffineTransform();
        af.translate(x, y);

        g.transform(af);
        g.fill(shape);
        try {
            g.transform(af.createInverse());
        } catch (NoninvertibleTransformException e) {
            e.printStackTrace();
        }
        g.setColor(originalColor);
    }

    public void move(int key){
        x = x + (key == KeyEvent.VK_LEFT ? -PADDLE_SPEED : PADDLE_SPEED);
        if(x < 0){
            x = 0;
        }

        if(x > DrawingPanel.SCREEN_WIDTH - width){
            x = DrawingPanel.SCREEN_WIDTH - width;
        }
    }

}
