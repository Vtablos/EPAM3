package epam.ex3.a7;

import java.sql.Time;
import java.util.Date;

/**
 * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет,
 * Кредит, Время городских и междугородных разговоров. Создать массив объектов.
 * Вывести: a) сведения об абонентах, у которых время внутригородских разговоров
 * превышает заданное; b) сведения об абонентах, которые пользовались
 * междугородной связью; c) сведения об абонентах в алфавитном порядке.
 */
public class Phone {

	private int id;
	private String surname;
	private String name;
	private String midlename;
	private String adress;
	private int cardNumber;
	private double deb;
	private double kr;
	private double inTime;
	private double outTime;

	public Phone(int id, String surname, String name, String midlename, String adress, int cardNumber, double deb,
			double kr, double inTime, double outTime) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.midlename = midlename;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.deb = deb;
		this.kr = kr;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMidlename() {
		return midlename;
	}

	public void setMidlename(String midlename) {
		this.midlename = midlename;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getDeb() {
		return deb;
	}

	public void setDeb(double deb) {
		this.deb = deb;
	}

	public double getKr() {
		return kr;
	}

	public void setKr(double kr) {
		this.kr = kr;
	}

	public double getInTime() {
		return inTime;
	}

	public void setInTime(double inTime) {
		this.inTime = inTime;
	}

	public double getOutTime() {
		return outTime;
	}

	public void setOutTime(double outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", surname=" + surname + ", name=" + name + ", midlename=" + midlename + ", adress="
				+ adress + ", cardNumber=" + cardNumber + ", deb=" + deb + ", kr=" + kr + ", inTime=" + inTime
				+ ", outTime=" + outTime + "]";
	}

}
