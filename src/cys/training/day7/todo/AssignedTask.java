package cys.training.day7.todo;

public class AssignedTask {
//model
	Task task = new Task();

	public void addTask() {
		// validator
		// Scanner
		task.setId(45);
		task.setName("Encapsulation");
		task.setStatus("In progress");
	}

	public void displayTask() {
		System.out.println(task.getId());
		System.out.println("Task Name : " + task.getName() + "  Status : " + task.getStatus());
	}

}
