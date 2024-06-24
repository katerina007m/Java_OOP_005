import controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudentGroup("Группа 1", 0, "Учитель_А", "Учитель", "Учитель");
        controller.addStudentToGroup("Группа 1", 0, "Иван", "Петров", "Сидоров");
        controller.addStudentToGroup("Группа 1", 0, "Мария", "Иванова", "Павловна");

        controller.createStudentGroup("Группа 2", 0, "Учитель_Б", "Преподаватель", "Преподаватель");
        controller.addStudentToGroup("Группа 2", 0, "Алексей", "Смирнов", "Николаевич");
        controller.addStudentToGroup("Группа 2", 0, "Елена", "Козлова", "Александровна");
        controller.createStudent(0,"Asd","pkg","dfs" );

        controller.printStudentGroups();
    }
}