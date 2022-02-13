package task1;

public class Student {

    private String firstName;
    private  String lastName;
    private int age;
    private int totalPoint;



    public Student() {
    }

    public Student(String firstName, String lastName, int age, int totalPoint) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.totalPoint = totalPoint;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", totalPoint=" + totalPoint +
                '}';
    }
}
