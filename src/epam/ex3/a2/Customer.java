package epam.ex3.a2;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
 * банковского счета. Создать массив объектов. Вывести: a) список покупателей в
 * алфавитном порядке; b) список покупателей, у которых номер кредитной карточки
 * находится в заданном интервале.
 */
class Customer {

    
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int CardNumber;
    private int BankNumber;
    
    Customer(String surname, String name, String patronymic, int CardNumber, int BankNumber) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.CardNumber = CardNumber;
        this.BankNumber = BankNumber;

    }

    Customer(int id, String surname, String name, String patronymic, int CardNumber, int BankNumber) {

    	this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.CardNumber = CardNumber;
        this.BankNumber = BankNumber;

    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getBankNumber() {
        return BankNumber;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", CardNumber=" + CardNumber + ", BankNumber=" + BankNumber + "]";
	}

    
}

	
