package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class AppWindow {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "r6g7567");
			putValue(SHORT_DESCRIPTION, "Some shortfjfgjfgj description");
		}
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("WHOOP");
		}
	}
}
