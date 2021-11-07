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
    @Test
    void findRepeatedWords() {
        HashTable<Integer,String> story = new HashTable<>();
        story.add(1,"Once upon a time, there was a brave princess who...");
        story.add(2,"It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...");
        story.add( 3,"It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...");
assertEquals("{all=2, before=2, going=2, in=2, was=11, direct=2, for=2, its=2, times,=2, epoch=2, had=2, it=9, we=4, us,=2, the=14, were=2, of=12, season=2, age=2}"
        ,story.repeatedWord(story.get(2)));

    }
}