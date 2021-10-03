package linked.list;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
class LinkedListTest {
    @Test
    void instantiateLinkedList() {
        LinkedList MyTest = new LinkedList();
        assertNull(MyTest.head);
    }

    @Test
    void canInsert() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");

        String expected = "{ s } -> { n } -> { a } -> { p } -> { e } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void headPointsRight() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");
        assertEquals("s", MyTest.head.getData());
    }

    @Test
    void canInsertMultiple() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");
        MyTest.insert("<3");
        String expected = "{ s } -> { n } -> { a } -> { p } -> { e } -> { <3 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }

    @Test
    void LinkedListIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");
        MyTest.insert("<3");
        assertTrue(MyTest.includes("p"));
    }

    @Test
    void LinkedListDoesntIncludes() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");
        MyTest.insert("<3");

        assertFalse(MyTest.includes("k"));
        assertFalse(MyTest.includes("f"));
    }

    @Test
    void includesWorkingFine() {
        LinkedList MyTest = new LinkedList();
        MyTest.insert("s");
        MyTest.insert("n");
        MyTest.insert("a");
        MyTest.insert("p");
        MyTest.insert("e");
        MyTest.insert("<3");

        String expected = "{ s } -> { n } -> { a } -> { p } -> { e } -> { <3 } -> NULL";
        assertEquals(expected, MyTest.toString());
    }
}