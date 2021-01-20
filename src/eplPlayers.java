

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class eplPlayers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField getName;
	private JTextField getPosition;
	private JTextField getJersey;
	private JTextField getAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplPlayers frame = new eplPlayers();
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
	public eplPlayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(234, 56, 629, 283);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Position", "Jersey No.", "Age"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox selectTeam = new JComboBox();
		selectTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {}
		});
		selectTeam.setModel(new DefaultComboBoxModel(new String[] {"--Select Team--", "Liverpool", "Manchester United"}));
		selectTeam.setBounds(234, 25, 408, 21);
		contentPane.add(selectTeam);
		
		JButton btnNewButton = new JButton("FIND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(selectTeam.getSelectedIndex()==1) {
					String filePath = "eplLiverpool.txt";
					File file = new File(filePath);
					try {
						BufferedReader br = new BufferedReader(new FileReader(file));
						String firstLine = br.readLine().trim();
						String[] columnsName = firstLine.split(",");
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setRowCount(0);
						
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
				}else if(selectTeam.getSelectedIndex()==2) {
					
					String filePath = "eplManU.txt";
					File file = new File(filePath);
					try {
						BufferedReader br = new BufferedReader(new FileReader(file));
						String firstLine = br.readLine().trim();
						String[] columnsName = firstLine.split(",");
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setRowCount(0);
						
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
			
			}
		});
		btnNewButton.setBounds(710, 25, 153, 21);
		contentPane.add(btnNewButton);
		
		getName = new JTextField();
		getName.setBounds(95, 118, 96, 19);
		contentPane.add(getName);
		getName.setColumns(10);
		
		getPosition = new JTextField();
		getPosition.setColumns(10);
		getPosition.setBounds(95, 164, 96, 19);
		contentPane.add(getPosition);
		
		getJersey = new JTextField();
		getJersey.setColumns(10);
		getJersey.setBounds(95, 213, 96, 19);
		contentPane.add(getJersey);
		
		getAge = new JTextField();
		getAge.setColumns(10);
		getAge.setBounds(95, 262, 96, 19);
		contentPane.add(getAge);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jersey = getJersey.getText();
				String age= getAge.getText();
				int myInteger = 0;
				try {
				    myInteger = Integer.parseInt(age);
				    myInteger = Integer.parseInt(jersey);
				    
				    if(selectTeam.getSelectedIndex()==1) {
						String fileName = "eplLiverpool.txt";
						try {
							File writer = new File(fileName);
							PrintWriter pw = new PrintWriter(new FileOutputStream(writer,true));
							pw.append(getName.getText().format("%-17s", getName.getText())+" "+"/"+" "+getPosition.getText().format("%-10s", getPosition.getText())+"\n");
							pw.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					}
					else if(selectTeam.getSelectedIndex()==2) {
						String fileName = "eplManU.txt";
						try {
							File writer = new File(fileName);
							PrintWriter pw = new PrintWriter(new FileOutputStream(writer,true));
							pw.append(getName.getText().format("%-17s", getName.getText())+" "+"/"+" "+getPosition.getText().format("%-10s", getPosition.getText())+"\n");
							pw.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					}else JOptionPane.showMessageDialog(null, "PLEASE SELECT A TEAM!");
				} catch(Exception a){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER AGE AND JERSEY NO. IN INTEGER");
				}
				
	
			}
		});
		btnNewButton_1.setBounds(106, 318, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RETURN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton_2.setBounds(778, 361, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel.setBounds(32, 118, 45, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("POSITION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(32, 166, 61, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblJerseyNo = new JLabel("JERSEY NO.");
		lblJerseyNo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblJerseyNo.setBounds(32, 212, 61, 16);
		contentPane.add(lblJerseyNo);
		
		JLabel lblNewLabel_1_1 = new JLabel("AGE");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1_1.setBounds(32, 260, 61, 13);
		contentPane.add(lblNewLabel_1_1);
	}
}
