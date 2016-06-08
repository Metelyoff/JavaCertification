package javaProgrammerLevel1.interfaces;

interface Interface1{}
interface Interface2{}
interface Interface3{}

interface GroupedInterface extends Interface1, Interface2, Interface3{
	// constant declarations
    
    // base of natural logarithms
    double E = 2.718282;
 
    // method signatures
    void doSomething (int i, double x);
    int doSomethingElse(String s);
}
