package epam.ex3.a4;

public class Main {

	public static void main(String[] args) {

		University university = new University();

		Abiturient abiturient = new Abiturient(1, "Cartman", "Eric", "Littlebuster", "sthpark");
		abiturient.getMarks().add(2);
		abiturient.getMarks().add(2);
		abiturient.getMarks().add(5);
		university.addAbiturient(abiturient);
		abiturient = new Abiturient(2, "Marsh", "Stan", "Rendivich", "sthpark");
		abiturient.getMarks().add(5);
		abiturient.getMarks().add(1);
		abiturient.getMarks().add(9);
		university.addAbiturient(abiturient);
		abiturient = new Abiturient(3, "Brohlovski", "Kile", "Green", "sthpark");
		abiturient.getMarks().add(5);
		abiturient.getMarks().add(6);
		abiturient.getMarks().add(9);
		university.addAbiturient(abiturient);
		abiturient = new Abiturient(4, "McCormic", "Kenny", "Died", "sthpark");
		abiturient.getMarks().add(5);
		abiturient.getMarks().add(4);
		abiturient.getMarks().add(9);
		university.addAbiturient(abiturient);
		abiturient = new Abiturient(5, "Stoch", "Butters", "Chaos", "sthpark");
		abiturient.getMarks().add(5);
		abiturient.getMarks().add(8);
		abiturient.getMarks().add(9);
		university.addAbiturient(abiturient);
		
		
		
		university.getBadMarks();
		System.out.println("--------------------------------------------------------");
		university.getMoreThanIt(16);
		System.out.println("--------------------------------------------------------");
		university.getCoolStudents(2);
	}
}