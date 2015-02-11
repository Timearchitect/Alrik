import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

public class Uppgift_4_del2 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	String selectedAnimal="";
	private ArrayList<Animal> animal = new ArrayList<Animal>();
	private ArrayList<JLabel> label= new ArrayList<JLabel>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Uppgift_4_del2 frame = new Uppgift_4_del2();
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
	public Uppgift_4_del2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 30, 90, 310);
		contentPane.add(scrollPane_1);
		
		final JTree tree = new JTree();
		scrollPane_1.setViewportView(tree);
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION); // single select
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Animal") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("mammal");
						node_1.add(new DefaultMutableTreeNode("cat"));
						node_1.add(new DefaultMutableTreeNode("dog"));
					add(node_1);
					add(new DefaultMutableTreeNode("snake"));
				}
			}
		));
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
				
			    DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                        tree.getLastSelectedPathComponent();
			    /* if nothing is selected */ 
		        if (node == null) return;

		        Object nodeInfo = node.getUserObject();
		        selectedAnimal=nodeInfo.toString();
				System.out.println(nodeInfo.toString());
				
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 30, 678, 729);
		contentPane.add(scrollPane);

		final JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(4, 50));
		textArea.setMinimumSize(new Dimension(4, 200));
		textArea.setFont(new Font("Monospaced", Font.BOLD, 15));
		scrollPane.setViewportView(textArea);
		
		animal.add(new Snake("Slythder","nosdunu", true));
		animal.add(new Cat("nisse","cat", 9));
		animal.add(new Dog("Henry", "cancus dicima", true));

		showAnimals(textArea);
		
		

		
		JButton btnAdd = new JButton("add ...");
		contentPane.add(btnAdd);
		btnAdd.setBounds(0, 338, 97, 25);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (selectedAnimal){
				
				case "cat":
					animal.add(new Cat("Majsa","cat", 9));
					break;
				case "dog":
					animal.add(new Dog("DÖD", "cancus dicima", false));
					break;
				case "snake":
					animal.add(new Snake("Pentium","nosdunu", false));
					break;
				default:
					System.err.println("no valid!");
				}
				textArea.setText("");
				showAnimals(textArea); 
			}
		});


	

	}
	
	private void  showAnimals(JTextArea textArea){
		for (Animal a : animal) {
			textArea.append(a.getInfo());
			label.add(a.getIconPic());
			contentPane.add(label.get(label.size()-1));
			label.get(label.size()-1).setBounds(800,textArea.getCaretPosition()/1-50, 100, 80);
			System.out.println(textArea.getCaretPosition());
		}

	}
}
