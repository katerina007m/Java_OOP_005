package view;

import model.StudentGroup;

public class StudentGroupView {
    public void printOnConsole(StudentGroup studentGroup){
        System.out.println("Teacher: " + studentGroup.getTeacher());
        System.out.println("Students:");
        studentGroup.getStudents().forEach(student -> System.out.println(student));
    }
}