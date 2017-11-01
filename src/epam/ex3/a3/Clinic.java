package epam.ex3.a3;

/**
 * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты,
 * Диагноз. Создать массив объектов. Вывести: a) список пациентов, имеющих
 * данный диагноз; b) список пациентов, номер медицинской карты которых
 * находится в заданном интервале.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clinic {

	List<Patient> patients = new ArrayList<Patient>();

	public void addPatientToList(Patient patient) {
		patients.add(patient);
	}

	public void showPatients() {
		Collections.sort(patients, new Comparator<Patient>() {
			@Override
			public int compare(Patient o1, Patient o2) {
				return o1.getSurname().compareToIgnoreCase(o2.getSurname());
			}
		});
		for (Patient p : patients) {
			System.out.println(p);
		}
	}

	public void getSameDiagnosis() {
		for (Patient p : patients) {
			if (p.getDiagnosis().equals("fat")) {
				System.out.println(p);
			}
		}
	}

	public void getPatientNumber(int from, int to) {
		for (Patient p : patients) {
			if (p.getCardNumber() > from && p.getCardNumber() < to) {
				System.out.println(p);
			}
		}
	}
}