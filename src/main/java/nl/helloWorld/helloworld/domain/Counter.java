package nl.helloWorld.helloworld.domain;

public class Counter {
    private int counter;

    Counter(){
        counter = 0;
    }

    public int addNumber(){
        counter += 1;
        return counter;
    }

    public int getCounter() {
        return counter;
    }
}
