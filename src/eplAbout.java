

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLayeredPane;

public class eplAbout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplAbout frame = new eplAbout();
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
	public eplAbout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		eplAboutChild eac = new eplAboutChild();
		String about2= eac.printAbout();
		
		JTextPane textPane_aboutUs = new JTextPane();
		textPane_aboutUs.setFont(new Font("Verdana", Font.PLAIN, 17));
		textPane_aboutUs.setBounds(31, 36, 623, 68);
		contentPane.add(textPane_aboutUs);
		String about1= eac.printAbout();
		textPane_aboutUs.setText(about1);

		
		JLabel lblNewLabel = new JLabel("ABOUT US");
		lblNewLabel.setBounds(32, 13, 208, 13);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane_run = new JTextPane();
		textPane_run.setBounds(127, 356, 208, 37);
		contentPane.add(textPane_run);
		
		JButton btnNewButton_1 = new JButton("return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				eplGUI.main(null);
			}
		});
		btnNewButton_1.setBounds(569, 368, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RUN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eplAboutChild eac = new eplAboutChild();
				String run = eac.run();
				textPane_run.setText(run);
			}
		});
		btnNewButton_2.setBounds(32, 356, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(429, 114, 225, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(112, 5, 1, 1);
		panel.add(layeredPane);
		
		JLabel lblNewLabel_1 = new JLabel("OWNER");
		lblNewLabel_1.setBounds(16, 10, 199, 13);
		panel.add(lblNewLabel_1);
		
		JTextPane textPane_owner = new JTextPane();
		textPane_owner.setBounds(16, 33, 199, 68);
		panel.add(textPane_owner);
		String ownername=eac.owner("Muhammad Abu Laith");
		String ownerage=eac.owner("Muhammad Abu Laith", "20");
		textPane_owner.setText(ownername +"\n"+ ownerage);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTACT");
		lblNewLabel_1_1.setBounds(16, 131, 199, 13);
		panel.add(lblNewLabel_1_1);
		
		JTextPane textPane_contact = new JTextPane();
		textPane_contact.setBounds(16, 154, 199, 68);
		panel.add(textPane_contact);
		eplAboutParent parent = new eplAboutChild();//overriding
		String contact = parent.printContact();
		textPane_contact.setText(contact);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(29, 114, 390, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("OUR FEATURES");
		lblNewLabel_2.setBounds(10, 10, 95, 13);
		panel_1.add(lblNewLabel_2);
		
		JTextPane textPane_features = new JTextPane();
		textPane_features.setBounds(115, 31, 265, 194);
		panel_1.add(textPane_features);
		
		JButton btnNewButton = new JButton("Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "TABLE"
						+"\n\n\nThis table will show the current EPL standings."
						+"\n\nThe standings will be sorted from the largest points to the lowest points."
						+"\n\nThere are 20 teams listed in the the table.");
			}
		});
		btnNewButton.setBounds(10, 80, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Players");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "PLAYERS"
						+"\n\n\nThis section will show the players competed in EPL teams."
						+"\n\nIt will show their Name, Positon, Jersey Number, and Age."
						+"\n\nSince this GUI is new, we only listed players from 2 teams :)");
			}
		});
		btnNewButton_3.setBounds(10, 111, 85, 21);
		panel_1.add(btnNewButton_3);
		

		
		JButton btnNewButton_3_1 = new JButton("Matches");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "MATCHES"
						+"\n\n\nThis section will show the upcoming macthes."
						+"\n\nIt will show the Away and Home teams, and the time the matches start.");
			}
		});
		btnNewButton_3_1.setBounds(10, 204, 85, 21);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnResults = new JButton("Results");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "RESULTS"
						+"\n\n\nThis section will show last matches results.");
			}
		});
		btnResults.setBounds(10, 142, 85, 21);
		panel_1.add(btnResults);
		
		JButton btnNewButton_4 = new JButton("Top 3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_features.setText( "TOP 3"
						+"\n\n\nThis section will show the top 3 EPL teams."
						+"\n\nIf your team is not in it,don't worry!"
						+"\n\nYou surely can find your team in the Table section :)");
			}
		});
		btnNewButton_4.setBounds(10, 173, 85, 21);
		panel_1.add(btnNewButton_4);
	}
}
