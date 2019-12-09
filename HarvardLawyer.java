
public class HarvardLawyer extends Lawyer {

	public void showSalary() {
		System.out.println("My salary is $48,000");
	}

	public void showVacation() {
		System.out.println("I receive 13 days of vacation.");
	}

	// getters
	// Harvard Lawyers make 20% more than regular Lawyers

	private double salary;

	public double getSalary() {
		this.salary = .20 * super.getSalary();
		return this.salary + super.getSalary();
	}

	// 3 extra vacation days
	public int getVacationDays() {
		return 3 + super.getVacationDays(); // 13
	}

	// Use same pink form as regular lawyers
	public String getVacationForm() {
		return "pinkpinkpinkpink";
	}

}
