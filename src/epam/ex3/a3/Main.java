package epam.ex3.a3;

/**
 * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты,
 * Диагноз. Создать массив объектов. Вывести: a) список пациентов, имеющих
 * данный диагноз; b) список пациентов, номер медицинской карты которых
 * находится в заданном интервале.
 */
public class Main {

	public static void main(String[] args) {

		Clinic clinic = new Clinic();

		clinic.addPatientToList(new Patient(1, "Cartman", "Eric", "Littlebuster", "sthpark", 3356606, 12, "fat"));
		clinic.addPatientToList(new Patient(2, "Marsh", "Stan", "Rendivich", "sthpark", 3356606, 15, "smart"));
		clinic.addPatientToList(new Patient(3, "Brohlovski", "Kile", "Green", "sthpark", 3356606, 23, "mad"));
		clinic.addPatientToList(new Patient(4, "McCormic", "Kenny", "Sky", "sthpark", 3356606, 31, "died"));
		clinic.addPatientToList(new Patient(5, "Stoch", "Butters", "Loh", "sthpark", 3356606, 28, "chaos"));

		clinic.showPatients();
		System.out.println("------------------------------------");
		clinic.getSameDiagnosis();
		System.out.println("------------------------------------");
		clinic.getPatientNumber(20, 30);
	}

}
