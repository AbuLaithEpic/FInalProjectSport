

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

public class eplTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplTable frame = new eplTable();
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
	public eplTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 40, 481, 297);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Liverpool", "17", "9", "6", "2", "37", "21", "16", "33"},
				{"2", "Man United", "16", "10", "3", "3", "33", "24", "9", "33"},
				{"3", "Leicester City", "17", "10", "2", "5", "31", "21", "10", "32"},
				{"4", "Tottenham", "16", "8", "5", "3", "29", "15", "14", "29"},
				{"5", "Man City", "15", "8", "5", "2", "24", "13", "11", "29"},
				{"6", "Southampton", "17", "8", "5", "4", "26", "19", "7", "29"},
				{"7", "Everton", "16", "9", "2", "5", "26", "20", "6", "29"},
				{"8", "Aston Villa", "15", "8", "2", "5", "29", "16", "21", "26"},
				{"9", "Chelsea", "17", "7", "5", "5", "32", "21", "11", "26"},
				{"10", "West Ham", "17", "7", "5", "5", "24", "21", "3", "26"},
				{"11", "Arsenal", "17", "7", "2", "8", "20", "19", "1", "23"},
				{"12", "Leeds United", "1", "7", "2", "8", "30", "33", "-3", "23"},
				{"13", "Wolves", "17", "6", "4", "7", "18", "24", "-6", "22"},
				{"14", "Crystal Palace", "17", "6", "4", "7", "22", "29", "-7", "22"},
				{"15", "Newcastle", "16", "5", "4", "7", "18", "26", "-8", "19"},
				{"16", "Burnley", "15", "4", "4", "7", "9", "20", "-11", "16"},
				{"17", "Brighton", "15", "2", "8", "7", "21", "28", "-7", "14"},
				{"1", "Fulham", "17", "2", "5", "8", "13", "23", "-10", "11"},
				{"19", "Wesr Bron", "17", "1", "5", "11", "11", "39", "-28", "8"},
				{"20", "Sheffield United", "17", "0", "2", "15", "8", "29", "-21", "2"},
			},
			new String[] {
				"No", "Club", "MP", "W", "D", "L", "GF", "GA", "GD", "Points"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(19);
		table.getColumnModel().getColumn(2).setPreferredWidth(29);
		table.getColumnModel().getColumn(3).setPreferredWidth(26);
		table.getColumnModel().getColumn(4).setPreferredWidth(26);
		table.getColumnModel().getColumn(5).setPreferredWidth(27);
		table.getColumnModel().getColumn(6).setPreferredWidth(28);
		table.getColumnModel().getColumn(7).setPreferredWidth(27);
		table.getColumnModel().getColumn(8).setPreferredWidth(29);
		table.getColumnModel().getColumn(9).setPreferredWidth(40);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton.setBounds(435, 338, 85, 21);
		contentPane.add(btnNewButton);
	}

}
