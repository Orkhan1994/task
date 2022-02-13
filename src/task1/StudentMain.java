package task1;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student("aaa","AAA",11);
        Student student2=new Student("bbb","BBB",15);
        Student student3=new Student("ccc","CCC",12);
        Student student4=new Student("ddd","DDD",13);
        Student student5=new Student("eee","EEE",14);

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }

    }
}
