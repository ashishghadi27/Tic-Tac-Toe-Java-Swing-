package files;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldo;
	public static Mainui window;
	int count=0,excount=0;
	String sb1="",sbutton="",sbutton_1="",sbutton_2="",sbutton_3="",sbutton_4="",sbutton_5="",sbutton_6="",sbutton_7="",check1="Cross",check2="Zero";
	int xcount,ocount;
	public JButton b1,button,button_1,button_2,button_3,button_4,button_5,button_6,button_7;
	int X,Y;
	public int xx,xy;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainui window = new Mainui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Mainui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	
	
		
	public void setter() {
		try {
			
		if(sb1.equals(sbutton)&&sbutton.equals(sbutton_1))
		{
			if(sb1.equals(check1)) xcount++;
			else if(sb1.equals(check2))
			{ ocount++;
			}
			sb1="";
			sbutton="";
			sbutton_1="";
			
		}
	
		else if(sbutton_2.equals(sbutton_3)&&sbutton_2.equals(sbutton_4))
				{
					if(sbutton_2.equals(check1)) xcount++;
					else if(sbutton_2.equals(check2))
					{ ocount++;
					}
					sbutton_2="";
					sbutton_3="";
					sbutton_4="";
				}
		else if(sbutton_5.equals(sbutton_6)&&sbutton_5.equals(sbutton_7))
		{
			if(sbutton_5.equals(check1)) xcount++;
			else if(sbutton_5.equals(check2))
			{ ocount++;
			}
			sbutton_5="";
			sbutton_6="";
			sbutton_7="";
			
		}
		else if(sb1.equals(sbutton_2)&&sbutton_2.equals(sbutton_5))
		{
			if(sb1.equals(check1)) xcount++;
			else if(sb1.equals(check2))
			{ ocount++;
			}
			sb1="";
			sbutton_2="";
			sbutton_5="";
			
		}
		else if(sbutton.equals(sbutton_3)&&sbutton.equals(sbutton_6))
		{
			if(sbutton.equals(check1)) xcount++;
			else if(sbutton.equals(check2))
			{ ocount++;
			}
			sbutton="";
			sbutton_3="";
			sbutton_6="";
			
		}
		else if(sbutton_1.equals(sbutton_4)&&sbutton_1.equals(sbutton_7))
		{
			if(sbutton_1.equals(check1)) xcount++;
			else if(sbutton_1.equals(check2))
			{ ocount++;
			}
			sbutton_1="";
			sbutton_4="";
			sbutton_7="";
			
		}
		else if(sb1.equals(sbutton_3)&&sbutton_3.equals(sbutton_7))
		{
			if(sb1.equals(check1)) xcount++;
			else if(sb1.equals(check2))
			{ ocount++;
			}
			sb1="";
			sbutton_3="";
			sbutton_7="";
			
		}
		else if(sbutton_1.equals(sbutton_3)&&sbutton_3.equals(sbutton_5))
		{
			if(sbutton_1.equals(check1)) xcount++;
			else if(sbutton_1.equals(check2))
			{ ocount++;
			}
			sbutton_1="";
			sbutton_3="";
			sbutton_5="";
			
		}
		
		textField.setText(Integer.toString(xcount));
		textFieldo.setText(Integer.toString(ocount));
		if(xcount==3) JOptionPane.showMessageDialog(null,"Player X has won");
		if(ocount==3) JOptionPane.showMessageDialog(null,"Player O has won");
		
		
				
		
		
		
	}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	
}
	
	

	private void initialize() {
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setName("frame");
		frame.setBackground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setBounds(100, 100, 905, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(0, 0, 511, 476);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton b1 = new JButton("");
		b1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
		b1.setBorder(new EmptyBorder(0, 0, 0, 0));
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					excount++;
				if(count%2==0)
				{
					b1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
					count++;
					sb1="Cross";
				}
				else {
					b1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zerowhite.png")));
					count++;
					sb1="Zero";
				}
				setter();
				
			
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
			
		});
		b1.setBounds(0, 0, 172, 160);
		panel.add(b1);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crossblack.png")));
					count++;
					sbutton="Cross";
				}
				else {
					button.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zeroblack.png")));
					count++;
					sbutton="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		button.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
		button.setBackground(new Color(255, 255, 255));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(170, 0, 172, 160);
		panel.add(button);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
					count++;
					sbutton_1="Cross";
				}
				else {
					button_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zerowhite.png")));
					count++;
					sbutton_1="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		button_1.setBounds(339, 0, 172, 160);
		panel.add(button_1);
		
		button_2 = new JButton("");
		button_2.setBackground(Color.WHITE);
		button_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crossblack.png")));
					count++;
					sbutton_2="Cross";
				}
				else {
					button_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zeroblack.png")));
					count++;
					sbutton_2="Zero";
				}
					setter();
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
			
		});
		button_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		button_2.setBounds(0, 158, 172, 160);
		panel.add(button_2);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_3.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
					count++;
					sbutton_3="Cross";
				}
				else {
					button_3.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zerowhite.png")));
					count++;
					sbutton_3="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		button_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		button_3.setBackground(Color.DARK_GRAY);
		button_3.setBounds(170, 158, 172, 160);
		panel.add(button_3);
		
		button_4 = new JButton("");
		button_4.setBackground(Color.WHITE);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_4.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crossblack.png")));
					count++;
					sbutton_4="Cross";
				}
				else {
					button_4.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zeroblack.png")));
					count++;
					sbutton_4="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			
			}
		});
		button_4.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
		button_4.setBounds(339, 158, 172, 160);
		panel.add(button_4);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
		button_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		button_5.setBackground(Color.DARK_GRAY);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_5.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
					count++;
					sbutton_5="Cross";
				}
				else {
					button_5.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zerowhite.png")));
					count++;
					sbutton_5="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		button_5.setBounds(0, 316, 172, 160);
		panel.add(button_5);
		
		button_6 = new JButton("");
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_6.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crossblack.png")));
					count++;
					sbutton_6="Cross";
				}
				else {
					button_6.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zeroblack.png")));
					count++;
					sbutton_6="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		button_6.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
		button_6.setBounds(170, 316, 172, 160);
		panel.add(button_6);
		
		button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					excount++;
					if(count%2==0)
				
				{
					button_7.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
					count++;
					sbutton_7="Cross";
				}
				else {
					button_7.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Zerowhite.png")));
					count++;
					sbutton_7="Zero";
				}
					setter();
				
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		button_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		button_7.setBackground(Color.DARK_GRAY);
		button_7.setBounds(339, 316, 172, 160);
		panel.add(button_7);
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		sidepanel.setBounds(509, 0, 396, 476);
		frame.getContentPane().add(sidepanel);
		sidepanel.setLayout(null);
		
		
		JLabel lblPlayerX = new JLabel("Player X:");
		lblPlayerX.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 40));
		lblPlayerX.setForeground(new Color(255, 255, 204));
		lblPlayerX.setBounds(54, 208, 147, 50);
		sidepanel.add(lblPlayerX);
		
		JLabel lblPlayerO = new JLabel("Player O:");
		lblPlayerO.setForeground(new Color(255, 255, 204));
		lblPlayerO.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 40));
		lblPlayerO.setBounds(54, 359, 161, 50);
		sidepanel.add(lblPlayerO);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		textField.setOpaque(false);
		textField.setFont(new Font("Calibri", Font.PLAIN, 25));
		textField.setForeground(Color.WHITE);
		textField.setCaretColor(Color.WHITE);
		textField.setBounds(239, 221, 85, 31);
		sidepanel.add(textField);
		textField.setColumns(10);
		
		textFieldo = new JTextField();
		textFieldo.setEditable(false);
		textFieldo.setOpaque(false);
		textFieldo.setForeground(Color.WHITE);
		textFieldo.setFont(new Font("Calibri", Font.PLAIN, 25));
		textFieldo.setColumns(10);
		textFieldo.setCaretColor(Color.WHITE);
		textFieldo.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		textFieldo.setBounds(239, 372, 85, 31);
		sidepanel.add(textFieldo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_3.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_4.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_5.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_6.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_7.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				textField.setText("0");
				textFieldo.setText("0");
				sb1="";sbutton="";sbutton_1="";sbutton_2="";sbutton_3="";sbutton_4="";sbutton_5="";sbutton_6="";sbutton_7="";
				count=0;
				xcount=0;
				ocount=0;
			}
		});
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setIcon(new ImageIcon(Mainui.class.getResource("/resources/icons8-Refresh-48.png")));
		btnNewButton.setBounds(262, 76, 97, 57);
		sidepanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_3.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_4.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_5.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				button_6.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Untitled.png")));
				button_7.setIcon(new ImageIcon(Mainui.class.getResource("/resources/green.jpg")));
				sb1="";sbutton="";sbutton_1="";sbutton_2="";sbutton_3="";sbutton_4="";sbutton_5="";sbutton_6="";sbutton_7="";
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon(Mainui.class.getResource("/resources/icons8-Available Updates Filled-50.png")));
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBounds(54, 76, 97, 58);
		sidepanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setIcon(new ImageIcon(Mainui.class.getResource("/resources/Crosswhite.png")));
		btnNewButton_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(355, 13, 29, 22);
		sidepanel.add(btnNewButton_2);
		
		JLabel sidebar = new JLabel("");
		sidebar.setIcon(new ImageIcon(Mainui.class.getResource("/resources/vasco_da_gama_bridge_black_and_white_photography-wallpaper-1920x1080.jpg")));
		sidebar.setBounds(0, 0, 396, 476);
		sidepanel.add(sidebar);
		sidebar.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				xx=e.getX();
				xy=e.getY();
			}
		});
		sidebar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent a) {
				X=a.getXOnScreen();
				Y=a.getYOnScreen();
				window.frame.setLocation(X-xx, Y-xy);
				
			}
		});
		
		
		
		
	
			}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		try {
			window = new Mainui();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
