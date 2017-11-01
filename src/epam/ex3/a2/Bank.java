package epam.ex3.a2;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
 * банковского счета. Создать массив объектов. Вывести: a) список покупателей в
 * алфавитном порядке; b) список покупателей, у которых номер кредитной карточки
 * находится в заданном интервале.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import epam.ex3.a1.Student;

public class Bank {

	List<Customer> customers = new ArrayList<Customer>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void getListSurname() {
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});
		for (Customer customer: customers) {
			System.out.println(customer);
		}
	}

	public void getListName() {
		Collections.sort(customers, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		for (Customer customer: customers) {
			System.out.println(customer);
		}
	}

	public void getListCardNumber(int from, int to) {
		for (Customer customer: customers) {
			if (customer.getCardNumber() > from && customer.getCardNumber() < to)
				System.out.println(customer);
		}
	}
}
