package structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void getSize() {
        HashTable<String, Integer> characters = new HashTable<>();
        characters.add("Severus Snap", 1);

        characters.add("Voldemort", 2);
        characters.add("Luna LoveGod", 3);
        assertEquals(3,characters.getSize(),"should return size correctly.");
    }

    @Test
    void isEmpty() {

    }

    @Test
    void add() {

            HashTable<String, Integer> characters = new HashTable<>();
            characters.add("Severus Snap", 1);
        characters.add("Severus Snape", 10);

            characters.add("Voldemort", 2);
            characters.add("Luna LoveGod", 3);
            assertTrue(true);
//            assertEquals(,characters.get("Severus Snap"),"should return size correctly.");

    }

    @Test
    void remove() {
    }
    @Test
    void getNull() {
        HashTable<String, Integer> characters = new HashTable<>();

        assertEquals(null,characters.get("Severus Snap"),"should return size correctly.");
    }

    @Test
    void get() {
        HashTable<String, Integer> characters = new HashTable<>();
        characters.add("Severus Snap", 1);

        characters.add("Voldemort", 2);
        characters.add("Luna LoveGod", 3);
        assertEquals(1,characters.get("Severus Snap"),"should return size correctly.");
    }
    @Test
    void getWithCollision() {
        HashTable<String, Integer> characters = new HashTable<>();
        characters.add("Severus Snap", 1);
        characters.add("Farah", 700);
        characters.add("Marah", 701);

        characters.add("Voldemort", 2);
        characters.add("Luna LoveGod", 3);
        assertEquals(700,characters.get("Farah"),"should return size correctly.");
    }
    @Test
    void contains() {
        HashTable<String, Integer> characters = new HashTable<>();
        characters.add("Severus Snap", 1);

        characters.add("Voldemort", 2);
        characters.add("Luna LoveGod", 3);
        assertEquals(false,characters.contains("Farah"),"should return size correctly.");
    }

    @Test
    void hash() {
        HashTable<String, Integer> characters = new HashTable<>();
        characters.add("Severus Snap", 1);

        characters.add("Voldemort", 2);
        characters.add("Luna LoveGod", 3);
        assertEquals(5,characters.hash("Farah"),"should return size correctly.");
    }
}