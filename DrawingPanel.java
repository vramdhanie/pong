import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class DrawingPanel extends JPanel{

    public static final int SCREEN_WIDTH = 400;
    public static final int SCREEN_HEIGHT = 600;

    Ball ball;
    Paddle paddle;

    public DrawingPanel(){
        super();
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        Random ran = new Random();
        ball = new Ball(300, 350, 10, 3, -5, Color.BLUE);
        paddle = new Paddle((SCREEN_WIDTH/2) - (Paddle.PADDLE_WIDTH/2), SCREEN_HEIGHT - 20, 40);
        Thread t = new Thread(new Repainter());
        t.start();
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT ? e.getKeyCode() : 0;
                if(key != 0){
                    paddle.move(key);
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.draw(g2);
        paddle.draw(g2);
    }

    class Repainter implements Runnable{
        static final long REFRESH_RATE = 1000/60;
        public void run(){
            while(true){
                try {
                    Thread.sleep(REFRESH_RATE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
    }


}
