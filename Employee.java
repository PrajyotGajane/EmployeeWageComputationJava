public class Employee{
	public static void main(String[] args){
	System.out.println("Welcome to Employee Wage Computation Program\n");
	int attendance = (int)((Math.random() * 10) % 2);
        System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
	}
}
