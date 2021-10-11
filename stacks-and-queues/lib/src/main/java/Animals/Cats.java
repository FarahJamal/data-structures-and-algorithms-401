package Animals;

import Queue.Animal;

public class Cats extends Animal {

    public Cats(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "from Cats{" +
                " name=>'" + type + '\'' +
                '}';
    }
}
