package packPrincipal;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 968321233437484949L;
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(650,450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple CRUD");
		frame.getContentPane().setLayout(new GridLayout());
		/*agregar Controles*/
		JLabel label1 = new JLabel("Label desde codigo");
		frame.add(label1);
		
		frame.setVisible(true);
		
		
	}
	
	
	
}
