import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Pelialue extends JPanel{

	
	
	
	final int xNopeus = 5;
	final int rivit = 11;
	final int sarakkeet = 23;

	  
	final int alkuX = 40;
	final int alkuY = 40;
	final int nelioSivu = 50;

	int laivaX = 637;
	int laivaY = 187;
	final int laivaHalkaisija = 10;


	int tykkiX = 637;
	int tykkiY = 585;
	final int tykkiHalkaisija = 10;

	/*Timer piirra = new Timer(1000, new ActionListener() {
  
        public void actionPerformed(ActionEvent e) {
            
            move();
            repaint();
         
         
        }
        
       });*/


	

	@Override
	public void paintComponent(Graphics g) { // Pelialueen(koordinaatisto) piirtäminen -Villen tekemä
		super.paintComponent(g);
		
		for(int i= 0; i<rivit + 1; i++) {
			g.drawString(String.valueOf(500*i), 10, (alkuY + i * nelioSivu)+5);
			g.drawLine(alkuX, alkuY + i * nelioSivu, alkuX + sarakkeet * nelioSivu, alkuY + i * nelioSivu);  
		}
		for(int i= 0; i< sarakkeet + 1; i++) {
			g.drawString(String.valueOf(500*i) , alkuX + i * nelioSivu, 30);
			g.drawLine(alkuX + i * nelioSivu, alkuY, alkuX + i * nelioSivu, alkuY + rivit * nelioSivu);
		}

		g.setColor(Color.red); //laivaa kuvaava piste
		g.fillOval(laivaX, laivaY, laivaHalkaisija, laivaHalkaisija);
		Toolkit.getDefaultToolkit().sync();

		g.setColor(Color.black);//tykkiä kuvaava piste
		g.fillOval(tykkiX, tykkiY, tykkiHalkaisija, tykkiHalkaisija);
		Toolkit.getDefaultToolkit().sync();
		

	}

	/*public void move() { //laivan liikkumista varten -joskus myöhemmin
		
		laivaX += xNopeus;
		
		
	}
	public void piirrastart(){
		piirra.start();
	}*/



	

	
	
    
}
