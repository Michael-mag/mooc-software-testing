package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    private LeapYear ly;
    
    @BeforeEach
    public void initialize(){
        this.ly = new LeapYear();
    }

    @Test
    public void leapYearsThatAreNonCenturialYears() {
        ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
}
