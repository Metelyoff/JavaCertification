package javaProgrammerLevel1.nestedClasses;

import java.time.LocalDate;
import java.util.List;

import javaProgrammerLevel1.nestedClasses.Person.Sex;

interface CheckPerson {
    boolean test(Person p);
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.gender == Person.Sex.MALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}

public class Person {
		
	public enum Sex {
	        MALE, FEMALE
	    }

	    String name;
	    LocalDate birthday;
	    Sex gender;
	    String emailAddress;

	    public int getAge() {
	        // ...
	    	return 0;
	    }

	    public void printPerson() {
	        // ...
	    }
	    
	    public static void printPersonsWithinAgeRange(
	    	    List<Person> roster, int low, int high) {
	    	    for (Person p : roster) {
	    	        if (low <= p.getAge() && p.getAge() < high) {
	    	            p.printPerson();
	    	        }
	    	    }
	    	}
	    
	    public static void printPersons(
	    	    List<Person> roster, CheckPerson tester) {
	    	    for (Person p : roster) {
	    	        if (tester.test(p)) {
	    	            p.printPerson();
	    	        }
	    	    }
	    	}

		public static List<Person> createRoster() {
			// TODO Auto-generated method stub
			return null;
		}

		public Sex getGender() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getEmailAddress() {
			// TODO Auto-generated method stub
			return null;
		}
}
