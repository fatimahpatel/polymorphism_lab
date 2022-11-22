package street;

import org.junit.jupiter.api.BeforeEach;

public class StreetTest {
    private Street street;

    @BeforeEach
    public void setUp(){
        street = new Street("Street Test");
    }
}
