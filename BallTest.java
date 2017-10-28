import java.awt.Color;

public class BallTest {
    public static void main(String[] args){
        
        Ball b = new Ball(0, 0, 10, 10, 10, 45, Color.BLACK);
        System.out.println(b);
        b.move();
        System.out.println(b);
    }
}