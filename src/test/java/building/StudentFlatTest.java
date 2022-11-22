package building;

import org.junit.jupiter.api.BeforeEach;

public class StudentFlatTest {

    private StudentFlat studentFlat;

    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat("21/10/1999", 2, 5, 56);
    }
}
