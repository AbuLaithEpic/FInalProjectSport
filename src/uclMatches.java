

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class uclMatches extends JFrame {

private JPanel contentPane;
private JTable table;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				uclMatches frame = new uclMatches();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

/**
 * Create the frame.
 */
public uclMatches() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 298, 262);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(0, 102, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 42, 269, 123);
	contentPane.add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{"RB Leipzig", "17/02", "Liverpool"},
			{"Barcelona", "17/02", "Everton"},
			{"Sevilla", "18/02", "Dortmund"},
			{"Porto", "18/02", "Juventus"},
			{"Atletico Madrid", "24/02", "Chelsea"},
			{"Lazio", "24/02", "Bayern"},
		},
		new String[] {
			"Home", "Date", "Away"
		}
	));
	scrollPane.setViewportView(table);
	
	JButton btnNewButton = new JButton("return");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
			dispose();
			UCLeague.main(null);
		}
	});
	btnNewButton.setBounds(101, 176, 85, 21);
	contentPane.add(btnNewButton);
}

}