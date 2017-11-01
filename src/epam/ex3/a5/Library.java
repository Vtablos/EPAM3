package epam.ex3.a5;

import java.util.ArrayList;
import java.util.List;

/**
 *  Book: id, Название, Автор (ы), Издательство, Год издания, Количество
 * страниц, Цена, Тип переплета. Создать массив объектов. Вывести: a) список
 * книг заданного автора; b) список книг, выпущенных заданным издательством; c)
 * список книг, выпущенных после заданного года.s
 */

public class Library {
	
	List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book){
		books.add(book);
	}
	
	public void showBooksByAuthor(String author){
		for (Book book: books){
			if(book.getAuthor().equals(author)){
				System.out.println(book);
			}
		}
	}
	
	public void showBooksByPublish(String publishing){
		for (Book book: books){
			if(book.getPublishing().equals(publishing)){
				System.out.println(book);
			}
		}
	}
	public void showBooksByYear(int year){
		for (Book book: books){
			if(book.getYear()> year){
				System.out.println(book);
			}
		}
	}
}
