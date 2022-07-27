package cys.training.day8.demo;

public class AnnaUniversity extends University {
	public String name = "Parthiban";

	public void eligible() {
		int attendancePercent = 65;
		if (attendancePercent >= 75) {
			System.out.println("eligible");
		} else
			System.out.println("not eligile");
	}

	public void techSeminar() {
		super.eligible();
		System.out.println("Seminars conducted" + name);

		System.out.println("Seminars conducted" + super.name);
	}
}
