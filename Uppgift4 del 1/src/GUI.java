import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textHuman;
	private JTextField textDog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430,453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(289, 25, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(289, 76, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("print info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(289, 125, 97, 25);
		contentPane.add(btnNewButton_2);
		
		textHuman = new JTextField();
		textHuman.setBounds(25, 26, 252, 22);
		contentPane.add(textHuman);
		textHuman.setColumns(10);
		
		textDog = new JTextField();
		textDog.setBounds(25, 77, 252, 22);
		contentPane.add(textDog);
		textDog.setColumns(10);
		
		JTextArea errorArea = new JTextArea();
		errorArea.setBounds(25, 287, 354, 89);
		contentPane.add(errorArea);
		
		JTextArea infoArea = new JTextArea();
		infoArea.setBounds(25, 163, 354, 80);
		contentPane.add(infoArea);
		
		JLabel lblNewLabel = new JLabel("Error");
		lblNewLabel.setBounds(35, 258, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(35, 129, 56, 16);
		contentPane.add(lblInfo);
	}
}
