package rectangulosyovalos;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main {
	static int choice;
	public static void main(String[] args) throws IOException
	{
		String input = JOptionPane.showInputDialog("Ingrese 1 para dibujar Rectangulos \n"
				+ "Ingrese 2 para dibujar Ovalos \n"
				+ "Ingrese 3 para dibujar Circulos");
		try {
		 choice = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Algo va mal no Puedo iniciar debo Cerrar :( ");
			System.exit(0);
		}
		
		
	
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setTitle("Figuras");
		application.setSize(300,300);
		application.setLocationRelativeTo(null);
		application.add(panel);
		application.setVisible(true);
	}
}
