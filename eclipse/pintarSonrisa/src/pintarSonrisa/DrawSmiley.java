package pintarSonrisa;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7900458646920505170L;

	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		//crear Cara
		g.setColor( Color.YELLOW );
		g.fillOval( 10, 10, 200, 200 );
		
		//pintar ojos
		g.setColor( Color.BLACK );
		g.fillOval( 55, 65, 30, 30 );
		g.fillOval( 135, 65, 30, 30 );
		//pintar boca
		g.fillOval( 50, 110, 120, 60 );
		//convertir boca en sonrisa
		g.setColor( Color.YELLOW );
		g.fillRect( 50, 110, 120, 30 );
		g.fillOval( 50, 120, 120, 40 );
	}
}
