

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class eplTop3 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton_2;
	private JButton btnSeeTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplTop3 frame = new eplTop3();
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
	public eplTop3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 416, 76);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 19));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Top 3 Team in EPL"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(50);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("SEE LIST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Liverpool liv = new Liverpool();
				ManU manu = new ManU();
				Leicester lei  = new Leicester();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{liv.getName()});
				model.addRow(new Object[]{manu.getName()});
				model.addRow(new Object[]{lei.getName()});
				
				if(table.getSelectedRow() == -1) {
					if(table.getSelectedRow() == 0) {
						JOptionPane.showMessageDialog(null, "Customer updated confirmed", "Customer Registration System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setBounds(10, 10, 114, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("return");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton_2.setBounds(341, 140, 85, 21);
		contentPane.add(btnNewButton_2);
		
		btnSeeTable = new JButton("SEE TABLE");
		btnSeeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplTable table = new eplTable();
				dispose();
				table.setVisible(true);
			}
		});
		btnSeeTable.setBounds(10, 140, 114, 21);
		contentPane.add(btnSeeTable);
		
		JLabel lblNewLabel = new JLabel("Your team is not in the list?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel.setBounds(10, 125, 171, 13);
		contentPane.add(lblNewLabel);
	}
}

