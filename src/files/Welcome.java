package files;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class Welcome {

	private JFrame frame;
	public static Mainui a1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 43));
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setBounds(213, 32, 173, 82);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				a1=new Mainui();
				Mainui.setVisible(true);
			}
		});
		btnPlay.setBackground(Color.BLACK);
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setFont(new Font("Calibri", Font.BOLD, 23));
		btnPlay.setBounds(248, 307, 97, 30);
		frame.getContentPane().add(btnPlay);
		
		JLabel lblNote = new JLabel("Rules:");
		lblNote.setForeground(Color.WHITE);
		lblNote.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblNote.setBounds(52, 127, 62, 57);
		frame.getContentPane().add(lblNote);
		
		JLabel lblBothPlayers = new JLabel("1: Both players have umlimited chances.");
		lblBothPlayers.setForeground(Color.WHITE);
		lblBothPlayers.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblBothPlayers.setBounds(124, 127, 411, 57);
		frame.getContentPane().add(lblBothPlayers);
		
		JLabel lblWhenScoreOf = new JLabel("2: When score of any on player reaches 3.");
		lblWhenScoreOf.setForeground(Color.WHITE);
		lblWhenScoreOf.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblWhenScoreOf.setBounds(126, 183, 432, 57);
		frame.getContentPane().add(lblWhenScoreOf);
		
		JLabel lblHesheWinsThe = new JLabel("He/She wins the game.");
		lblHesheWinsThe.setForeground(Color.WHITE);
		lblHesheWinsThe.setFont(new Font("Calibri", Font.PLAIN, 25));
		lblHesheWinsThe.setBounds(157, 229, 411, 57);
		frame.getContentPane().add(lblHesheWinsThe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Welcome.class.getResource("/resources/vasco_da_gama_bridge_black_and_white_photography-wallpaper-1920x1080.jpg")));
		lblNewLabel.setBounds(0, 0, 580, 474);
		frame.getContentPane().add(lblNewLabel);
	}
}
