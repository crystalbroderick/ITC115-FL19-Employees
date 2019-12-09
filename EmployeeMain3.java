public class EmployeeMain3 {
	public static void main(String[] args) {
		Employee empl = new Employee();
		Lawyer law = new Lawyer();
		Marketer mark = new Marketer();
		Secretary sec = new Secretary();
		Janitor jan = new Janitor();
		HarvardLawyer har = new HarvardLawyer();

		printInfo(empl);
		printInfo(law);
		printInfo(mark);
		printInfo(sec);
		printInfo(jan);
		jan.clean();
		System.out.println();
		printInfo(har);
	}

	public static void printInfo(Employee employee) {
		System.out.println(employee);
		employee.applyForVacation();
		System.out.println("Hours per week: " + employee.getHours());
		System.out.println("My salary is: " + employee.getSalary());
		System.out.println("Vacation Days: " + employee.getVacationDays());
		System.out.println(employee.getVacationForm());
		System.out.println();
	}
}