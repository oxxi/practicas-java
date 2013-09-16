package pintarSonrisa;

import javax.swing.JFrame;

public class PintarSmile {

	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230,250);
		application.setTitle("Sonriza");
		application.setLocationRelativeTo(null);
		application.setVisible(true);
	}

}