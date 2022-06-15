import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    int teacherPayment;
//        int basePay;
//        int workDays;

    @Before
    public void setUp() throws Exception {
//        int basePay = 500;
//        int workDays = 10;
    }

    @Test
    public void teacherPayment() {
        Assert.assertNotNull(teacherPayment);
    }

    @After
    public void tearDown() throws Exception {
    }


}