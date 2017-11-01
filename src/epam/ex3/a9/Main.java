package epam.ex3.a9;
/**
 * Product: id, Наименование, UPC, Производитель, Цена, Срок хранения,
 * Количество. Создать массив объектов. Вывести: a) список товаров для заданного
 * наименования; b) список товаров для заданного наименования, цена которых не
 * превосходит заданную; c) список товаров, срок хранения которых больше
 * заданного.
 */
public class Main {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
		shop.addProduct(new Product(1, "milk", 1111111111L, "", 15, 7 , 100));
		shop.addProduct(new Product(2, "milk", 2222111111L, "", 10, 8 , 150));
		shop.addProduct(new Product(3, "butter", 3333111111L, "", 23, 62 , 200));
		shop.addProduct(new Product(4, "butter", 3343111111L, "", 25, 62 , 200));
		shop.addProduct(new Product(5, "sour", 1115555111L, "", 19, 31 , 50));
		shop.addProduct(new Product(1, "cocos", 1177771111L, "", 1500, 300 , 2));
		
		
		
		shop.getProductByTitle("butter");
		System.out.println("-------------------------------------------------------");
		shop.getProductByTitleprice("milk", 20);
		System.out.println("-------------------------------------------------------");
		shop.getProductByTerm(200);

	}

}
