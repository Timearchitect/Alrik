
public abstract class Mammal extends Animal{
	private int gestationTime;

public Mammal(String _latinname) {
		super(_latinname);
	}
public int getGestationTime(){
	return gestationTime;
}

public void setGestationTime(int _gestationTime){
	this.gestationTime= _gestationTime;
}


}
