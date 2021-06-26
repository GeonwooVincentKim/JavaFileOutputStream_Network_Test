public class Student {
    private String name;
    private int studentNumber;
    private int age;

    public Student() {
    }

    public Student(String name, int studentNumber, int age) {
        this.setName(name);
        this.setStudentNumber(studentNumber);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
