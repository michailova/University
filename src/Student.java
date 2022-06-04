public class Student extends People {
    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);
    }

    @Override
    public String toString() {
        return "student: " + super.getName() + " " + super.getSurname() + " age: " + super.getAge() + " address: " + super.getAddress();
    }

}
