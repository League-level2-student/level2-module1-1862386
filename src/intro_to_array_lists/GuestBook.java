package intro_to_array_lists;

import javax.swing.JButton;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	JButton add = new JButton ("Add Name");
	JButton view = new JButton ("View Names");
	private Object e;
	JButton buttonPressed = (JButton) ((Object) e).getSource();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
