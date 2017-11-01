package epam.ex3.a3;

/**
 * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты,
 * Диагноз. Создать массив объектов. Вывести: a) список пациентов, имеющих
 * данный диагноз; b) список пациентов, номер медицинской карты которых
 * находится в заданном интервале.
 */
public class Patient {

	private int id;
	private String surname;
	private String name;
	private String midlename;
	private String adress;
	private int phoneNumber;
	private int cardNumber;
	private String diagnosis;

	public Patient(int id, String surname, String name, String midlename, String adress, int phoneNumber,
			int cardNumber, String diagnosis) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.midlename = midlename;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.cardNumber = cardNumber;
		this.diagnosis = diagnosis;
	}

	public Patient(int id, int cardNumber, String diagnosis) {
		this.id = id;
		this.cardNumber = cardNumber;
		this.diagnosis = diagnosis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMidlename() {
		return midlename;
	}

	public void setMidlename(String midlename) {
		this.midlename = midlename;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", surname=" + surname + ", name=" + name + ", midlename=" + midlename
				+ ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", cardNumber=" + cardNumber + ", diagnosis="
				+ diagnosis + "]";
	}

}
