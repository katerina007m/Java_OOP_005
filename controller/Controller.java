package controller;
/*Задача 4 - Controller
� Создать package – controller. Работу продолжаем в нем
� Создать класс Controller агрегирующий в себе необходимые классы в виде
полей, а инициализируем прям в поле.
� Создаем метод созданиеСтудента – реализующий логику, путем вызова
соответствующих методов интерфейсов:
� Создания Студента в сервисе
� Возвращение всех студентов в сервисе
� Вызов view и передача списка найденных студентов */

import model.Student;
import model.Type;
import model.User;
import service.DataService;
import view.StudentView;

public class Controller {
    public static Controller controller;
    private StudentView sw = new StudentView();
    private DataService dataService = new DataService();

    public void createStudent(String fName, String name, String lastName) {
        dataService.create(fName, name, lastName, Type.Student);
    }

    public void printStudents(){
        for (User iterabl : dataService.getAllStudents()) {
            sw.printOnConsole((Student)iterabl);
        }
       
    }
}
