package javaProgrammerLevel1.oop;

class BicycleDemo {

	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        ACMEBicycle bike3 = new ACMEBicycle();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        bike3.changeCadence(55);
        bike3.speedUp(15);
        bike3.changeGear(3);
        bike3.printStates();
    
	}
	
}
