import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Address addressStudent1 = new Address("hghyfgdd", "ggfthghd", 4, 1);
        Address addressStudent2 = new Address("nhjfgdfs", "ghjfd", 5, 8);
        Address addressStudent3 = new Address("jhghjfg", "hjdtsds", 6, 3);
        Student student1 = new Student("Bob", "Ivanov", 18, addressStudent1);
        Student student2 = new Student("Nik", "Ivanov", 20, addressStudent2);
        Student student3 = new Student("Sam", "Ivanov", 19, addressStudent3);
        ArrayList<Student>list = new ArrayList<Student>() {
            {
                add(student1);
                add(student2);
                add(student3);
            }
        };
//        Student array[] = {student1, student2, student3};
//        Student[] newArray = new Student[2];
//        array[0] = new Student("Nik", "Ivanov", 20, addressStudent1);
//        array[1] = new Student("Sam", "Petrov", 19, addressStudent2);
//        array[2] = new Student("Pit", "Ivanov", 18, addressStudent3);
        Address addressTeacher1 = new Address("�����", "���������", 12, 5);
        Teacher teacher1 = new Teacher("Mary", "Petrovna", 33, addressTeacher1);
        Group group1 = new Group(110418, 2, list, teacher1);
        teacher1.setBasePay(600);
        teacher1.setWorkDays(5);

        Address addressStudent4 = new Address("111hjchm", "ikls", 6, 3);
        Student student4 = new Student("Roma", "Petrov", 19, addressStudent4);
//        addressStudent1.setStreet("Moscovskaya");
//		        Address address1 = new Address("������", 45);
//		        Student student2 = new Student("Misha", address1);
//		    }
//        Teacher teacher2 = new Teacher();
//        teacher1.TeacherPayment();

        System.out.println(group1.toString());

        group1.setRemoveStud(student2);
//
//        for (Student i : array) {
//            System.out.println(i);
//        }

//        group1.setRemoveStud(student2);
//        group1.addStudent(student1);
//        Student newArray[] = group1.getArray();
//        System.out.println("New group:");
//        for (Student j : newArray) {
//            System.out.println(j);
//       }
        System.out.println(group1.toString());
        group1.addStudent(student4);
        System.out.println(group1.toString());
        teacher1.setAge(120);
        System.out.println(teacher1.getAge());
        student1.setAge(11);
        System.out.println(student1.getAge());
    }
}