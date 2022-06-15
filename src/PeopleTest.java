import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {

 //   People peoples;

    People student1;
    People student2;
    People student3;
    People teacher1;
    People teacher2;


    @Before
    public void setUp() throws Exception {
//        ArrayList<People> peoples = new ArrayList<>();

        Address addressStudent1 = new Address("hghyfgdd", "ggfthghd", 4, 1);
        Address addressStudent2 = new Address("nhjfgdfs", "ghjfd", 5, 8);
        Address addressStudent3 = new Address("jhghjfg", "hjdtsds", 6, 3);
        student1 = new Student("Bob", "Ivanov", 18, addressStudent1, "young");
        student2 = new Student("Nik", "Ivanov", 20, addressStudent2, "young");
        student3 = new Student("Sam", "Ivanov", 19, addressStudent3, "young");

        Address addressTeacher1 = new Address("�����", "���������", 12, 5);
        teacher1 = new Teacher("Mary", "Petrovna", 63, addressTeacher1, "retired");
        teacher2 = new Teacher("Kate", "Ivanova", 35, addressTeacher1, "young");

//        peoples.add(student1);
//        peoples.add(student2);
//        peoples.add(student3);
//        peoples.add(teacher1);
//        peoples.add(teacher2);
//        this.getAge();
    }

    @Test
    public void getAge() {
 //       this.Age = 0;

        Assert.assertFalse(student1.getAge()<0);
        Assert.assertFalse(student2.getAge()<0);
        Assert.assertFalse(student3.getAge()<0);
        Assert.assertFalse(teacher1.getAge()<0);
        Assert.assertFalse(teacher2.getAge()<0);



//        Assert.assertNotEquals(0, student1.getAge());
//        Assert.assertNotEquals(0, student2.getAge());
//        Assert.assertNotEquals(0, student3.getAge());
//        Assert.assertNotEquals(0, teacher1.getAge());
//        Assert.assertNotEquals(0, teacher2.getAge());
    }

    @After
    public void tearDown() throws Exception {
    }
}