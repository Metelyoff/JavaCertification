package javaProgrammerLevel1.inheritance.interfacemethods;

public interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}