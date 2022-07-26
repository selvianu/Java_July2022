package cys.training.day7;

public class TaskToDoAb2 extends TaskToDoAb1 {

	@Override
	public boolean validateTask(String name, int id) {
		if ((id < 0) || (name.length() < 4))
			return false;
		else
			return true;
	}

	@Override
	public String addTask(String name) {
		return name;
	}

}
