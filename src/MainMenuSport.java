import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainMenuSport extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuSport frame = new MainMenuSport();
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
	public MainMenuSport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 912, 453);
		getContentPane().setLayout(null);
		
		JButton btnNewButton_3 = new JButton("F1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				F1GUI f1 = new F1GUI();
				f1.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(306, 290, 158, 53);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("MOTO GP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				motogpGUI motogp = new motogpGUI();
				motogp.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(306, 353, 158, 53);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LIGA INDONESIA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Indonesia indonesia = new Indonesia();
				indonesia.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(497, 353, 158, 53);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("EPL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				eplGUI epl = new eplGUI();
				epl.setVisible(true);
			}
		});
		btnNewButton.setBounds(497, 290, 158, 53);
		getContentPane().add(btnNewButton);
		
		JButton btnUcl = new JButton("UCL");
		btnUcl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UCLeague ucl = new UCLeague();
				ucl.setVisible(true);
				
			}
		});
		btnUcl.setBounds(687, 290, 158, 53);
		getContentPane().add(btnUcl);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Confirm if you want to exit","Sports.Info",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_5.setBounds(760, 385, 85, 21);
		getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainMenuSport.class.getResource("/Image/sportlogo.PNG")));
		lblNewLabel.setBounds(53, 10, 790, 270);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3_1 = new JButton("GUEST LIST");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuestList guest = new GuestList();
				dispose();
				guest.setVisible(true);
			}
		});
		btnNewButton_3_1.setBounds(53, 353, 158, 53);
		getContentPane().add(btnNewButton_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO Sports.Info");
		lblNewLabel_1.setFont(new Font("Bauhaus 93", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(53, 297, 213, 46);
		getContentPane().add(lblNewLabel_1);
	}
}
