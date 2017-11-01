package epam.ex3.a12;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
 * недели. Создать массив объектов. Вывести: a) список рейсов для заданного
 * пункта назначения; b) список рейсов для заданного дня недели; c) список
 * рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

	public static void main(String[] args) {

		Airlines airlines = new Airlines();

		airlines.addAirline(new Airline("Amsterdam", 65678, "Falcon", new Time(12, 00, 00), Arrays.asList(2, 3, 4)));
		airlines.addAirline(new Airline("HongKong", 22678, "Rabit", new Time(14, 00, 00), Arrays.asList(1, 3, 4)));
		airlines.addAirline(new Airline("Kiev", 33678, "Fox", new Time(15, 00, 00), Arrays.asList(1, 2, 3, 4)));
		airlines.addAirline(new Airline("Bogota", 45338, "Bear", new Time(18, 00, 00), Arrays.asList(1, 5, 7)));
		airlines.addAirline(new Airline("Oslo", 45878, "Carot", new Time(21, 00, 00), Arrays.asList(2, 4, 5)));
		airlines.addAirline(new Airline("Tbilisi", 46678, "Mouse", new Time(11, 00, 00), Arrays.asList(2, 5, 6)));

		airlines.getAirlineByDest("Kiev");
		System.out.println("-------------------------------------------------------");
		airlines.getAirlineByDay(2);
		System.out.println("-------------------------------------------------------");
		airlines.AirByDayTime(2, new Time(15, 00, 00));
		
	}

}
