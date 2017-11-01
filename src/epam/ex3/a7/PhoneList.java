package epam.ex3.a7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет,
 * Кредит, Время городских и междугородных разговоров. Создать массив объектов.
 * Вывести: a) сведения об абонентах, у которых время внутригородских разговоров
 * превышает заданное; b) сведения об абонентах, которые пользовались
 * междугородной связью; c) сведения об абонентах в алфавитном порядке.
 */

public class PhoneList {

	List<Phone> phones = new ArrayList<Phone>();

	public void addPhone(Phone phone) {
		phones.add(phone);
	}

	public void getPhonesByInTalks(double time) {
		for (Phone abon : phones) {
			if (abon.getInTime() > time) {
				System.out.println(abon);
			}
		}
	}

	public void getPhonesOutTalks() {
		for (Phone abon : phones) {
			if (abon.getOutTime() > 0) {
				System.out.println(abon);
			}
		}
	}

	public void getSortPhones() {
		Collections.sort(phones, new Comparator<Phone>() {
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});

		for (Phone abon : phones) {
			System.out.println(abon);
		}
	}
}
