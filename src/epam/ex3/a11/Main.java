package epam.ex3.a11;

/**
 * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год
 * начала эксплуатации, Пробег. Создать массив объектов. Вывести: a) список
 * автобусов для заданного номера маршрута; b) список автобусов, которые
 * эксплуатируются больше заданного срока; c) список автобусов, пробег у которых
 * больше заданного расстояния.
 */
public class Main {

	public static void main(String[] args) {
		
		Parking parking = new Parking();
		
		parking.addBus(new Bus("Eric", 1655, 555, "Volvo", 2005, 150000));
		parking.addBus(new Bus("Kile", 4654, 666, "Ikarus", 1989, 500000));
		parking.addBus(new Bus("Stan", 8955, 666, "Minsk", 2007, 130000));
		parking.addBus(new Bus("Kenny", 4655, 888, "Mersedes", 2009, 180000));
		parking.addBus(new Bus("Butters", 4944, 999, "Iveka", 2001, 200000));

		parking.getBusByRoutenumber(666);
		System.out.println("-------------------------------------------------------");
		parking.getBusByTerm(15);
		System.out.println("-------------------------------------------------------");
		parking.getBusByMileage(150000);
	}

}
