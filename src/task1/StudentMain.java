package task1;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1=new Student("aaa","AAA",11,91);
        Student student2=new Student("bbb","BBB",15,85);
        Student student3=new Student("ccc","CCC",12,62);
        Student student4=new Student("ddd","DDD",13,51);
        Student student5=new Student("eee","EEE",14,48);

        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
       sortStudentsAccordingToTotalPoints(studentList);


    }
    public static void printStudentList(List<Student> studentList){
        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }

    }
    public static void sortStudentsAccordingToTotalPoints(List<Student>list){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getTotalPoint()>90){
                System.out.println(list.get(i).getFirstName()+" "+list.get(i).getLastName()+"  Elaci");
            }else if (list.get(i).getTotalPoint()<=90 && list.get(i).getTotalPoint()>80){
                System.out.println(list.get(i).getFirstName()+" "+list.get(i).getLastName()+"  Zerbeci");

            }else if (list.get(i).getTotalPoint()<=80 && list.get(i).getTotalPoint()>70){
                System.out.println(list.get(i).getFirstName()+" "+list.get(i).getLastName()+"  Normalci");

            }else if (list.get(i).getTotalPoint()<=70 && list.get(i).getTotalPoint()>60){
                System.out.println(list.get(i).getFirstName()+" "+list.get(i).getLastName()+"  Olmadiqci");

            }else if (list.get(i).getTotalPoint()<=60){
                System.out.println(list.get(i).getFirstName()+" "+list.get(i).getLastName()+"  Ayibci");

            }
        }

    }
}
