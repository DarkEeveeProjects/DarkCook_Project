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

public class btnColor extends JFrame {

	private JPanel contentPane;
	public int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					btnColor frame = new btnColor();
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
	public btnColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ok = new JButton("Cambia Colore");
		ok.setBackground(Color.WHITE);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(i) {
				case 0:
					ok.setBackground(Color.ORANGE);
					i++;
					break;
				case 1:
					ok.setBackground(Color.RED);
					i++;
					break;
				case 2:
					ok.setBackground(Color.MAGENTA);
					i++;
					break;
				case 3:
					ok.setBackground(Color.BLUE);
					i++;
					break;
				case 4:
					ok.setBackground(Color.YELLOW);
					i++;
					break;
				case 5:
					ok.setBackground(Color.BLACK);
					i=0;
					break;
				}
			}
		});
		ok.setFont(new Font("Tahoma", Font.PLAIN, 40));
		ok.setBounds(229, 146, 345, 198);
		contentPane.add(ok);
	}
}
