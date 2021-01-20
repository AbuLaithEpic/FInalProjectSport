import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class GuestList extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField getName;
	private JTextField getAge;
	private JTextField getSearch;
	private JButton btnNewButton_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestList frame = new GuestList();
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
	public GuestList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Import Data From Text File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "guestRecord.txt";
				File file = new File(filePath);
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String firstLine = br.readLine().trim();
					String[] columnsName = firstLine.split(",");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					
					Object[] tableLines = br.lines().toArray();
					
					for(int i=0; i<tableLines.length; i++) {
						String line = tableLines[i].toString().trim();
						String[] dataRow = line.split("/");
						model.addRow(dataRow);
					}
				} catch (FileNotFoundException e1) {	
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(293, 39, 204, 21);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		contentPane.add(panel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 77, 362, 285);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "AGE"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				if(table.getSelectedRow()==-1) {
					if(table.getSelectedRow()==0) {
						
						JOptionPane.showMessageDialog(null, "No data to delete",
								"Customer Registration Systems", JOptionPane.OK_OPTION);
						
					}else {
						
						JOptionPane.showMessageDialog(null, "Select a row to delete",
								"Customer Registration Systems", JOptionPane.OK_OPTION);
						
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnNewButton_1.setBounds(248, 372, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("PRINT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				}catch(java.awt.print.PrinterException e1) {
					System.err.format("No Printer found", e1.getMessage());
				}
			}
		});
		btnNewButton_2.setBounds(388, 372, 85, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenuSport.main(null);
			}
		});
		btnNewButton_3.setBounds(527, 372, 85, 21);
		contentPane.add(btnNewButton_3);
		
		getName = new JTextField();
		getName.setBounds(68, 130, 155, 19);
		contentPane.add(getName);
		getName.setColumns(10);
		
		getAge = new JTextField();
		getAge.setColumns(10);
		getAge.setBounds(68, 184, 155, 19);
		contentPane.add(getAge);
		
		JButton btnNewButton_4 = new JButton("ADD");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
					
						getName.getText(),
						getAge.getText(),
						
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getSelectedRow() == 0) {
						JOptionPane.showMessageDialog(null, "Customer updated confirmed", "Customer Registration System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});

		btnNewButton_4.setBounds(138, 235, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(13, 133, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AGE");
		lblNewLabel_1.setBounds(13, 187, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		getSearch = new JTextField();
		getSearch.setColumns(10);
		getSearch.setBounds(68, 296, 155, 19);
		contentPane.add(getSearch);
		
		JButton btnNewButton_5 = new JButton("SEARCH");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter("(?i)"+getSearch.getText()));
			}
		});
		btnNewButton_5.setBounds(138, 342, 85, 21);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("RESET");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GuestList guest = new GuestList();
				guest.setVisible(true);
				
			}
		});
		btnNewButton_6.setBounds(527, 39, 85, 21);
		contentPane.add(btnNewButton_6);
	}
}
