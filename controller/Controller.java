package controller;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import model.Teacher;
import model.Type;
import model.StudentGroup;
import model.User;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

public class Controller {
    private StudentView sw = new StudentView();
    private DataService dataService = new DataService();
    private StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String fName, String name, String lastName) {
        dataService.create(fName, name, lastName, Type.Student);
    }

    public void printStudents(){
        for (User user : dataService.getAllStudents()) {
            sw.printOnConsole((Student) user);
        }
    }

    public void createStudentGroup() {
        Teacher teacher = null;
        List<Student> students = new ArrayList<>();

        for (User user : dataService.getListUsers()) {
            if (user instanceof Teacher) {
                teacher = (Teacher) user;
                break;
            }
        }

        for (User user : dataService.getAllStudents()) {
            students.add((Student) user);
        }

        StudentGroup studentGroup = studentGroupService.createStudentGroup(teacher, students);
        System.out.println("Student Group with Teacher " + teacher.getFullName() + " created successfully!");
        System.out.println("Students in the group:");
        for (Student student : studentGroup.getStudents()) {
            System.out.println(student.getFullName());
        }
    }


    public void printStudentGroups() {
        List<StudentGroup> studentGroups = studentGroupService.getAllStudentGroups();
        System.out.println("Student Groups:");
        for (StudentGroup group : studentGroups) {
            System.out.println("Group Name: " + group.getName());
            System.out.println("Teacher: " + group.getTeacher().getFullName());
            System.out.println("Students in the group:");
            for (Student student : group.getStudents()) {
                System.out.println(student.getFullName());  
            }
            System.out.println("---------------------------");
        }
    }
}