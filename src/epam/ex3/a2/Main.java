package epam.ex3.a2;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
 * банковского счета. Создать массив объектов. Вывести: a) список покупателей в
 * алфавитном порядке; b) список покупателей, у которых номер кредитной карточки
 * находится в заданном интервале.
 */
public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.addCustomer(new Customer(1,"Cartman", "Eric", "Buster", 3560, 60_45_48));
		bank.addCustomer(new Customer(2,"Marsh", "Stan", "Rendivich", 1668, 25_45_48));
		bank.addCustomer(new Customer(3,"Brohlovsky", "Kile", "Green", 2000, 30_45_89));
		bank.addCustomer(new Customer(4,"McCormic", "Kenny", "Sky", 4105, 90_47_48));
		bank.addCustomer(new Customer(5,"Stoch", "Butters", "Loh", 2500, 40_45_45));

		System.out.println("sorted by name");
		bank.getListName();
		System.out.println("------------------------------------------------");
		System.out.println("sorted by surname");
		bank.getListSurname();
		System.out.println("------------------------------------------------");
		System.out.println("check diapason");
		bank.getListCardNumber(2000, 3000);
	}

}
