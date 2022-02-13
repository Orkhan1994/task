package task3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student2 = new Student("bbb", "BBB", 14);
        Student student3 = new Student("ccc", "CCC", 21);
        Student student4 = new Student("ddd", "DDD", 15);
        Student student5 = new Student("eee", "EEE", 14);
        Student student6 = new Student("fff", "FFF", 21);
        Student student7 = new Student("lll", "LLL", 20);
        Student student8 = new Student("nnn", "MMM", 19);
        Student student9 = new Student("zzz", "ZZZ", 23);
        Student student10 = new Student("xxx", "XXX", 23);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student5);
        studentList2.add(student6);
        studentList2.add(student7);
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(student8);
        studentList3.add(student9);
        studentList3.add(student10);

        Teacher teacher1 = new Teacher("Teacher1", studentList1);
        Teacher teacher2 = new Teacher("Teacher2", studentList2);
        Teacher teacher3 = new Teacher("Teacher3", studentList3);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        printStudentsAge19GreatThanAndQuantity(teacherList);


    }

    public static void printStudentsAge19GreatThanAndQuantity(List<Teacher> teacherList) {
        int a = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            a = 0;
            for (int j = 0; j < teacherList.get(i).getList().size(); j++) {
                if (teacherList.get(i).getList().get(j).getAge() > 19) {
                    ++a;
                }
            }
            System.out.println(teacherList.get(i).getName() + " " + a);

        }
    }

}
