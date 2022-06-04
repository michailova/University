
    public class Teacher extends People {

        private int basePay;
        private int workDays;

        public Teacher(String name, String surname, int age, Address address) {
            super(name, surname, age, address);
            this.basePay = 50;
            this.workDays = 21;
        }
        //private String teacherPayment;

        /*public void TeacherPayment () {
            System.out.println(basePay*workDays);
            }*/
        public int TeacherPayment() {
            int teacherPayment = basePay*workDays;
            return teacherPayment;
        }

        public void setBasePay (int basePay) {
            this.basePay = basePay;
        }
        public void setWorkDays (int workDays) {
            this.workDays = workDays;
        }

        @Override
        public String toString() {
            return "teacher: "+super.getName()+" "+getSurname()+ " age: "+super.getAge()+" address: "+super.getAddress()+" payment: "+this.TeacherPayment();
        }

    }

