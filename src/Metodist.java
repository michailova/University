import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Metodist extends People {

    ArrayList<Teacher> teachers = new ArrayList<>();

    public Metodist(String name, String surname, int age, Address address, ArrayList<Teacher> teachers, String gender) {
        super(name, surname, age, address, gender);
        this.teachers = teachers;
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    String getSurname() {
        return super.getSurname();
    }

    @Override
    int getAge() {
        return super.getAge();
    }

    @Override
    Address getAddress() {
        return super.getAddress();
    }


    public static Metodist convertor(Teacher teacher, ArrayList<Teacher> teachers) {
        Function<Teacher, Metodist> convertor1 = Teacher -> new Metodist(Teacher.getSurname(), Teacher.getName(), Teacher.getAge(),  Teacher.getAddress(),  teachers, Teacher.getGender());
        return convertor1.apply(teacher);
    }

    @Override
    public String toString() {
        return "Metodist: " + super.getName() + " " + super.getSurname() + " age: " + super.getAge() + " address: " + super.getAddress()+ " teachers" + teachers.toString();
    }
    }

