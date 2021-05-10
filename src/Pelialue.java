import javax.swing.JPanel;
import java.awt.*;

public class Pelialue extends JPanel {
    static final int rivit = 10;
	  static final int sarakkeet = 20;
	  
	  static final int alkuX = 0;
	  static final int alkuY = 0;
	  static final int nelioSivu = 50;

      
	  @Override
	  protected void paintComponent(Graphics g) {
		  super.paintComponent(g);
		  //Graphics2D g2 = (Graphics2D) g;
		  
		  for(int i= 0; i<rivit + 1; i++) {
			  g.drawLine(alkuX, alkuY + i * nelioSivu, alkuX + sarakkeet * nelioSivu, alkuY + i * nelioSivu);
		  }
		  for(int i= 0; i< sarakkeet + 1; i++) {
			  g.drawLine(alkuX + i * nelioSivu, alkuY, alkuX + i * nelioSivu, alkuY + rivit * nelioSivu);
		  }
		  //g2.setColor(Color.black);
          //g2.draw(new Line2D.Double(1000, 0, 1000, 720));
		  
	  
        
    }
    public JPanel getPelialue(){
        return this;
    }
}
