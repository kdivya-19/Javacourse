package com.functionalInterfaces;
import java.util.function.Function;

class SensorData{
	
	private double temperature;
	private double humidity;
	
	public SensorData(double temperature,double humidity) {
		this.temperature=temperature;
		this.humidity=humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<SensorData, Double> f1=new Function<SensorData, Double>(){
			public Double apply(SensorData obj) {
				return obj.getTemperature();
			}
		};
		
		
		Function< Double, Boolean> f2=new Function< Double, Boolean>(){
			double threshold=25.0;
			public Boolean apply(Double temp) {
				return temp>threshold;
			}
		};
		
		SensorData s1=new SensorData(20.0,15.0);
		System.out.println(f1.apply(s1));
		
		double d=f1.apply(s1);
		System.out.println(f2.apply(d));
		
		SensorData s2=new SensorData(40.0,30.0);
		System.out.println(f1.apply(s2));
		
		d=f1.apply(s2);
		System.out.println(f2.apply(d));
		

	}

}


















