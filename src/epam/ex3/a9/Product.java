package epam.ex3.a9;

import java.util.Date;

/**
 * Product: id, Наименование, UPC, Производитель, Цена, Срок хранения,
 * Количество. Создать массив объектов. Вывести: a) список товаров для заданного
 * наименования; b) список товаров для заданного наименования, цена которых не
 * превосходит заданную; c) список товаров, срок хранения которых больше
 * заданного.
 */
public class Product {

	private int id;
	private String title;
	private long UPC;
	private String producer;
	private double price;
	private int term;
	private int quantity;

	public Product(int id, String title, long uPC, String producer, double price, int term, int quantity) {
		this.id = id;
		this.title = title;
		UPC = uPC;
		this.producer = producer;
		this.price = price;
		this.term = term;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getUPC() {
		return UPC;
	}

	public void setUPC(long uPC) {
		UPC = uPC;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", UPC=" + UPC + ", producer=" + producer + ", price=" + price
				+ ", term=" + term + ", quantity=" + quantity + "]";
	}

}
