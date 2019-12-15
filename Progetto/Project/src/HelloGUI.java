import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class HelloGUI extends JFrame {

	private JPanel contentPane;
	public int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloGUI frame = new HelloGUI();
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
	public HelloGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel Label = new JLabel("Hello World");
		Label.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
		Label.setBounds(97, 49, 586, 348);
		contentPane.add(Label);
		Label.setVisible(false);
		
		
		JButton Button = new JButton("Press Here");
		Button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Label.setVisible(true);
				Button.setVisible(false);
			}
		});
		Button.setBounds(188, 157, 376, 159);
		contentPane.add(Button);
		
	}
}
