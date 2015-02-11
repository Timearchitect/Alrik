import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Animal {
private String latinName;
private String name="\"default\"";
private JLabel icon= new JLabel("icon"); 

public void setIconPic(){
		icon.setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/human.png")));
	}

	public JLabel getIconPic(){
		return icon;
	}

	public Animal(String _latinname){
		this.latinName=_latinname;
		
	}
	public abstract String getInfo();

	public String getfriendlyname(){
		return name;
	}
	public String getLatinName() {
		return latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	public void setfriendlyname(String name){
		this.name= name;
	}
	
}
