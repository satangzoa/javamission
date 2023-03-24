package ucmap.java.mission5.entity;

public class Ship extends Vehicle{
	private int replacement;
	
	
	public Ship() {}
	
	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		super(modelName,maxSpeed,numberLimit);
		this.replacement = replacement;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 배 수 량 : " + replacement + "톤");
	}


	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

}
