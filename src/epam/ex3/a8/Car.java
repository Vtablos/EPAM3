package epam.ex3.a8;

import java.util.Date;

/**
 * Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 * Создать массив объектов. Вывести: a) список автомобилей заданной марки; b)
 * список автомобилей заданной модели, которые эксплуатируются больше n лет; c)
 * список автомобилей заданного года выпуска, цена которых больше указанной.
 */
public class Car {

	private int id;
	private String label;
	private String model;
	private int issueYear;
	private String color;
	private double price;
	private int number;

	public Car(int id, String label, String model, int issueYear, String color, double price, int number) {
		this.id = id;
		this.label = label;
		this.model = model;
		this.issueYear = issueYear;
		this.color = color;
		this.price = price;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String lable) {
		this.label = lable;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(int issueYear) {
		this.issueYear = issueYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", label=" + label + ", model=" + model + ", issueYear=" + issueYear + ", color="
				+ color + ", price=" + price + ", number=" + number + "]";
	}
}
