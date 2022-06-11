import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Address addressStudent1 = new Address("hghyfgdd", "ggfthghd", 4, 1);
        Address addressStudent2 = new Address("nhjfgdfs", "ghjfd", 5, 8);
        Address addressStudent3 = new Address("jhghjfg", "hjdtsds", 6, 3);
        Student student1 = new Student("Bob", "Ivanov", 18, addressStudent1, "young");
        Student student2 = new Student("Nik", "Ivanov", 20, addressStudent2, "young");
        Student student3 = new Student("Sam", "Ivanov", 19, addressStudent3, "young");
        ArrayList<Student> list = new ArrayList<Student>() {
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
        Teacher teacher1 = new Teacher("Mary", "Petrovna", 63, addressTeacher1, "retired");
        Teacher teacher2 = new Teacher("Kate", "Ivanova", 35, addressTeacher1, "young");
        Group group1 = new Group(110418, 2, list, teacher1, 2012, 2016);
        teacher1.setBasePay(600);
        teacher1.setWorkDays(5);
        teacher2.setBasePay(800);
        teacher2.setWorkDays(21);

        Group group2 = new Group(110418, 2, list, teacher1, 2010, 2015);

        ArrayList<Group> listGroup = new ArrayList<Group>() {
            {
                add(group1);
                add(group2);
            }
        };
        Address addressStudent4 = new Address("111hjchm", "ikls", 6, 3);
        Student student4 = new Student("Roma", "Petrov", 20, addressStudent4, "young");
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

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        Metodist metodist1 = Metodist.convertor(teacher1, teachers);
        System.out.println(metodist1);

        teachers.stream()
                .forEach(System.out::println);

        teachers.stream()
                .filter(x -> x.getGender() == "retired")
                .forEach(System.out::println);

        teachers.stream()
                .filter(x -> x.TeacherPayment() > 500)
                .forEach(System.out::println);

        listGroup.stream()
                .filter(x -> x.getYearStart() > 2011)
                .forEach(System.out::println);

        teachers.stream()
                .sorted(Teacher::compareTo)
                .forEach(System.out::println);

        AgeComparator ageComparatorStudent = new AgeComparator();
        list.stream()
                .sorted(ageComparatorStudent)
                .forEach(c -> System.out.println(c));
    }
//        AgeComparator ageComparatorTeacher = new AgeComparator();
//        teachers.stream()
//                .sorted(ageComparatorTeacher)
//                .forEach(System.out::println);
//}

}
