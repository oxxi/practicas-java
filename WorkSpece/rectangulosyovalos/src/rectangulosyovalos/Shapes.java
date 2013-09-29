package rectangulosyovalos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1750493950745192239L;
	private int choice;
	public Shapes( int userChoice ){
		choice = userChoice;
	}
	int heiht=0;
	int width=0;
	public void paintComponent( Graphics g ){
		super.paintComponent( g );
		for ( int i = 0; i < 10; i++ ) {
			heiht +=10;
			width +=10;
			switch ( choice )
			{
			case 1:
				g.drawRect( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
				break;
			case 2:
				g.drawOval(10 + i * 10, 10+i*10, 50+i*10, 50+i*10);
				break;
			case 3:
				g.drawOval(145-(width/2),125-(heiht/2),width,heiht);
				break;
			}
		}
	}
}
