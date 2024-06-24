package view;

import model.Student;

/*Задача 3 - View/Dto
� Создать package – view. Работу продолжаем в нем
� Создать класс StudentView, содержащий в себе метод вывода в консоль
данных студента поданных на вход */



public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student);
    }
}
