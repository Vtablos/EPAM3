package epam.ex3.a10;

/**
 * Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих,
 * купе, плацкарт, люкс). Создать массив объектов. Вывести: a) список поездов,
 * следующих до заданного пункта назначения; b) список поездов, следующих до
 * заданного пункта назначения и отправляющихся после заданного часа; c) список
 * поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
 */
public class Main {

	public static void main(String[] args) {
		
		Trains trains = new Trains();
		
		trains.addTrain(new Train("SanFrancisco", 666, 13.00, 40, 10, 5, 2));
		trains.addTrain(new Train("LosAngeles", 222, 15.00, 0, 10, 5, 5));
		trains.addTrain(new Train("LosVegas", 777, 14.00, 50, 20, 7, 2));
		trains.addTrain(new Train("SanFrancisco", 888, 18.00, 0, 10, 5, 2));
		trains.addTrain(new Train("LosVegas", 999, 14.00, 0, 20, 5, 3));
		trains.addTrain(new Train("SanFrancisco", 999, 22.00, 30, 10, 6, 2));
		
		trains.getTrainByDest("LosAngeles");
		System.out.println("-------------------------------------------------------");
		trains.getTrainByDestTime("SanFrancisco", 17.00);
		System.out.println("-------------------------------------------------------");
		trains.getTrainByDestTimePlaces("LosVegas", 14.00);

	}

}
