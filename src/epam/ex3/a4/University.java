package epam.ex3.a4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import epam.ex3.a3.Patient;

public class University {

	List<Abiturient> list = new ArrayList<Abiturient>();

	public void addAbiturient(Abiturient abiturient) {
		list.add(abiturient);
	}

	public void getBadMarks() {
		List<Integer> badMarks = Arrays.asList(1, 2, 3);
		for (Abiturient abiturient : list) {
			if (!Collections.disjoint(abiturient.getMarks(), badMarks)) {// наGooglил
				System.out.println(abiturient);
			}
			// also working 
			// List<Integer> currentMarks = list.get(i).getMarks();
			// for (int j = 0; j < currentMarks.size(); j++) {
			// if (badMarks.contains(currentMarks.get(j))) {
			// System.out.println(list.get(i));
			// break;
			// }
			//
			// }

		}
	}

	public int getMarksSum(Abiturient a) {
		int sum = 0;
		for (int mark : a.getMarks()) {
			sum += mark;
		}
		return sum;
	}

	public void getMoreThanIt(int k) {
		for (Abiturient abiturient : list) {
			if (getMarksSum(abiturient) >= k) {
				System.out.println(abiturient);
			}
		}
	}

	public void getCoolStudents(int k) {
		if (k > list.size()) {
			k = list.size();
		}
		Collections.sort(list, new Comparator<Abiturient>() {
			@Override
			public int compare(Abiturient o1, Abiturient o2) {
				return getMarksSum(o2) - getMarksSum(o1);
			}
		});

		for (int i = 0; i < k; i++) {
			System.out.println(list.get(i));
		}
	}
}