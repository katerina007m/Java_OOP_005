package service;

import java.util.List;
import model.Student;
import model.Teacher;
import model.StudentGroup;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(teacher);
        for (Student student : students) {
            studentGroup.addStudent(student);
        }
        return studentGroup;
    }
}