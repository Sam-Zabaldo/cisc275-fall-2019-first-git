class Animal {

	String name; 
	int legs;

	public int getLegs() {
		return legs; 
	}

}

class Dog extends Animal {

	public Dog(String name, int numLegs) {
		this.name = name; 
		this.legs = legs; 
	}

	@Override
	public String toString() {
		return super.name; 
	}
	
}
