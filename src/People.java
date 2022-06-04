public class People {
    private String name;
    private String surname;
    private int age;
    private Address address;


    public People(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    Address getAddress() {
        return address;
    }
}
