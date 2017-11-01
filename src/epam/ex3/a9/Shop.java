package epam.ex3.a9;

/**
 * Product: id, Наименование, UPC, Производитель, Цена, Срок хранения,
 * Количество. Создать массив объектов. Вывести: a) список товаров для заданного
 * наименования; b) список товаров для заданного наименования, цена которых не
 * превосходит заданную; c) список товаров, срок хранения которых больше
 * заданного.
 */
import java.util.ArrayList;
import java.util.List;

public class Shop {

	List<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void getProductByTitle(String title){
		for (Product product: products){
			if(product.getTitle().equals(title)){
				System.out.println(product);
			}
		}
	}
	
	public void getProductByTitleprice(String title, double price){
		for (Product product: products){
			if(product.getTitle().equals(title) && product.getPrice()<=price){
				System.out.println(product);
			}
		}
	}
	
	public void getProductByTerm(int term){
		for (Product product: products){
			if(product.getTerm()>term){
				System.out.println(product);
			}
		}
	}
}
