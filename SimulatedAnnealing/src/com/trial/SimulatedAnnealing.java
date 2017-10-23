package com.trial;

public class SimulatedAnnealing {
	

	private SingleTour best;
	
	public void simulate(){
		
		double temperature=10000;
		double coolingFactor=0.003;
		
		SingleTour currentTour = new SingleTour();
		
		best =new SingleTour(currentTour.getTour());
		
		System.out.println(best.getDistance());
		
		while(temperature>1){
			SingleTour newTour = new SingleTour(currentTour.getTour());
			
			int randomIndex1 = (int)(Math.random()*newTour.getTour().size());
			int randomIndex2 = (int)(Math.random()*newTour.getTour().size());
			
			City randomCity1= newTour.getCity(randomIndex1);
			City randomCity2 = newTour.getCity(randomIndex2);
			
			newTour.setCity(randomIndex2, randomCity1);
			newTour.setCity(randomIndex1, randomCity2);
			
			double currentDistance = currentTour.getDistance();
			double neighbourDistance = newTour.getDistance();
			
			if(acceptanceProbability(currentDistance,neighbourDistance,temperature)>Math.random()){
				currentTour = new SingleTour(newTour.getTour());
			}
			
			if(best.getDistance()>currentTour.getDistance()){
				best = new SingleTour(currentTour.getTour());
			}
			
			temperature*=1-coolingFactor;
		}
		
	}

	private double acceptanceProbability(double currentDistance, double neighbourDistance, double temperature) {
		
		if(neighbourDistance<currentDistance)
			return 1;
		
		return Math.exp(currentDistance-neighbourDistance)/temperature;
	}

	public SingleTour getBest() {
		return best;
	}
	
	
	
	
	

}
