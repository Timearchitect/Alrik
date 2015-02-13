import javax.swing.ImageIcon;

public class Cat extends Mammal {
	private int numberOfLifes;
	
	public Cat(String _latinname,int _numberOfLifes) {
		super(_latinname);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/cat.png")));
		super.setGestationTime(6);
		this.numberOfLifes= _numberOfLifes;
	}
	public Cat(String _name,String _latinname,int _numberOfLifes) {
		super(_latinname);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/cat.png")));
		super.setGestationTime(6);
		super.setfriendlyname(_name);
		this.numberOfLifes= _numberOfLifes;
	}
	public int getNumberOfLifes() {
		return numberOfLifes;
	}

	public void setNumberOfLifes(int numberOfLifes) {
		this.numberOfLifes = numberOfLifes;
	}

//	@Override
	public String getInfo() {
		return "The " + String.valueOf(this.getClass()).substring(6,String.valueOf(this.getClass()).length()) +" "+ super.getfriendlyname() + " lat:" + super.getLatinName() +"nurses for:"+ super.getGestationTime() +" months and has "+ this.getNumberOfLifes() + " lives"+ "\n" ;
	}

}
