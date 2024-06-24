package view;

import model.StudentGroup;

public class StudentGroupView {
    public void printOnConsole(StudentGroup studentGroup) {
        System.out.println("Информация о студенческой группе:");
        System.out.println("Преподаватель: " + studentGroup.getTeacher().getFullName());
        System.out.println("Список студентов:");
        for (int i = 0; i < studentGroup.getStudents().size(); i++) {
            System.out.println((i + 1) + ". " + studentGroup.getStudents().get(i).getFullName());
        }
    }
}