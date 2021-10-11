package Animals;

import Queue.Animal;

public class Dogs extends Animal {
    public Dogs(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "from Dogs{" +
                " name=>'" + type + '\'' +
                '}';    }
}
