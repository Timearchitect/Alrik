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
	JTextArea infoArea = new JTextArea();
	JTextArea errorArea = new JTextArea();
	Human human;

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
		
		textHuman = new JTextField();
		textHuman.setBounds(25, 26, 252, 22);
		contentPane.add(textHuman);
		textHuman.setColumns(10);
		
		textDog = new JTextField();
		textDog.setText("");
		textDog.setBounds(25, 77, 252, 22);
		contentPane.add(textDog);
		textDog.setColumns(10);

		errorArea.setBounds(25, 287, 354, 89);
		contentPane.add(errorArea);
		
		
		infoArea.setBounds(25, 163, 354, 80);
		contentPane.add(infoArea);
		
		
		
		
		JButton btnNewButton = new JButton("Add human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textHuman.getText().length() > 3) {
					human = new Human(textHuman.getText());
					System.out.println("human created");
				} else {
					errorArea.setText("to short name!!");
				}
			}
		});
		btnNewButton.setBounds(289, 25, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human!=null){
				human.buyDog(new Dog(textDog.getText()));
				System.out.println("dog owend by the human");
				}else{
					errorArea.setText("no human for the dog");
				System.out.println("no human for the dog");
				}
			}
		});
		btnNewButton_1.setBounds(289, 76, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("print info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(human.getName()==null){
				errorArea.setText(human.getErrorMsg());
				}else{
					infoArea.setText(human.getName()+" har en hund som heter "+human.getDog().getName());
				}
			}
		});
		btnNewButton_2.setBounds(289, 125, 97, 25);
		contentPane.add(btnNewButton_2);
		

		JLabel lblNewLabel = new JLabel("Error");
		lblNewLabel.setBounds(35, 258, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(35, 129, 56, 16);
		contentPane.add(lblInfo);
	}
}
