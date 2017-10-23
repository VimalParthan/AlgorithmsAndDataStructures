package com.trial;

import java.util.ArrayList;
import java.util.List;

public class CityRepository {
	
	public static List<City> cityList = new ArrayList<>();
	
	public static void addCity(City city){
		cityList.add(city);
	} 

	public static void getCity(int index){
		cityList.get(index);
	} 
	
	
}
