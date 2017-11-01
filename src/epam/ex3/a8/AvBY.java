package epam.ex3.a8;

/**
 * Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
 * Создать массив объектов. Вывести: a) список автомобилей заданной марки; b)
 * список автомобилей заданной модели, которые эксплуатируются больше n лет; c)
 * список автомобилей заданного года выпуска, цена которых больше указанной.
 */
import java.util.ArrayList;
import java.util.List;

public class AvBY {

	List<Car> cars = new ArrayList<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void getCarsByLabel(String label){
		for (Car car: cars){
			if(car.getLabel().equals(label)){
				System.out.println(car);
			}
		}
	}
	
	public void getCarByModelYear(String model, int year){
		for (Car car: cars){
			if(car.getModel().equals(model) && (2017-car.getIssueYear())>year){
				System.out.println(car);
			}
		}
	}
	
	public void getCarByYearPrice(int year, double price){
		for (Car car: cars){
			if(car.getIssueYear()==year && car.getPrice()>price){
				System.out.println(car);
			}
		}
	}
}
