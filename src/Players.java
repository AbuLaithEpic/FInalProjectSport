

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

public class Players extends JFrame {

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
	private JTextField show51;
	private JTextField show52;
	private JTextField show53;
	private JTextField show54;
	private JTextField show64;
	private JTextField show63;
	private JTextField show62;
	private JTextField show61;
	private JTextField show71;
	private JTextField show72;
	private JTextField show73;
	private JTextField show74;
	private JTextField show84;
	private JTextField show83;
	private JTextField show82;
	private JTextField show81;
	private JTextField show91;
	private JTextField show92;
	private JTextField show93;
	private JTextField show94;
	private JTextField show104;
	private JTextField show103;
	private JTextField show102;
	private JTextField show101;
	private JTextField show111;
	private JTextField show112;
	private JTextField show113;
	private JTextField show114;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;

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
	public Players() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox selectTeam = new JComboBox();
		selectTeam.setModel(new DefaultComboBoxModel(new String[] {"select team", "Liverpool", "Man United", "Leicester", ""}));
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
				"Name", "Posotion", "Jersey No.", "Age"
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
		
		JButton btnNewButton = new JButton("Find");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerArrayList plyrList=new PlayerArrayList();
				
				if(selectTeam.getSelectedIndex()==1) {

					show11.setText(plyrList.liv1[0]);
					show12.setText(plyrList.liv1[1]);
					show13.setText(plyrList.liv1[2]);
					show14.setText(plyrList.liv1[3]);
					show21.setText(plyrList.liv2[0]);
					show22.setText(plyrList.liv2[1]);
					show23.setText(plyrList.liv2[2]);
					show24.setText(plyrList.liv2[3]);
					show31.setText(plyrList.liv3[0]);
					show32.setText(plyrList.liv3[1]);
					show33.setText(plyrList.liv3[2]);
					show34.setText(plyrList.liv3[3]);
					show41.setText(plyrList.liv4[0]);
					show42.setText(plyrList.liv4[1]);
					show43.setText(plyrList.liv4[2]);
					show44.setText(plyrList.liv4[3]);
					show51.setText(plyrList.liv5[0]);
					show52.setText(plyrList.liv5[1]);
					show53.setText(plyrList.liv5[2]);
					show54.setText(plyrList.liv5[3]);
					show61.setText(plyrList.liv6[0]);
					show62.setText(plyrList.liv6[1]);
					show63.setText(plyrList.liv6[2]);
					show64.setText(plyrList.liv6[3]);
					show71.setText(plyrList.liv7[0]);
					show72.setText(plyrList.liv7[1]);
					show73.setText(plyrList.liv7[2]);
					show74.setText(plyrList.liv7[3]);
					show81.setText(plyrList.liv8[0]);
					show82.setText(plyrList.liv8[1]);
					show83.setText(plyrList.liv8[2]);
					show84.setText(plyrList.liv8[3]);
					show91.setText(plyrList.liv9[0]);
					show92.setText(plyrList.liv9[1]);
					show93.setText(plyrList.liv9[2]);
					show94.setText(plyrList.liv9[3]);
					show101.setText(plyrList.liv10[0]);
					show102.setText(plyrList.liv10[1]);
					show103.setText(plyrList.liv10[2]);
					show104.setText(plyrList.liv10[3]);
					show111.setText(plyrList.liv11[0]);
					show112.setText(plyrList.liv11[1]);
					show113.setText(plyrList.liv11[2]);
					show114.setText(plyrList.liv11[3]);

					
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
				eplGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(604, 31, 85, 21);
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
		
		show51 = new JTextField();
		show51.setColumns(10);
		show51.setBounds(26, 217, 167, 19);
		contentPane.add(show51);
		
		show52 = new JTextField();
		show52.setColumns(10);
		show52.setBounds(196, 217, 167, 19);
		contentPane.add(show52);
		
		show53 = new JTextField();
		show53.setColumns(10);
		show53.setBounds(369, 217, 160, 19);
		contentPane.add(show53);
		
		show54 = new JTextField();
		show54.setColumns(10);
		show54.setBounds(535, 217, 169, 19);
		contentPane.add(show54);
		
		show64 = new JTextField();
		show64.setColumns(10);
		show64.setBounds(535, 246, 169, 19);
		contentPane.add(show64);
		
		show63 = new JTextField();
		show63.setColumns(10);
		show63.setBounds(369, 246, 160, 19);
		contentPane.add(show63);
		
		show62 = new JTextField();
		show62.setColumns(10);
		show62.setBounds(196, 246, 167, 19);
		contentPane.add(show62);
		
		show61 = new JTextField();
		show61.setColumns(10);
		show61.setBounds(26, 246, 167, 19);
		contentPane.add(show61);
		
		show71 = new JTextField();
		show71.setColumns(10);
		show71.setBounds(26, 275, 167, 19);
		contentPane.add(show71);
		
		show72 = new JTextField();
		show72.setColumns(10);
		show72.setBounds(196, 275, 167, 19);
		contentPane.add(show72);
		
		show73 = new JTextField();
		show73.setColumns(10);
		show73.setBounds(369, 275, 160, 19);
		contentPane.add(show73);
		
		show74 = new JTextField();
		show74.setColumns(10);
		show74.setBounds(535, 275, 169, 19);
		contentPane.add(show74);
		
		show84 = new JTextField();
		show84.setColumns(10);
		show84.setBounds(535, 304, 169, 19);
		contentPane.add(show84);
		
		show83 = new JTextField();
		show83.setColumns(10);
		show83.setBounds(369, 304, 160, 19);
		contentPane.add(show83);
		
		show82 = new JTextField();
		show82.setColumns(10);
		show82.setBounds(196, 304, 167, 19);
		contentPane.add(show82);
		
		show81 = new JTextField();
		show81.setColumns(10);
		show81.setBounds(26, 304, 167, 19);
		contentPane.add(show81);
		
		show91 = new JTextField();
		show91.setColumns(10);
		show91.setBounds(26, 335, 167, 19);
		contentPane.add(show91);
		
		show92 = new JTextField();
		show92.setColumns(10);
		show92.setBounds(196, 335, 167, 19);
		contentPane.add(show92);
		
		show93 = new JTextField();
		show93.setColumns(10);
		show93.setBounds(369, 335, 160, 19);
		contentPane.add(show93);
		
		show94 = new JTextField();
		show94.setColumns(10);
		show94.setBounds(535, 335, 169, 19);
		contentPane.add(show94);
		
		show104 = new JTextField();
		show104.setColumns(10);
		show104.setBounds(535, 364, 169, 19);
		contentPane.add(show104);
		
		show103 = new JTextField();
		show103.setColumns(10);
		show103.setBounds(369, 364, 160, 19);
		contentPane.add(show103);
		
		show102 = new JTextField();
		show102.setColumns(10);
		show102.setBounds(196, 364, 167, 19);
		contentPane.add(show102);
		
		show101 = new JTextField();
		show101.setColumns(10);
		show101.setBounds(26, 364, 167, 19);
		contentPane.add(show101);
		
		show111 = new JTextField();
		show111.setColumns(10);
		show111.setBounds(26, 393, 167, 19);
		contentPane.add(show111);
		
		show112 = new JTextField();
		show112.setColumns(10);
		show112.setBounds(196, 393, 167, 19);
		contentPane.add(show112);
		
		show113 = new JTextField();
		show113.setColumns(10);
		show113.setBounds(369, 393, 160, 19);
		contentPane.add(show113);
		
		show114 = new JTextField();
		show114.setColumns(10);
		show114.setBounds(535, 393, 169, 19);
		contentPane.add(show114);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(535, 422, 169, 19);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(369, 422, 160, 19);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(196, 422, 167, 19);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(26, 422, 167, 19);
		contentPane.add(textField_31);
	}
}
