package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	JButton add = new JButton ("Add Name");
	JButton view = new JButton ("View Names");
	JPanel p = new JPanel ();
	JFrame f = new JFrame ();
	void create () {
	f.add(p);
	p.add(add);
	p.add(view);
	f.setVisible(true);
	add.addActionListener(this);
	view.addActionListener(this);
	f.pack();
	}
	// TODO Auto-generated catch block
			
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)  e.getSource();
		if (buttonPressed == add) {
			String name = JOptionPane.showInputDialog("What is your name");
			ArrayList<String> nombre = new ArrayList<String>();
			nombre.add(name);
		}
		String guest = new String ()
			if (buttonPressed == view) {
				JOptionPane.showMessageDialog(null, "");
			}
		
	}
}
