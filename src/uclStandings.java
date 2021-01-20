

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class uclStandings extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uclStandings frame = new uclStandings();
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
	public uclStandings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 216);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 40, 481, 92);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Bayern", "6", "6", "1", "0", "18", "5", "13", "16"},
				{"2", "Atletico Madrid", "6", "2", "3", "1", "7", "8", "9", "9"},
				{"3", "RB Salzburg", "6", "1", "1", "4", "10", "17", "-7", "4"},
				{"4", "Lokomotiv Moscow", "6", "0", "3", "3", "10", "15", "3", "29"},
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
		
		JButton btnNewButton = new JButton("return");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				UCLeague.main(null);
			}
		});
		btnNewButton.setBounds(435, 143, 85, 21);
		contentPane.add(btnNewButton);
		
		JComponent lblNewLabel = new JLabel("Group A");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(39, 15, 46, 14);
		contentPane.add(lblNewLabel);
	}

	}
