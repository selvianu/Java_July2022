package cys.training.day7.test;

public class UserA extends User {

	public String addTask(String name) {
		System.out.println("adding task in child class");
		return name;
	}

	public String updateTaskStatus() {
		System.out.println("Updating task status");
		return null;
	}

	public String displayTask() {
		System.out.println("List of task");
		return null;
	}

}
