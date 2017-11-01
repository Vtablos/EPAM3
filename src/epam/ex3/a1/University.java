package epam.ex3.a1;

/**
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа. Создать массив объектов. Вывести: a) список
 * студентов заданного факультета; b) списки студентов для каждого факультета и
 * курса; c) список студентов, родившихся после заданного года; d) список
 * учебной группы.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class University {

	List<Student> students = new ArrayList<Student>();

	public void createStudents() {
		students.add(new Student(1, "Cartman", "Eric", "Littlebuster", new Date(1995, 10, 10), "sthpark", 3356606,
				"SEO", 3, "sth-12"));
		students.add(new Student(2, "Marsh", "Stan", "Rendivich", new Date(1996, 1, 5), "sthpark", 1175606, "MJ", 4,
				"sth-117"));
		students.add(new Student(3, "Brohlovski", "Kile", "Green", new Date(1997, 4, 15), "sthpark", 1377190, "MJ", 4,
				"sth-12"));
		students.add(new Student(4, "McCormic", "Kenny", "Died", new Date(1998, 11, 16), "sthpark", 1656390, "QA", 2,
				"sth-1"));

	}

	public void showListOfStudents() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});
		for (Student student: students) {
			System.out.println(student);
		}
	}

	public void getStudentsByFakc(String fac) {
		for (Student student: students) {
			if (student.getFac().equals(fac)) {
				System.out.println(student);
			}
		}
	}

	public void getStudentsByGroup(String group) {
		for (Student student: students) {
			if (student.getGroup().equals(group)) {
				System.out.println(student);
			}
		}

	}

	public void getStudentsByKursFac(int kurs, String fac) {
		for (Student student: students) {
			if (student.getKurs() == kurs && student.getFac().equals(fac)) {
				System.out.println(student);
			}
		}

	}

	public void getStudentsByDate(int date) {
		for (Student student: students) {
			if (student.getDateOfbirth().getYear() > date) {
				System.out.println(student);
			}
		}
	}
}