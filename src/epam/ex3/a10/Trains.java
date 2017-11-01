package epam.ex3.a10;

/**
 * Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих,
 * купе, плацкарт, люкс). Создать массив объектов. Вывести: a) список поездов,
 * следующих до заданного пункта назначения; b) список поездов, следующих до
 * заданного пункта назначения и отправляющихся после заданного часа; c) список
 * поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
 */
import java.util.ArrayList;
import java.util.List;

public class Trains {

	List<Train> trains = new ArrayList<Train>();

	public void addTrain(Train train) {
		trains.add(train);
	}
	
	public void getTrainByDest(String dest){
		for(Train train: trains){
			if (train.getDestination().equals(dest)){
				System.out.println(train);
			}
		}
	}
	
	public void getTrainByDestTime(String dest, double time){
		for (Train train: trains){
			if(train.getDestination().equals(dest) && train.getTime()>time){
				System.out.println(train);
			}
		}
	}
	
	public void getTrainByDestTimePlaces(String dest, double time){
		for (Train train: trains){
			if(train.getDestination().equals(dest) && train.getTime()==time && train.getPlacesAll()>0){
				System.out.println(train);
			}
		}
	}
}
