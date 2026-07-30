package br.com.joaofelipefaria.java.samples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import br.com.joaofelipefaria.java.samples.dto.Employee;

public class FilterWithDetails {
	private List<Employee> lista;

	private static final List<String> NAMES = List.of("John", "Paul", "Ringo", "George", "Elvis", "Elis", "Janis",
			"Elton", "Eric", "Billy", "Carmen", "Joao", "Tom");
	private static final List<String> DEPARTMENTS = List.of("HR", "Tech", "Admin");
	private final ThreadLocalRandom random = ThreadLocalRandom.current();

	private void populate() {
		lista = NAMES.stream().map(this::createEmployee).toList();
	}

	private Employee createEmployee(String name) {
		int yob = random.nextInt(1950, 2008);
		int mob = random.nextInt(1, 13);
		int dayOb = random.nextInt(1, 29);

		String dob = "%02d%02d%04d".formatted(dayOb, mob, yob);
		double salary = BigDecimal.valueOf(
				random.nextDouble(1000, 4001))
				.setScale(2, RoundingMode.HALF_UP)
				.doubleValue();
		String dept = DEPARTMENTS.get(random.nextInt(DEPARTMENTS.size()));
		Employee e = new Employee(name, dob, salary, dept);
		return e;
	}

	private List<Employee> getLista() {
		return lista;
	}

	private static int calculateAte(String dob) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
		LocalDate birthDate = LocalDate.parse(dob, dtf);
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

	public static void main(String... args) {
		FilterWithDetails app = new FilterWithDetails();
		app.populate();
		System.out.println(app.getLista());
		Map<String, List<Employee>> map = app.getLista().stream().filter(emp -> {
			int age = calculateAte(emp.dob());
			return age >= 25 && age <= 45 && emp.salary() > 1750.0;
		}).collect(Collectors.groupingBy(Employee::department));
		System.out.println(map);
	}
}
