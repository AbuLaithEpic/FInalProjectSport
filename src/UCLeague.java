import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UCLeague extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UCLeague frame = new UCLeague();
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
	public UCLeague() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("TABLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uclStandings standings = new uclStandings();
				dispose();
				standings.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(214, 270, 105, 47);
		contentPane.add(btnNewButton);
		
		JButton btnPlayers = new JButton("PLAYERS");
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uclPlayers player = new uclPlayers();
				dispose();
				player.setVisible(true);
			}
		});
		btnPlayers.setBounds(419, 270, 105, 47);
		contentPane.add(btnPlayers);
		
		JButton btnMatches = new JButton("MATCHES");
		btnMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uclMatches match = new uclMatches();
				dispose();
				match.setVisible(true);
			}
		});
		btnMatches.setBounds(214, 342, 105, 47);
		contentPane.add(btnMatches);
		
		JButton btnResults = new JButton("RESULTS");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uclResults result = new uclResults();
				result.setVisible(true);
			}
		});
		btnResults.setBounds(419, 342, 105, 47);
		contentPane.add(btnResults);
		
		JButton btnNewButton_4 = new JButton("return");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenuSport.main(null);
			}
		});
		btnNewButton_4.setBounds(566, 368, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UCLeague.class.getResource("/Image/UCL.png")));
		lblNewLabel.setBounds(225, 10, 249, 238);
		contentPane.add(lblNewLabel);
	}
}
