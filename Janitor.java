
public class Janitor extends Employee {

	public void showHours() {
		System.out.println("I work 80 hours per week.");
	}

	public void showSalary() {
		System.out.println("My salary is $30,000.");
	}

	public void showVacation() {
		System.out.println("I receive 5 days of vacation.");
	}

	public void clean() {
		System.out.println("Workin' for the man.");
	}

	// Janitors work twice as many hours per week
	public int getHours() {
		return 2 * super.getHours();
	}

	// Janitors make $10k less than regular employees
	public double getSalary() {
		return super.getSalary() - 10000; // $30000
	}

	// Janitors get half as much vacation
	public int getVacationDays() {
		return super.getVacationDays() / 2;	// 5
	}

}
