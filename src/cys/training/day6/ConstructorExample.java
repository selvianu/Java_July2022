package cys.training.day6;

public class ConstructorExample {
	public String name;
	public char gender;
	public boolean eligible;

// Default Constructor - to initialize values
	// if not initialized, default values invoked because of default constructor
	public ConstructorExample() {
		name = "Abi";
		gender = 'f';
		eligible = true;
	}

	public ConstructorExample(String name, boolean eligible) {
		System.out.println("Parametrized constructor...");
		this.name = name;
		this.eligible = eligible;
	}

	public ConstructorExample(String name, char gender) {
		this.name = name;
		this.gender=gender;
	}

	@Override
	public String toString() {
		return "ConstructorExample [name=" + name + ", gender=" + gender + ", eligible=" + eligible + "]";
	}

}
