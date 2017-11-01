package epam.ex3.a1;

/**
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа. Создать массив объектов. Вывести: a) список
 * студентов заданного факультета; b) списки студентов для каждого факультета и
 * курса; c) список студентов, родившихся после заданного года; d) список
 * учебной группы.
 */
public class Main {

	public static void main(String[] args) {

		University university = new University();
		university.createStudents();
		System.out.println("------------------------------------------------");
		university.showListOfStudents();
		System.out.println("------------------------------------------------");
		university.getStudentsByFakc("SEO");
		System.out.println("------------------------------------------------");
		university.getStudentsByGroup("sth-12");
		System.out.println("------------------------------------------------");
		university.getStudentsByKursFac(4, "MJ");
		System.out.println("------------------------------------------------");
		university.getStudentsByDate(1995);

	}

}
