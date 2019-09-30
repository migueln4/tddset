import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.*;

public class CustomSetTests {
    @Test
    public void giveEmptySet_whenIsEmpty_thenTrueIsReturned() {
        Set<Object> set= new CustomSet<>();
        assertTrue(set.isEmpty());
    }

    @Test
    public void givenNonEmptySet_whenIsEmpty_thenFalseIsReturned() {
        Set<Object> set = new CustomSet<>();
        set.add(null);
        assertFalse(set.isEmpty());
    }

    @Test
    public void givenEmptySet_whenSize_thenZeroIsReturned() {
        Set<Object> set = new CustomSet<>();
        assertEquals(0,set.size());
    }

    @Test
    public void givenSetWithAnElement_whenSize_thenOneisReturned() {
        Set<Object> set = new CustomSet<>();
        set.add(null);
        assertEquals(1,set.size());
    }

    @Test
    public void givenSetWithMorThanOneElement_whenSize_thenNumberOfElementsIsReturned() {
        int returnedNumber = 5;
        Set<Object> set = new CustomSet<>();
        for (int i = 0; i<5; i++) {
            set.add(null);
        }
        assertEquals(returnedNumber,set.size());
    }
}
