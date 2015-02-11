import javax.swing.ImageIcon;

public class Dog extends Mammal{
	private Boolean stupid;
	public Dog(String _name){
		super("default");
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/dog.png")));
		 setName( _name);
	}
	public Dog(String _latinName,boolean _stupid){
		super(_latinName);
		super.setGestationTime(8);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/dog.png")));

		 this.stupid=_stupid;
	}
	public Dog(String _name,String _latinName,boolean _stupid){
		super(_latinName);
		super.setGestationTime(8);
		super.getIconPic().setIcon(new ImageIcon(Uppgift_4_del1.class.getResource("/graphics/dog.png")));

		super.setfriendlyname(_name);
		 this.stupid=_stupid;
	}
	
	public Boolean getStupid() {
		return stupid;
	}

	public void setStupid(Boolean stupid) {
		this.stupid = stupid;
	}
	
	public String getName() {
		return super.getfriendlyname();
	}

	public void setName(String _name) {
		super.setfriendlyname(_name); 
	}
	
	//@Override
	public String getInfo() {
		 return "The "+String.valueOf(this.getClass()).substring(6,String.valueOf(this.getClass()).length())+" "+ super.getfriendlyname() + " lat:" + super.getLatinName() +"nurses for:"+ super.getGestationTime() +" months and is stupid: "+ this.getStupid() +"\n";
	}
}
