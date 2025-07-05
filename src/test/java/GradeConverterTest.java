import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testconvert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void testconvert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
    @Test
    public void testconvert3() {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected, actual);
    }
    @Test
    public void testconvert4() {
        String expected = "Invalid";
        String actual = converter.convert(-75);
        assertEquals(expected, actual);
    }
    @Test
    public void testconvert5() {
        String expected = "Invalid";
        String actual = converter.convert(140);
        assertEquals(expected, actual);
    }
    @Test
    public void testconvert6() {
        String expected = "E";
        String actual = converter.convert(0);
        assertEquals(expected, actual);
    }
}