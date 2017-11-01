package epam.ex3.a4;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

/**
 *  Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки. Создать
 * массив объектов. Вывести: a) список абитуриентов, имеющих
 * неудовлетворительные оценки; b) список абитуриентов, у которых сумма баллов
 * выше заданной; c) выбрать заданное число n абитуриентов, имеющих самую
 * высокую сумму баллов (вывести также полный список абитуриентов, имеющих
 * полупроходную сумму).
 */

public class Abiturient {
	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private String address;
	private List<Integer> marks;

	public Abiturient(int id, String lastName, String firstName, String middleName, String address) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.address = address;
		marks = new ArrayList<Integer>();
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Abiturient [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", middleName="
				+ middleName + ", address=" + address + ", marks=" + marks + "]";
	}
}
