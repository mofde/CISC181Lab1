package cisc181.lab_1;
import org.junit.Test;
import static org.junit.Assert.*;
public class Lab1Test {
    @Test
    public void areaScalene() {
        System.out.println("Testing areaScalene");
        assertEquals(3.96, Lab1.areaScalene(5.5, 3.4, 8.7), 0.0001);
        assertEquals(15.84, Lab1.areaScalene(11.0, 6.8, 17.4), 0.0001);
        assertEquals(35.64, Lab1.areaScalene(16.5, 10.2, 26.1), 0.0001);
    }
    @Test
    public void okCourses() {
        System.out.println("Testing okCourses");
        assertFalse(Lab1.okCourses(11, 4));
        assertTrue(Lab1.okCourses(14, 1));
        assertTrue(Lab1.okCourses(12, 5));
        assertTrue(Lab1.okCourses(14, 5));
        assertFalse(Lab1.okCourses(11, 4));
    }
    @Test
    public void shareDigit() {
        System.out.println("Testing shareDigit");
        assertTrue(Lab1.shareDigit(12, 23));
        assertTrue(Lab1.shareDigit(26, 29));
        assertFalse(Lab1.shareDigit(20, 17));
    }
    @Test
    public void cubicRoot() {
        System.out.println("Testing cubicRoot");
        assertEquals(Lab1.cubicRoot(1, -7, 8, -3, 5.0), 5.6857, 0.0001);
        assertEquals(Lab1.cubicRoot(1, -3, -1, 1, 2.5), 3.2143, 0.0001);
    }
}