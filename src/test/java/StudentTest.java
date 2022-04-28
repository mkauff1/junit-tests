import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student1;
    private ArrayList<Integer> student1Grade;

    @Before
    public void setUpStudent() {
        student1 = new Student(34, "Matt");
        student1Grade = new ArrayList<Integer>(90);
    }

    @Test
    public void testGetId() {
        assertEquals(34, student1.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Matt", student1.getName());
    }

//    @Test
//    public void testGetGrade() {
//        assertEquals(90, student1Grade.getGrades());
//    }
}
