package com.trial;

import java.util.ArrayList;
import java.util.List;

public class CityRepository {
	
	private static List<City> cityList = new ArrayList<>();
	
	public static void addCity(City city){
		cityList.add(city);
	}
	
	public static City getCity(int index){
		return cityList.get(index);
	}
	
	public static int cityRepositorySize(){
		return cityList.size();
	}

}
