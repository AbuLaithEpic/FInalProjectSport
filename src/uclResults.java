

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class uclResults extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uclResults frame = new uclResults();
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
	public uclResults() {
		getContentPane().setBackground(new Color(0, 102, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 235);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 47, 240, 108);
		getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Bayern", "  2-0", "Lokomotiv Moscow"},
				{"Real Madrid", "  2-0", "Monchengladbach"},
				{"RB Salzburg", "  0-2", "Atletico Madrid"},
				{"Manchester City", "  3-0", "Marseille"},
				{"Inter Milan", "  0-0", "Shakhtar Donetsk"},
			},
			new String[] {
				"Home", "", "Away"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(18);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Group Stage 6/6");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(23, 23, 135, 13);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(97, 165, 85, 21);
		getContentPane().add(btnNewButton);
	}

	}
