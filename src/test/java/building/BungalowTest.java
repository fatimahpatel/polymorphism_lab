package building;

import org.junit.jupiter.api.BeforeEach;

public class BungalowTest {

    private Bungalow bungalow; //created a new test variable called bungalow
    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow("27/02/2000", 1, 7, true);
    }
}
