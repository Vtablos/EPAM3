package epam.ex3.a11;

/**
 * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год
 * начала эксплуатации, Пробег. Создать массив объектов. Вывести: a) список
 * автобусов для заданного номера маршрута; b) список автобусов, которые
 * эксплуатируются больше заданного срока; c) список автобусов, пробег у которых
 * больше заданного расстояния.
 */
public class Bus {

	private String surname;
	private int busNumber;
	private int routeNumber;
	private String label;
	private int issueYear;
	private int mileage;

	public Bus(String surname, int busNumber, int routeNumber, String label, int issueYear, int mileage) {
		super();
		this.surname = surname;
		this.busNumber = busNumber;
		this.routeNumber = routeNumber;
		this.label = label;
		this.issueYear = issueYear;
		this.mileage = mileage;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public int getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(int routeNumber) {
		this.routeNumber = routeNumber;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getIssueYear() {
		return issueYear;
	}

	public void setIssueYear(int issueYear) {
		this.issueYear = issueYear;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bus [surname=" + surname + ", busNumber=" + busNumber + ", routeNumber=" + routeNumber + ", label="
				+ label + ", issueYear=" + issueYear + ", mileage=" + mileage + "]";
	}

}
