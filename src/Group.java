import java.util.Arrays;

public class Group {
    private int nameGroup;
    private int numCourse;

    //public void MakeArray() {
    Teacher teacher;
    Student[] array;
    //Student studDel;
    //Student[] newArray;

    //	{
    //return ArrayStudentPrint();
    //for (int i=0;i<array.length;i++)	{
    //array[i] = Student student;
    //}
    public Group(int nameGroup, int numCourse, Student[] array, Teacher teacher) {

        this.nameGroup = nameGroup;
        this.array = array;
        this.teacher = teacher;
        this.numCourse = numCourse;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    //public void setStudent(Student student) {
    //	this.student = student;


    //        @Override
//        public String toString () {
//            return "� group: " + this.nameGroup + " cours: " + this.numCourse + "\n" +
//            " students: " + getArray() + "\n" + this.teacher.toString();
//        }
    @Override
    public String toString() {
        return "� group: " + this.nameGroup + " cours: " + this.numCourse + "\n" +
                " students: " + Arrays.toString(array) + "\n" + this.teacher.toString();
    }

    Student[] getArray() {
        return this.array;
    }

    public void setRemoveStud(Student studDel) {
        //this.studDel = studDel;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == studDel) {
                array[i] = null;
                break;
            }

        }

        Student newArray[] = new Student[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != null) {
                // for (j = 0; j < newArray.length; j++)
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
    }

    public void addStudent(Student studAdd) {
        Student newArray[] = new Student[array.length + 1];
        for (int j = 0; j < array.length; j++) {
            newArray[j] = array[j];

        }
        newArray[array.length] = studAdd;
        //for (j = 0; j < newArray.length; j++)
        array = newArray;
    }
}
