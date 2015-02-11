import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Uppgift_4_del1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
					Uppgift_4_del1 frame = new Uppgift_4_del1();
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
	public Uppgift_4_del1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563,453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel humanPic = new JLabel("");
		humanPic.setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/human.png")));
		humanPic.setBounds(413, 13, 97, 89);
		humanPic.setEnabled(false);
		
		contentPane.add(humanPic);
		
		final JLabel dogPic = new JLabel("");
		dogPic.setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/dog.png")));
		dogPic.setBounds(413, 61, 97, 89);
		dogPic.setEnabled(false);
		contentPane.add(dogPic);
		
		
		textHuman = new JTextField();
		textHuman.setBounds(25, 26, 252, 22);
		contentPane.add(textHuman);
		textHuman.setColumns(10);
		
		textDog = new JTextField();
		textDog.setText("");
		textDog.setBounds(25, 77, 252, 22);
		contentPane.add(textDog);
		textDog.setColumns(10);
		errorArea.setEditable(false);

		errorArea.setBounds(25, 287, 354, 89);
		contentPane.add(errorArea);
		infoArea.setEditable(false);
		
		
		infoArea.setBounds(25, 163, 354, 80);
		contentPane.add(infoArea);
		
		
		
		JButton btnNewButton = new JButton("Add human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textHuman.getText().length() > 3) {
					human = new Human(textHuman.getText());
					humanPic.setEnabled(true);
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
				dogPic.setEnabled(true);
				System.out.println("dog owned by the human");
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
				try{
					if (human.getName() == null) {
						errorArea.setText(human.getErrorMsg());
					} else {
						infoArea.setText(human.getName()
								+ " har en hund som heter "
								+ human.getDog().getName());
					}
				}
			catch(NullPointerException e){
				errorArea.setText("error!!!");
			}
			}});
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
