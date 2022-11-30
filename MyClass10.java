class Car {
	int speed;
	void driveSpeed(){}
}

class Sedan extends Car {
	
}
class Truck extends Car {
	
}
class SportsCar extends Car {
	
}

class DriveCar {
	void startDrive(Car c){
		System.out.println(c.speed);
	}
}
public class MyClass10 {
	public static void main(String[] args){
		
		Sedan sedan = new Sedan();
		Truck tr = new Truck();
		SportsCar sc = new SportsCar();
		sedan.speed = 100;
		tr.speed = 90;
		sc.speed = 150;

		DriveCar dr = new DriveCar();
		dr.startDrive(sedan);
		dr.startDrive(tr);
		dr.startDrive(sc);
	}
}