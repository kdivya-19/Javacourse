package OOPs;

class Vehicles{
	private String make;
	private String model;
	private int year;
	
	public Vehicles(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle details");
		System.out.println("make "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}

class Car extends Vehicles{
	private int numOfDoors;
	public Car(String make,String model,int year,int numOfDoors) {
		super(make,model,year);
		this.numOfDoors=numOfDoors;
		
	}
	
	public void displayCarInfo() {
		System.out.println("Number of doors:"+numOfDoors);
	}
}

class Truck extends Vehicles{
	private int cargoCapacity;
	public Truck(String make,String model,int year,int cargoCapacity) {
		super(make,model,year);
		this.cargoCapacity=cargoCapacity;
		
	}
	
	public void displayTruckInfo() {
		System.out.println("Cargo capacity is:"+cargoCapacity);
	}
}

class MotorCycle extends Vehicles{
	private boolean sidecar;
	public MotorCycle(String make,String model,int year,boolean sidecar) {
		super(make,model,year);
		this.sidecar=sidecar;
		
	}
	
	public void displayMotorInfo() {
		System.out.println("Has Side car :"+sidecar);
	}
}


public class VehicleHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicles car=new Car("Toyota","Corolla",2022,4);
		car.displayInfo(); 
		Car c=(Car)car;
		c.displayCarInfo();
		
		Vehicles truck=new Truck("Ford","F-150",2021,1000);
		truck.displayInfo(); 
		Truck t=(Truck)truck;
		t.displayTruckInfo();
		
		Vehicles motor=new MotorCycle("harley-Davidson","Street-Glide",2023,true);
		motor.displayInfo();
		MotorCycle m=(MotorCycle)motor;
		m.displayMotorInfo();
	}

}
