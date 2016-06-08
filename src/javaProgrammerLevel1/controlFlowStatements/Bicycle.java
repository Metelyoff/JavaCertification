package javaProgrammerLevel1.controlFlowStatements;

class Bicycle {
	
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue) {
		cadence = newValue;
		}
	    
	void changeGear(int newValue) {
		gear = newValue;
		}

	void speedUp(int increment) {
		speed = speed + increment;   
		}

	int applyBrakes(boolean isMoving) {
		if (isMoving&&speed>0) {
			return speed--;
		} else {
			return speed;
			} 
		}

	void printStates() {
		System.out.println("cadence:" +
	            cadence + " speed:" + 
	            speed + " gear:" + gear +
	            " speed after brakes:" + speed);
		}
}
