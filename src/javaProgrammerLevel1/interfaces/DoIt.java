package javaProgrammerLevel1.interfaces;

public interface DoIt {
	void doSomething(int i, double x);
	int doSomethingElse(String s);
	//implement the default method or extend the interface like DoItPlus
	default boolean didItWork(int i, double x, String s){
		// Method body
		return true;
	}
}
