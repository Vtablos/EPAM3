package epam.ex3.a7;
/**
 * Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет,
 * Кредит, Время городских и междугородных разговоров. Создать массив объектов.
 * Вывести: a) сведения об абонентах, у которых время внутригородских разговоров
 * превышает заданное; b) сведения об абонентах, которые пользовались
 * междугородной связью; c) сведения об абонентах в алфавитном порядке.
 */

public class Main {

	public static void main(String[] args) {
		
		PhoneList phoneList = new PhoneList();
		
		phoneList.addPhone(new Phone(1, "Cartman", "Eric", "Littlebuster", "sthpark", 3356606, 12, 0, 120, 20));
		phoneList.addPhone(new Phone(2, "Marsh", "Stan", "Rendivich", "sthpark1", 3356606, 0, 5, 80, 0));
		phoneList.addPhone(new Phone(3, "Brohlovski", "Kile", "Green", "sthpark2", 3356606, 23, 0, 90, 0));
		phoneList.addPhone(new Phone(4, "McCormic", "Kenny", "Sky", "sthpark3", 3356606, 0, 18, 60, 10));
		phoneList.addPhone(new Phone(5, "Stoch", "Butters", "Loh", "sthpark4", 3356606, 28, 0, 95, 0));
		
		phoneList.getPhonesByInTalks(91);
		System.out.println("--------------------------------------------------------------------");
		phoneList.getPhonesOutTalks();
		System.out.println("--------------------------------------------------------------------");
		phoneList.getSortPhones();
	}

}
