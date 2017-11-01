package epam.ex3.a1;

import java.util.Date;

/**
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа. Создать массив объектов. Вывести: a) список
 * студентов заданного факультета; b) списки студентов для каждого факультета и
 * курса; c) список студентов, родившихся после заданного года; d) список
 * учебной группы.
 */
public class Student {

	private int id;
	private String surname;
	private String name;
	private String midlename;
	private Date dateOfbirth;
	private String adress;
	private int phoneNumber;
	private String fakultet;
	private int kurs;
	private String group;

	public Student() {
	}

	public Student(int id, String surname, String name, String midlename, Date dateOfbirth, String adress, int phoneNumber,
			String fakultet, int kurs, String group) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.midlename = midlename;
		this.dateOfbirth = dateOfbirth;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.fakultet = fakultet;
		this.kurs = kurs;
		this.group = group;
	}

	public String getAdres() {
		return adress;
	}

	public Date getDateOfbirth() {
		return dateOfbirth;
	}

	public String getFac() {
		return fakultet;
	}

	public String getGroup() {
		return group;
	}

	public int getId() {
		return id;
	}

	public int getKurs() {
		return kurs;
	}

	public String getName() {
		return name;
	}

	public String getMidlename() {
		return midlename;
	}

	public String getSurname() {
		return surname;
	}

	public int getTelefon() {
		return phoneNumber;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = new Date(1983, 10, 10);
	}

	public void setFac(String fakultet) {
		this.fakultet = fakultet;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKurs(int kurs) {
		this.kurs = kurs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMidlename(String midlename) {
		this.midlename = midlename;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setTelefon(int telefon) {
		this.phoneNumber = telefon;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", surname=" + surname + ", name=" + name + ", midlename=" + midlename
				+ ", dateOfbirth=" + dateOfbirth + ", adress=" + adress + ", telefon=" + phoneNumber + ", fakultet="
				+ fakultet + ", kurs=" + kurs + ", group=" + group + "]";
	}

}
