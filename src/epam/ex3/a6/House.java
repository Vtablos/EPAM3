package epam.ex3.a6;

/**
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип
 * здания, Срок эксплуатации. Создать массив объектов. Вывести: a) список
 * квартир, имеющих заданное число комнат; b) список квартир, имеющих заданное
 * число комнат и расположенных на этаже, который находится в заданном
 * промежутке; c) список квартир, имеющих площадь, превосходящую заданную.
 */
public class House {

	private int id;
	private int flatNumber;
	private double area;
	private int floor;
	private int roomNumbers;
	private String street;
	private String type;
	private int term;

	public House(int id, int flatNumber, double area, int floor, int roomNumbers, String street, String type, int term) {
		super();
		this.id = id;
		this.flatNumber = flatNumber;
		this.area = area;
		this.floor = floor;
		this.roomNumbers = roomNumbers;
		this.street = street;
		this.type = type;
		this.term = term;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(int roomNumbers) {
		this.roomNumbers = roomNumbers;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", flatNumber=" + flatNumber + ", area=" + area + ", floor=" + floor
				+ ", roomNumbers=" + roomNumbers + ", street=" + street + ", type=" + type + ", term=" + term + "]";
	}

}