

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eplResults extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplResults frame = new eplResults();
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
	public eplResults() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 373);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 46, 217, 254);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Everton", "0-1", "West Ham"},
				{"Man United", "2-1", "Aston Villa"},
				{"Tottenham", "3-0", "Leeds United"},
				{"Crystal Palace", "2-0", "Sheffield United"},
				{"Brighton", "3-3", "Wolves"},
				{"West Bron", "0-4", "Arsenal"},
			},
			new String[] {
				"HOME", "", "AWAY"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(18);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Matchday 17 of 38");
		lblNewLabel.setBounds(23, 23, 135, 13);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton.setBounds(155, 305, 85, 21);
		getContentPane().add(btnNewButton);
	}
}
