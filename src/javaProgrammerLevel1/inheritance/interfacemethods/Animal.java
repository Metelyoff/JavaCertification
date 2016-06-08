package javaProgrammerLevel1.inheritance.interfacemethods;

public interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
