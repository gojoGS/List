package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public abstract class AbstractListTest {
    private List list;

    protected abstract List getNewList();

    public void addString(String str) {
        list.add(str);
    }

    @BeforeEach
    public void setUp() {
        list = getNewList();
    }

    @Test
    public void containsSameReference() {
        var str = new String("a");

        addString(str);

        assertTrue(list.contains(str), "The list should contain the element that we just added");
    }

    @Test
    public void containsShouldCompareByValue() {
        var str = new String("tricky");

        addString(str);

        var str2 = new String("tricky");

        assertTrue(list.contains(str2), "The list should compare by value");
    }

    @Test
    public void add() {
        var str = new String("tricky");

        addString(str);

        var arr = new String[]{"asd"};

        assertArrayEquals(arr, list.toArray(), "The list should store the added string");
    }

    @Test
    public void toArrayEmpty() {
        var arr = new String[]{};

        assertArrayEquals(arr, list.toArray(), "Should return an empty array");
    }

    @Test
    public void toArray() {
        var str = new String("str");
        addString(str);

        var arr = new String[]{"str"};

        assertArrayEquals(arr, list.toArray(), "Should return an array, exactly the size of the list, containing its elements");
    }

    @Test
    public void sizeEmpty() {
        assertEquals(0, list.size(), "The size of the empty list should be 0");
    }

    @Test
    public void size() {
        addString("asd");

        assertEquals(1, list.size(), "The size of the non-empty list should be the number of its elements");
    }

    @Test
    public void getByValueNotInList() {
        assertTrue(list.getByValue("asd").isEmpty(), "If an element is not in the list, an empty Optional should be returned");
    }

    @Test
    public void getByValueIsPresent() {
        addString("asd");

        assertTrue(list.getByValue(new String("asd")).isPresent(), "Should return a non-empty Optional");
    }

    @Test
    public void getByValueIsEquals() {
        var str = new String("asd");
        addString(str);

        assertEquals("asd", list.getByValue("asd").get(), "The value in the Optinal should be equal to the one that we are looking for.");
    }

    @Test
    public void getByValueIsSame() {
        var str = new String("asd");
        addString(str);

        assertSame(str, list.getByValue("asd").get(), "Should return exactly the same String that we added");
    }

}
