

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class uclPlayers extends JFrame {

private JPanel contentPane;
private JTable table;
private JTextField show11;
private JTextField show12;
private JTextField show13;
private JTextField show14;
private JButton btnNewButton_1;
private JTextField show21;
private JTextField show22;
private JTextField show23;
private JTextField show24;
private JTextField show31;
private JTextField show32;
private JTextField show33;
private JTextField show34;
private JTextField show44;
private JTextField show43;
private JTextField show42;
private JTextField show41;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				uclPlayers frame = new uclPlayers();
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
public uclPlayers() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 728, 338);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(0, 102, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JComboBox selectTeam = new JComboBox();
	selectTeam.setModel(new DefaultComboBoxModel(new String[] {"Choose Team", "Barcelona", "Bayern", "Atletico Madrid", ""}));
	selectTeam.setBounds(26, 10, 223, 21);
	contentPane.add(selectTeam);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(26, 65, 678, 26);
	contentPane.add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"Name", "Position", "Jersey No", "Age"
		}
	));
	scrollPane.setViewportView(table);
	
	show11 = new JTextField();
	show11.setBounds(26, 101, 167, 19);
	contentPane.add(show11);
	show11.setColumns(10);
	
	show12 = new JTextField();
	show12.setBounds(196, 101, 167, 19);
	contentPane.add(show12);
	show12.setColumns(10);
	
	show13 = new JTextField();
	show13.setBounds(369, 101, 160, 19);
	contentPane.add(show13);
	show13.setColumns(10);
	
	show14 = new JTextField();
	show14.setBounds(535, 101, 169, 19);
	contentPane.add(show14);
	show14.setColumns(10);
	
	JButton btnNewButton = new JButton("Choose");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(selectTeam.getSelectedIndex()==1) {
				show11.setText("Mo Salah");
				show12.setText("Forward");
				show13.setText("11");
				show14.setText("28");
				show21.setText("Sadio Mané");
				show22.setText("Forward");
				show23.setText("10");
				show24.setText("28");
				show31.setText("Roberto Firmino");
				show32.setText("Forward");
				show33.setText("9");
				show34.setText("29");
				show41.setText("Jordan Henderson");
				show42.setText("Midfielder");
				show43.setText("14");
				show44.setText("30");
			}else if(selectTeam.getSelectedIndex()==2) {
				show11.setText("Bruno Fernandes");
				show12.setText("Midfielder");
				show13.setText("18");
				show14.setText("26");
				show21.setText("Anthony Martial");
				show22.setText("Forward");
				show23.setText("9");
				show24.setText("25");
				show31.setText("Paul Pogba");
				show32.setText("Midfielder");
				show33.setText("6");
				show34.setText("27");
				show41.setText("David de Gea");
				show42.setText("Goalkeeper");
				show43.setText("1");
				show44.setText("30");
			}else if(selectTeam.getSelectedIndex()==3) {
				show11.setText("Jamie Vardy");
				show12.setText("Forward");
				show13.setText("9");
				show14.setText("33");
				show21.setText("James Maddison");
				show22.setText("Midfielder");
				show23.setText("10");
				show24.setText("24");
				show31.setText("Harvey Barnes");
				show32.setText("Midfielder");
				show33.setText("15");
				show34.setText("23");
				show41.setText("James Justin");
				show42.setText("Defender");
				show43.setText("2");
				show44.setText("22");
			}
		}
	});
	btnNewButton.setBounds(282, 10, 85, 21);
	contentPane.add(btnNewButton);
	
	btnNewButton_1 = new JButton("return");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contentPane.setVisible(false);
			dispose();
			UCLeague.main(null);
		}
	});
	btnNewButton_1.setBounds(619, 270, 85, 21);
	contentPane.add(btnNewButton_1);
	
	show21 = new JTextField();
	show21.setColumns(10);
	show21.setBounds(26, 130, 167, 19);
	contentPane.add(show21);
	
	show22 = new JTextField();
	show22.setColumns(10);
	show22.setBounds(196, 130, 167, 19);
	contentPane.add(show22);
	
	show23 = new JTextField();
	show23.setColumns(10);
	show23.setBounds(369, 130, 160, 19);
	contentPane.add(show23);
	
	show24 = new JTextField();
	show24.setColumns(10);
	show24.setBounds(535, 130, 169, 19);
	contentPane.add(show24);
	
	show31 = new JTextField();
	show31.setColumns(10);
	show31.setBounds(26, 159, 167, 19);
	contentPane.add(show31);
	
	show32 = new JTextField();
	show32.setColumns(10);
	show32.setBounds(196, 159, 167, 19);
	contentPane.add(show32);
	
	show33 = new JTextField();
	show33.setColumns(10);
	show33.setBounds(369, 159, 160, 19);
	contentPane.add(show33);
	
	show34 = new JTextField();
	show34.setColumns(10);
	show34.setBounds(535, 159, 169, 19);
	contentPane.add(show34);
	
	show44 = new JTextField();
	show44.setColumns(10);
	show44.setBounds(535, 188, 169, 19);
	contentPane.add(show44);
	
	show43 = new JTextField();
	show43.setColumns(10);
	show43.setBounds(369, 188, 160, 19);
	contentPane.add(show43);
	
	show42 = new JTextField();
	show42.setColumns(10);
	show42.setBounds(196, 188, 167, 19);
	contentPane.add(show42);
	
	show41 = new JTextField();
	show41.setColumns(10);
	show41.setBounds(26, 188, 167, 19);
	contentPane.add(show41);
}
}