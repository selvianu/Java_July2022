package cys.training.day6;

public class User {
	private String name;
	private int id;
	private String role;

	public User() {
		System.out.println("Default Constructor");
	}

	public User(String name, int id, String role) {
		this.name = name;
		this.id = id;
		this.role = role;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", role=" + role + "]";
	}

}
