package ejemplojava;

import javax.swing.JFrame;



public class Main {
		public static void main(String[] args)
		{
			DrawPanel panel = new DrawPanel(); 
			JFrame application = new JFrame();
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			application.add(panel);
			application.setSize(250,250);
			application.setLocationRelativeTo(null);
			application.setVisible(true);
		}
		

}
