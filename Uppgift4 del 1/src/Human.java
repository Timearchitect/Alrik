public class Human {
	private Dog dog;
	private String name;
	private String errorMsg;

	
	public Human(String _name){
		if(_name.length() > 3){
		this.name=_name;
		}else{
			this.errorMsg="to short name";
			System.out.println("to short name");
		}
	}
	
	public Dog getDog() {
		return dog;
	}

	public void buyDog(Dog dog) {
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getErrorMsg() {
			return this.errorMsg;
	}
	
}
