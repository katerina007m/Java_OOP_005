package controller;

import model.Student;
import model.StudentGroup;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import view.StudentGroupView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {
    private StudentGroupView sgw = new StudentGroupView();
    private DataService dataService = new DataService();
    private List<Student> studentsList = new ArrayList<>(); // Создание списка для хранения студентов

    private HashMap<String, StudentGroup> studentGroups = new HashMap<>();

    public void createStudentGroup(String groupName, int teacherId, String teacherFName, String teacherName, String teacherLastName) {
        Teacher teacher = new Teacher(teacherId, teacherFName, teacherName, teacherLastName); // Создание объекта учителя с указанием ID и полным именем
        StudentGroup group = new StudentGroup(groupName, teacher); // Создание объекта группы и передача объекта учителя
        studentGroups.put(groupName, group);
    }

    public void addStudentToGroup(String groupName, int studentId, String fName, String name, String lastName) {
        Student student = new Student(studentId, fName, name, lastName); // Создание объекта студента
        studentGroups.get(groupName).addStudent(student); // Добавление студента в группу
    }

    public void printStudentGroups() {
        studentGroups.forEach((groupName, studentGroup) -> {
            System.out.println("Group: " + groupName);
            sgw.printOnConsole(studentGroup);
        });
    }

    public void createStudent(int studentId, String fName, String name, String lastName){
        Student student = new Student(studentId, fName, name, lastName);
        studentsList.add(student);
    }
}