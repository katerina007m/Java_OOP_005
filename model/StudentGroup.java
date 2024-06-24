package model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayGroupInfo() {
        System.out.println("Teacher: " + teacher);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}