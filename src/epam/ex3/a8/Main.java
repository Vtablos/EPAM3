package epam.ex3.a8;
/**
 * Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 * Создать массив объектов. Вывести: a) список автомобилей заданной марки; b)
 * список автомобилей заданной модели, которые эксплуатируются больше n лет; c)
 * список автомобилей заданного года выпуска, цена которых больше указанной.
 */
public class Main {

	public static void main(String[] args) {
		
		AvBY avBy = new AvBY();
		
		avBy.addCar(new Car(1, "BMW", "730", 2011, "yellow", 18000, 4526));
		avBy.addCar(new Car(2, "Audi", "A4", 2011, "red", 10000, 4476));
		avBy.addCar(new Car(3, "Mazda", "CX-7", 2007, "white", 11000, 5626));
		avBy.addCar(new Car(4, "BMW", "730", 2001, "green", 5000, 4236));
		avBy.addCar(new Car(5, "Opel", "Astra", 2009, "blue", 12000, 4556));
		
		avBy.getCarsByLabel("BMW");
		System.out.println("----------------------------------------------------");
		avBy.getCarByModelYear("730", 4);
		System.out.println("----------------------------------------------------");
		avBy.getCarByYearPrice(2011, 9000);

	}

}
