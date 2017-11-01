package epam.ex3.a5;

/**
 *  Book: id, Название, Автор (ы), Издательство, Год издания, Количество
 * страниц, Цена, Тип переплета. Создать массив объектов. Вывести: a) список
 * книг заданного автора; b) список книг, выпущенных заданным издательством; c)
 * список книг, выпущенных после заданного года.s
 */

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishing;
	private int year;
	private int pageNumber;
	private int price;
	private String type;
	

	public Book(int id, String title, String author, String publishing, int year, int pageNumber, int price,
			String type) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.year = year;
		this.pageNumber = pageNumber;
		this.price = price;
		this.type = type;
	}

	public Book(String title, String author, String publishing, int year, int pageNumber) {
		super();
		this.title = title;
		this.author = author;
		this.publishing = publishing;
		this.year = year;
		this.pageNumber = pageNumber;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishing=" + publishing + ", year="
				+ year + ", pageNumber=" + pageNumber + ", price=" + price + ", type=" + type + "]";
	}

}
