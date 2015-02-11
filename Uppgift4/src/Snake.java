import javax.swing.ImageIcon;

public class Snake extends Animal {
	private boolean poisonus;
	

	public Snake(String _latinName, boolean _poisonus) {
		super(_latinName);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/snake.png")));
		this.poisonus = _poisonus;
	}
	public Snake(String _name,String _latinName, boolean _poisonus) {
		super(_latinName);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/snake.png")));
		super.setfriendlyname(_name);
		this.poisonus = _poisonus;
	}

	public boolean isPoisonus() {
		return poisonus;
	}

//	@Override
	public String getInfo() {
		return "The " + String.valueOf(this.getClass()).substring(6,String.valueOf(this.getClass()).length()) + " " + super.getfriendlyname() + " lat: "
				+ super.getLatinName() + " " +  " is poisonus:" + isPoisonus()+ "\n";
	}
}
