package com.trial;

import java.util.Random;

public class SimulatedAnnealing {
	
	private SingleTour best;
	
	
	public void simulate(){
		
		SingleTour currentTour = new SingleTour();
		
		best = new SingleTour(currentTour.getTour());
		
		System.out.println("initial distance was"+best.getDistance());
		
		double temperature = 10000;
		double coolingRate = 0.003;
		
		while(temperature>1){
			
			SingleTour newTour = new SingleTour(currentTour.getTour());
			
			int randomIndex1 = (int)(Math.random()*CityRepository.cityRepositorySize());
			int randomIndex2 = (int)(Math.random()*CityRepository.cityRepositorySize());
			
			City randomCity1 = newTour.getCity(randomIndex1);
			City randomCity2 = newTour.getCity(randomIndex2);
			
			newTour.setCity(randomIndex2, randomCity1);
			newTour.setCity(randomIndex1, randomCity2);
		
			double currentEnergy = currentTour.getDistance();
			double neighbourEnergy = newTour.getDistance();
			
			if(acceptanceProbability(currentEnergy,neighbourEnergy,temperature)>Math.random()){
				currentTour = new SingleTour(newTour.getTour());
			}
			
			if(best.getDistance()>currentTour.getDistance()){
				best = new SingleTour(currentTour.getTour());
			}
			
			temperature *= 1-coolingRate;
		}
		
	}

	private double acceptanceProbability(double currentEnergy, double neighbourEnergy, double temperature) {
		
		if(neighbourEnergy<currentEnergy)
			return 1;
		
		return Math.exp(currentEnergy-neighbourEnergy)/temperature;
	}


	public SingleTour getBest() {
		return best;
	}
	
	

}
