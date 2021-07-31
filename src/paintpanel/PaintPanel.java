package paintpanel;

import java.awt.Font;
import java.awt.Point;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;

//Inicio da Classe

public class PaintPanel extends JPanel {
   
   
    
  //Declaração de variavel
    private int pointCount = 0;
    private Point []points = new Point [900000];
    
    

    public PaintPanel() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    
            public void mouseDragged(MouseEvent event) {
                if (pointCount < points.length) {
                    points[pointCount] = event.getPoint();
                    pointCount++;
                    repaint();
                 
                   
                }
            }

        }
        );
    }


    ImageIcon fundo = new ImageIcon(getClass().getResource("jogo.jpg"));
@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
        
       
            Graphics g2d = (Graphics) g.create();
           
	g2d.drawImage(fundo.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
	g2d.dispose();
           for (int i = 0; i < pointCount; i++) {
            g.fillOval(points[i].x, points[i].y, 10, 10);
         }
}
   
}