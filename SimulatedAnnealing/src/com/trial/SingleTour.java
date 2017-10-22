package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
	
	private List<City> tour;
	
	private double distance;
	
	public SingleTour() {
		tour = new ArrayList<>();
		generateSingleTrip();
	}

	public SingleTour(List<City> tour) {
		this.tour=new ArrayList<>();
		this.tour.addAll(tour);
	}

	private void generateSingleTrip() {
		
		for(int i=0;i<CityRepository.cityRepositorySize();i++){
			tour.add(CityRepository.getCity(i));
		}
		
		Collections.shuffle(tour);
	}
	
	public double getDistance(){
		
		
		double tourDistance=0;
		
		for(int i=0;i<tour.size();i++){
			
			City fromCity = tour.get(i);
			City destCity;
			if(i<tour.size()-1){
				destCity = tour.get(i+1);
			}else{
				destCity=tour.get(0);
			}
			tourDistance+=fromCity.ditanceTo(destCity);
		}
		this.distance=tourDistance;
		
		return distance;
	}
	
	public void setCity(int index,City city){
		this.tour.set(index, city);
		
		this.distance=0;
	}
	
	public List<City> getTour(){
		return this.tour;
	}
	
	public City getCity(int index){
		return this.tour.get(index);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s ="";
		for(int i=0;i<tour.size();i++){
			s+=tour.get(i)+"-->";
		}
		s+=tour.get(0);
		
		return s;
		
	}

}
