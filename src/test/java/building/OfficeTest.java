package building;

import org.junit.jupiter.api.BeforeEach;

public class OfficeTest {
    public Office office;

    @BeforeEach
    public void setUp(){
        office = new Office ("10/08/2000", 4, 3, "FpLimited");
    }

}
