package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewName = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	public static void main(String[] args) {
		GuestBook GB = new GuestBook();
		GB.run();
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	void run() {
		frame.add(panel);
		panel.add(addName);
		panel.add(viewName);
		addName.setText("Add Names");
		viewName.setText("View Names");
		frame.setVisible(true);
		addName.addActionListener(this);
		viewName.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == addName) {
			String inputtedName = JOptionPane.showInputDialog("Type your/a name here");
			names.add(inputtedName);
		} else if (buttonClicked == viewName) {

			String msg = "";
			for (int i = 0; i < names.size(); i++) {
				msg += "Guest #" + (i + 1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}
}
