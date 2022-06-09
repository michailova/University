import exception.OldException;
import exception.YoungException;

public class Student extends People {
    public Student(String name, String surname, int age, Address address, String gender) {
        super(name, surname, age, address, gender);
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
}
