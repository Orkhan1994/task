package task3;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;

    private List<Student> list=new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String name, List<Student> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
