package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rahul", 100));
		employees.add(new Employee("Varun", 200));
		employees.add(new Employee("Vineet", 2000));
		employees.add(new Employee("Mohit", 3000));
		employees.add(new Employee("Harsh", 5000));

		// Filter employees with salary less than 1000

		List<Employee> employeeWithSalaryBelowThousand = employees.stream()
				.filter(employee -> employee.getSalary() < 1000).collect(Collectors.toList());

		System.out.println(employeeWithSalaryBelowThousand);

		employeeWithSalaryBelowThousand = employees.stream().filter(isSalaryLessThanThousand())
				.collect(Collectors.toList());

		System.out.println(employeeWithSalaryBelowThousand);

		List<Employee> sortedEmployeesBySalary = employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
			}

		}).collect(Collectors.toList());

		System.out.println(sortedEmployeesBySalary);

		sortedEmployeesBySalary = employees.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.collect(Collectors.toList());

		System.out.println(sortedEmployeesBySalary);

		List<Employee> sortedEmployeesByName = employees.stream()
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

		System.out.println(sortedEmployeesByName);

		// Get sum of all their salaries
		double sum = employees.stream().map(Employee::getSalary).reduce(0.0, (x, y) -> x + y);
		
		// Arrays stream


	}

	private static Predicate<Employee> isSalaryLessThanThousand() {
		return employee -> employee.getSalary() < 1000 ? true : false;
	}

}
