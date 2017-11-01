package epam.ex3.a12;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
 * недели. Создать массив объектов. Вывести: a) список рейсов для заданного
 * пункта назначения; b) список рейсов для заданного дня недели; c) список
 * рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {

	private String Destination;
	private int airNumber;
	private String type;
	private Time flyTime;
	private List<Integer> days;

	public Airline(String destination, int airNumber, String type, Time flyTime, List<Integer> days) {
		Destination = destination;
		this.airNumber = airNumber;
		this.type = type;
		this.flyTime = flyTime;
		this.days = days;
	}

	public String getDestination() {
		return Destination;
	}

	public List<Integer> getDays() {
		return days;
	}

	public void setDays(List<Integer> days) {
		this.days = days;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getAirNumber() {
		return airNumber;
	}

	public void setAirNumber(int airNumber) {
		this.airNumber = airNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Time getFlyTime() {
		return flyTime;
	}

	public void setFlyTime(Time flyTime) {
		this.flyTime = flyTime;
	}

	@Override
	public String toString() {
		return "Airline [Destination=" + Destination + ", airNumber=" + airNumber + ", type=" + type + ", flyTime="
				+ flyTime + ", days=" + days + "]";
	}
}
