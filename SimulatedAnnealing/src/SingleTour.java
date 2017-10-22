import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {

	private List<City> tour = new ArrayList<>();
	private double distance;

	public SingleTour() {

		tour = new ArrayList<>();
		generateIndividual();
	}
	
	public SingleTour(List<City> tour) {

		this.tour.addAll(tour);
	}

	public double getDistance() {
		if (distance == 0) {
			int tourDistance = 0;

			for (int cityIndex = 0; cityIndex < getTourSize(); cityIndex++) {

				City fromCity = getCity(cityIndex);
				City destinationCity;

				if (cityIndex + 1 < getTourSize()) {
					destinationCity = getCity(cityIndex + 1);
				} else {
					destinationCity = getCity(0);
				}
				tourDistance += fromCity.distanceTo(destinationCity);
			}
			distance = tourDistance;

		}
		return distance;
	}

	public void generateIndividual() {

		for (int cityIndex = 0; cityIndex < Repository.getNumberOfCities(); cityIndex++) {

			tour.add(Repository.getCity(cityIndex));

		}

		Collections.shuffle(tour);
	}
	
	public void setCity(int index,City city){
		this.tour.set(index, city);
	}

	public City getCity(int tourPosition) {
		return tour.get(tourPosition);
	}

	public int getTourSize() {
		return this.tour.size();
	}

	public List<City> getTour() {
		return tour;
	}

	@Override
	public String toString() {

		String s = "";

		for (int i = 0; i < getTourSize(); i++) {
			s += getCity(i) + "->";
		}
		return s += getCity(0);
	}

}
