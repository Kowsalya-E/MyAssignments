package week3.day1;

public class MyVehicle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AUDI: ");
		Audi a=new Audi();
		a.hybridFuel();
		a.openSunroof();
		a.turnOnAC();
		a.soundHorn();
		a.applyBrake();
		a.brake();
		System.out.println("AUTO: ");
		Auto au=new Auto();
		au.handStarter();
		au.soundHorn();
		au.applyBrake();
		System.out.println("BAJAJ: ");
		Bajaj b=new Bajaj();
		b.electronicMeter();
		b.handStarter();
		b.soundHorn();
		b.applyBrake();
		System.out.println("BMW: ");
		BMW bm=new BMW();
		bm.autoPark();
		bm.openSunroof();
		bm.turnOnAC();
		bm.soundHorn();
		bm.applyBrake();
		System.out.println("CAR: ");
		Car c=new Car();
		c.openSunroof();
		c.turnOnAC();
		c.soundHorn();
		c.applyBrake();
		System.out.println("VEHICLE: ");
		Vehicle v=new Vehicle();
		v.applyBrake();
		v.soundHorn();
		
		
		
		
	}

}
