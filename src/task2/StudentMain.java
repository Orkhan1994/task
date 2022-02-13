package task2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("aaa", "AAA", 11);
        Student student2 = new Student("bbb", "BBB", 22);
        Student student3 = new Student("ccc", "CCC", 12);
        Student student4 = new Student("ddd", "DDD", 13);
        Student student5 = new Student("eee", "EEE", 14);
        Student student6 = new Student("fff", "FFF", 21);
        Student student7 = new Student("lll", "LLL", 20);
        Student student8 = new Student("nnn", "MMM", 19);
        Student student9 = new Student("zzz", "ZZZ", 23);
        Student student10 = new Student("xxx", "XXX", 23);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

   printStudentListFromAge19GreatThan(studentList);

    }

    public static void printStudentListFromAge19GreatThan(List<Student> studentList){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getAge() > 19) {
                System.out.println(studentList.get(i));
            }
        }
    }
}
