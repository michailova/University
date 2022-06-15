import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GroupTest {

    Group group;

    Student student1;
    Student student2;
    Student student3;


    @Before
    public void setUp() throws Exception {
        Teacher teacher1 = null;
        ArrayList<Student> list = new ArrayList<>();
        group = new Group(110418, 2, list, teacher1, 2010, 2015);

        Address addressStudent1 = new Address("hghyfgdd", "ggfthghd", 4, 1);
        Address addressStudent2 = new Address("nhjfgdfs", "ghjfd", 5, 8);
        Address addressStudent3 = new Address("jhghjfg", "hjdtsds", 6, 3);
        student1 = new Student("Bob", "Ivanov", 18, addressStudent1, "young");
        student2 = new Student("Nik", "Ivanov", 20, addressStudent2, "young");
        student3 = new Student("Sam", "Ivanov", 19, addressStudent3, "young");

        list.add(student1);
        list.add(student2);
        list.add(student3);
    }

    @Test
    public void setRemoveStud() {

        group.setRemoveStud(student1);
        Assert.assertEquals(2, group.list.size());

    }

    @Test
    public void addStudent() {

        Address addressStudent4 = new Address("hghyfgdd", "ggfthghd", 4, 1);
        Student student4 = new Student("Bob", "Ivanov", 18, addressStudent4, "young");

        group.addStudent(student4);
        Assert.assertEquals(4, group.list.size());
    }

    @After
    public void tearDown() throws Exception {
    }
}