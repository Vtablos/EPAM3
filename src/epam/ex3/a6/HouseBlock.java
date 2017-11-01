package epam.ex3.a6;

/**
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип
 * здания, Срок эксплуатации. Создать массив объектов. Вывести: a) список
 * квартир, имеющих заданное число комнат; b) список квартир, имеющих заданное
 * число комнат и расположенных на этаже, который находится в заданном
 * промежутке; c) список квартир, имеющих площадь, превосходящую заданную.
 */
import java.util.ArrayList;
import java.util.List;

public class HouseBlock {
	List<House> houses = new ArrayList<House>();

	public void addHouse(House house) {
		houses.add(house);
	}

	public void getFlatsByRooms(int rooms) {
		for (House flat : houses) {
			if (flat.getRoomNumbers() == rooms) {
				System.out.println(flat);
			}
		}
	}

	public void getFlatsByRoomsFloor(int rooms, int from, int to){
		for (House flat: houses){
			if(flat.getRoomNumbers()==rooms && (flat.getFloor()>=from && flat.getFloor()<=to)){
				System.out.println(flat);
			}
		}
	}
	
	public void getFlatsByArea(int area){
		for (House flat: houses){
			if(flat.getArea()>area){
				System.out.println(flat);
			}
		}
	}
}
