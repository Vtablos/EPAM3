package epam.ex3.a5;

public class Main {
	/**
	 *  Book: id, Название, Автор (ы), Издательство, Год издания, Количество
	 * страниц, Цена, Тип переплета. Создать массив объектов. Вывести: a) список
	 * книг заданного автора; b) список книг, выпущенных заданным издательством;
	 * c) список книг, выпущенных после заданного года.s
	 */
	public static void main(String[] args) {

		Library library = new Library();
		
		library.addBook(new Book(1, "Stoned", "Craig", "LOL", 1983, 455, 10, "rude"));
		library.addBook(new Book(2, "Phoned", "Praig", "SSS", 1986, 455, 10, "soft"));
		library.addBook(new Book(3, "Cloned", "Lraig", "SSS", 1988, 455, 10, "rude"));
		library.addBook(new Book(4, "Joined", "Craig", "HHH", 1982, 455, 10, "soft"));
		library.addBook(new Book(5, "Dieed", "Mraig", "FFF", 1988, 455, 10, "rude"));

		
		library.showBooksByAuthor("Craig");
		System.out.println("-------------------------------------------------------------");
		library.showBooksByPublish("SSS");
		System.out.println("-------------------------------------------------------------");
		library.showBooksByYear(1987);
	}
	
}