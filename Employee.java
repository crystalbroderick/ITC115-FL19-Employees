// A class to represent employees in general.
public class Employee {
    public void applyForVacation() {
        System.out.println("Use the yellow vacation form.");
    }

    public void showHours() {
        System.out.println("I work 40 hours per week.");
    }

    public void showSalary() {
        System.out.println("My salary is $40,000.");
    }

    public void showVacation() {
        System.out.println("I receive 2 weeks vacation.");
    }
	public void VacationForm() {
		
	}

    public int getHours() {
        return 40;
    }
    
    public double getSalary() {
        return 40000.00;
    }
   
    public String getVacationForm() {
        return "yellow";
    }

    public int getVacationDays() {
    	return 10;
    }

}