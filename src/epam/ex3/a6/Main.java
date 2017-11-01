package epam.ex3.a6;

/**
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип
 * здания, Срок эксплуатации. Создать массив объектов. Вывести: a) список
 * квартир, имеющих заданное число комнат; b) список квартир, имеющих заданное
 * число комнат и расположенных на этаже, который находится в заданном
 * промежутке; c) список квартир, имеющих площадь, превосходящую заданную.
 */
public class Main {

	public static void main(String[] args) {

		HouseBlock houseBlock = new HouseBlock();

		houseBlock.addHouse(new House(1, 107, 60, 2, 2, "street1", "MS", 75));
		houseBlock.addHouse(new House(2, 117, 100, 4, 3, "street1", "MS", 75));
		houseBlock.addHouse(new House(3, 127, 40, 3, 1, "street1", "MS", 75));
		houseBlock.addHouse(new House(4, 118, 40, 4, 1, "street1", "MS", 75));
		houseBlock.addHouse(new House(5, 109, 60, 2, 2, "street1", "MS", 75));
		houseBlock.addHouse(new House(6, 109, 110, 3, 5, "street1", "MS", 75));

		houseBlock.getFlatsByRooms(3);
		System.out.println("---------------------------------------------------");
		houseBlock.getFlatsByRoomsFloor(2, 2, 4);
		System.out.println("---------------------------------------------------");
		houseBlock.getFlatsByArea(90);

	}

}
