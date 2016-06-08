package javaProgrammerLevel1.inheritance.interfacemethods;

public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
