package epam.ex3.a12;

import java.sql.Time;
/**
 * Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
 * недели. Создать массив объектов. Вывести: a) список рейсов для заданного
 * пункта назначения; b) список рейсов для заданного дня недели; c) список
 * рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Airlines {

	List<Airline> airlines = new ArrayList<Airline>();

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	public void getAirlineByDest(String dest) {
		for (Airline air : airlines) {
			if (air.getDestination().equals(dest)) {
				System.out.println(air);
			}
		}
	}

	public void getAirlineByDay(int day) {
		for (Airline air : airlines) {
			for (int date : air.getDays()) {
				if (date == day) {
					System.out.println(air);
					break;
				}
			}
		}
	}

	public void AirByDayTime(int day, Time time) {
		for (Airline air: airlines) {
			for (int date: air.getDays()) {
				if (date == day && air.getFlyTime().after(time)) {
					System.out.println(air);
					break;
				}
			}
		}
	}
}
