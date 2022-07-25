package cys.training.day6;

public class ExampleEncapsulation {

	private String name;

	public String setName(String name) {
		this.name=name;
		return name;
	}

	public void getName() {
		System.out.println("Getting name using getters : " + name);
	}

}
