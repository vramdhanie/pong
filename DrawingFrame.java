import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JFrame{

    JPanel canvas;

    public DrawingFrame(){
        super("Drawings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new DrawingPanel();
        add(canvas, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}
