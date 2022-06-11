import exception.OldException;
import exception.YoungException;

public class Student extends People implements Comparable <Student>{
    public Student(String name, String surname, int age, Address address, String gender) {
        super(name, surname, age, address, gender);
    }

    @Override
    String getSurname() {
        return super.getSurname();
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
    public String toString() {
        return "student: " + super.getName() + " " + super.getSurname() + " age: " + super.getAge() + " address: " + super.getAddress()+ " gender: " + super.getGender();
    }

    @Override
    public void setAge(int age) {
        try {
            CheckYoungAge(age);
            CheckOldAge(age);
            super.setAge(age);
        } catch (YoungException | OldException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private void CheckYoungAge(int age) throws YoungException {

        if (age < 16) {
            throw new YoungException("слишком молод");
        }
    }

    public static void CheckOldAge(int age) throws OldException {

        if (age > 100) {
            throw new OldException("старик");
        }
    }

//    @Override
//    public int compareTo(Car o) {
//        if (brend.compareTo(o.brend) == 0) {
//            return this.model.compareTo(o.model);
//        }
//        return this.model.compareTo(o.model);
//    }
//}
//    @Override
//    public int compareTo(Car o) {
//
//        return o.maxSpeed - this.maxSpeed;
//    }

    @Override
    public int compareTo(Student o) {
        return this.getSurname().compareTo(o.getSurname());
    }

}
