package kisecok.testproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DemoLinkedListTest {

    @Test
    void addWhiteColorShouldHaveThreeZero() {
        DemoLinkedList demoLinkedList = new DemoLinkedList();

        demoLinkedList.add( new Color(255,255,255));

        Color expected = new Color(255, 255, 255);
        assertEquals(expected, demoLinkedList.get(0));
        assertEquals(expected.hashCode(), demoLinkedList.get(0).hashCode());
    }

    @Test
    void checkColor() {
        DemoLinkedList demoLinkedList = new DemoLinkedList();

        demoLinkedList.add( new Color(25,255,255));

        Color expected = new Color(255, 255, 255);
        assertNotEquals(expected, demoLinkedList.get(0));
        assertNotEquals(expected.hashCode(), demoLinkedList.get(0).hashCode());
    }

    @Test
    void linkedLinkSizeShouldFour() {
        var demoLinkedList = new DemoLinkedList();

        demoLinkedList.add(new Color(0,0,0));
        demoLinkedList.add(new Color(1,0,0));
        demoLinkedList.add(new Color(1,0,2));
        demoLinkedList.add(new Color(1,0,5));

        assertEquals(4,demoLinkedList.size());
    }


    @Test
    void emptyLinkedListShouldReturnArrayIndexOutOfBoundsException(){

        var demoLinkedList = new DemoLinkedList();

        ArrayIndexOutOfBoundsException thrown = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> demoLinkedList.get(0),
                "Expected doThing() to throw, but it didn't"
        );

        assertEquals("index is not correct", thrown.getMessage());
    }


}