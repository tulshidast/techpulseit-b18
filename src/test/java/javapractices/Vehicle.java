package javapractices;

public class Vehicle {

	// properties
	String manufacturer;
	String color;
	String model = "ford";
	float maxSpeed;

	// Behavior
	public void run() {

	}

	public void changeGear() {
		System.out.println("change four wheeler gear");
	}

	public static void main(String args[]) {

		TwoWheeler t = new TwoWheeler();
		t.changeGear();
		t.changeTwoWheelerGear();

		System.out.println(t.model);

		EvTwoWheeler evTwoWheeler = new EvTwoWheeler();
		System.out.println(evTwoWheeler.batteryCapacity);

		evTwoWheeler.changeTwoWheelerGear();

		evTwoWheeler.changeGear();

	}

}

class TwoWheeler extends Vehicle {

	public void changeTwoWheelerGear() {
		System.out.println("change two wheeler gear");

	}

}

class EvTwoWheeler extends TwoWheeler {

	String batteryCapacity = "13kw";

}

class CngFourWheeler extends Vehicle {

	public void burnCng() {
		System.out.println("Burning cng");

	}
}

//class Byke extends Vehicle,TwoWheeler{
//	
//	
//}