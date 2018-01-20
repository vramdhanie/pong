import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {

    double x;
    double y;
    double size;
    double dx;
    double dy;
    Color colour;
    Shape shape;

    public Ball(){
        this(300, 200, 10, 3, 4, Color.RED);
    }
    public Ball(double x, double y, double size, double dx, double dy, Color colour){
        this.x = x;
        this.y = y;
        this.size = size;
        this.dx = dx;
        this.dy = dy;
        this.colour = colour;

        shape = new Ellipse2D.Double(x, y, size, size);
        Thread t = new Thread(new Mover());
        t.start();
    }

    public void move(){
        this.x += this.dx;
        this.y += this.dy;
        shape = new Ellipse2D.Double(x, y, size, size);
        if(this.x <=0 || this.x >= (DrawingPanel.SCREEN_WIDTH - this.size)){
            this.dx *= -1;
        }
        if(this.y <= 0 || this.y >= (DrawingPanel.SCREEN_HEIGHT - this.size)){
            this.dy *= -1;
        }
    }

    /**
     * @return the rectangle that bounds this ball
     * @
     */
    public Rectangle2D getBounds(){
        return this.shape.getBounds2D();
    }

    public void collide(Rectangle2D rectangle){
        if(this.shape.intersects(rectangle)){
           this.dy *= -1;
        }
    }

    public void draw(Graphics2D g){
        Color originalColour = g.getColor();
       // g.translate(x, y);
        g.setColor(this.colour);
        g.fill(shape);
      //  g.translate(-x, -y);
        g.setColor(originalColour);
    }

    public boolean hit(double xp, double yp){
        return shape.contains(xp - x, yp - y);
    }

    class Mover implements Runnable{
        static final long REFRESH_RATE = 1000/60;
        public void run(){
            while(true){
                move();
                try {
                    Thread.sleep(REFRESH_RATE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
