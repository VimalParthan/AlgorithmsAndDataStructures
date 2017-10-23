package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
	
	private List<City> tour = new ArrayList<>();
	
	public SingleTour(List<City> cityList) {
		tour = new ArrayList<>();
		
		this.tour.addAll(cityList);
	}
	
	public SingleTour(){
		tour = new ArrayList<>();
	
		tour.addAll(CityRepository.cityList);
		
		Collections.shuffle(tour);
	}
	
	public void setCity(int index,City city){
		tour.set(index, city);
	}
	
	public double getDistance(){
		
		double distance=0;
		
		for(int i=0;i<tour.size();i++){
			City startCity = tour.get(i);
			City targetCity;
			
			if(i<tour.size()-1){
				targetCity = tour.get(i+1);
			}else{
				targetCity = tour.get(0);
			}
			
			distance+=startCity.distanceTo(targetCity);
		}
		
		return distance;
	}

	public List<City> getTour() {
		return tour;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for(int i=0;i<tour.size();i++){
			s+=tour.get(i)+"--";
		}
		
		s+=tour.get(0);
		return s;
	}

	public City getCity(int index){
		return this.tour.get(index);
	}
	
	
}
