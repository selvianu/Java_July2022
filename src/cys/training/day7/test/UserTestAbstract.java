package cys.training.day7.test;

public class UserTestAbstract {

	public static void main(String[] args) {

		// User user=new User();
		UserA user = new UserA();
		String addTask = user.addTask("To write POJO");
		System.out.println(addTask);
		int deleteTask = user.deleteTask(3);
		System.out.println(deleteTask);
		user.updateTaskStatus();
		user.displayTask();
	}

}
