package Animals;

import Queue.Animal;

public class Many extends Animal {

    public Many(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "from our shelter you can take{" +
                " name=>'" + type + '\'' +
                '}';    }
}
