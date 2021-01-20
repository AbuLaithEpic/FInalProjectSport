import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MainLogin {

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin window = new MainLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 587, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setBounds(395, 79, 155, 39);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setColumns(10);
		password.setBounds(395, 128, 155, 39);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuSport mainmenu = new MainMenuSport();
				String user = username.getText();
				String pass = password.getText();
				
					if(user.equals("admin")&&pass.equals("12345")) {
						JOptionPane.showMessageDialog(null,"Username and Password is correct!");
						frame.dispose();
						mainmenu.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null,"Incorrect!");
					}	
			}
		});
		btnNewButton.setBounds(449, 177, 101, 39);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainLogin.class.getResource("/Image/loginpassword.PNG")));
		lblNewLabel.setBounds(346, 131, 42, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainLogin.class.getResource("/Image/loginusername.PNG")));
		lblNewLabel_1.setBounds(346, 79, 45, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Login a a guest");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubLogin sub = new SubLogin();
				frame.dispose();
				sub.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton_1.setBounds(449, 226, 101, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("SPORT.info");
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(375, 21, 175, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MainLogin.class.getResource("/Image/loginLOGO.PNG")));
		lblNewLabel_3.setBounds(48, 37, 258, 210);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
