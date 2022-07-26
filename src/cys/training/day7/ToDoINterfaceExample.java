package cys.training.day7;

public class ToDoINterfaceExample implements TodoExample {

	@Override
	public void addTask() {
		System.out.println("Adding task");
	}

	@Override
	public void deleteTask(int id) {

		System.out.println("Deletd task with id : " + id);
	}

	@Override
	public String displayTask() {

		System.out.println("List of task");
		return "Task";
	}

}
