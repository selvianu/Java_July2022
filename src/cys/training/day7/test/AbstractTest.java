package cys.training.day7.test;

import cys.training.day7.TaskToDoAb2;

public class AbstractTest {

	public static void main(String[] args) {

		TaskToDoAb2 task = new TaskToDoAb2();
		String taskName = task.addTask("Design DAO");
		boolean validateTask = task.validateTask("Validation", 56);
		System.out.println(taskName + "  " + validateTask);
	}

}
