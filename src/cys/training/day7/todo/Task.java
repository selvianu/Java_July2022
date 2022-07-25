package cys.training.day7.todo;

public class Task {
	private String name;
	private int id;
	private String status;

	public Task() {
		status = "pending";
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", id=" + id + ", status=" + status + "]";
	}

}
