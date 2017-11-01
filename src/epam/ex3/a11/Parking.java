package epam.ex3.a11;

/**
 * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год
 * начала эксплуатации, Пробег. Создать массив объектов. Вывести: a) список
 * автобусов для заданного номера маршрута; b) список автобусов, которые
 * эксплуатируются больше заданного срока; c) список автобусов, пробег у которых
 * больше заданного расстояния.
 */
import java.util.ArrayList;
import java.util.List;

public class Parking {

	List<Bus> buses = new ArrayList<Bus>();

	public void addBus(Bus bus) {
		buses.add(bus);
	}

	public void getBusByRoutenumber(int number) {
		for (Bus bus : buses) {
			if (bus.getRouteNumber() == number) {
				System.out.println(bus);
			}
		}
	}
	
	public void getBusByTerm(int term){
		for (Bus bus: buses){
			if(2017 - bus.getIssueYear()>term){
				System.out.println(bus);
			}
		}
	}
	
	public void getBusByMileage(int mileage){
		for (Bus bus: buses){
			if (bus.getMileage()>mileage){
				System.out.println(bus);
			}
		}
	}
}
