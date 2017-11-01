package epam.ex3.a10;

/**
 * Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих,
 * купе, плацкарт, люкс). Создать массив объектов. Вывести: a) список поездов,
 * следующих до заданного пункта назначения; b) список поездов, следующих до
 * заданного пункта назначения и отправляющихся после заданного часа; c) список
 * поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
 */
public class Train {

	private String Destination;
	private int trainNumber;
	private double time;
	private int placesAll;
	private int coupe;
	private int plaz;
	private int lux;

	public Train(String destination, int trainNumber, double time, int placesAll, int coupe, int plaz, int lux) {
		super();
		Destination = destination;
		this.trainNumber = trainNumber;
		this.time = time;
		this.placesAll = placesAll;
		this.coupe = coupe;
		this.plaz = plaz;
		this.lux = lux;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public int getPlacesAll() {
		return placesAll;
	}

	public void setPlacesAll(int placesAll) {
		this.placesAll = placesAll;
	}

	public int getCoupe() {
		return coupe;
	}

	public void setCoupe(int coupe) {
		this.coupe = coupe;
	}

	public int getPlaz() {
		return plaz;
	}

	public void setPlaz(int plaz) {
		this.plaz = plaz;
	}

	public int getLux() {
		return lux;
	}

	public void setLux(int lux) {
		this.lux = lux;
	}

	@Override
	public String toString() {
		return "Train [Destination=" + Destination + ", trainNumber=" + trainNumber + ", time=" + time + ", placesAll="
				+ placesAll + ", coupe=" + coupe + ", plaz=" + plaz + ", lux=" + lux + "]";
	}

}
