package javaProgrammerLevel1.inheritance.interfacemethods;

public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
