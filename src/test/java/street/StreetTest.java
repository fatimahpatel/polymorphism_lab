package street;

import building.Building;
import building.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreetTest {
    private Street street;

    @BeforeEach
    public void setUp(){
        street = new Street("Street Test");
    }

    @Test
    public void canAddBuilding(){
        Office office = new Office ("22/11/2022", 3, 6, "MyOffice");
        street.addBuilding(office);
        int expected = 1;
        int actual = street.countBuilidngsInStreet();
        assertEquals(expected, actual);
    }
}
