import controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Asd","pkg","dfs");
        controller.createStudent("Ist","Hgf","Dgh");
        controller.createStudent("Gfj","Pkjf","Fgh");
        controller.createStudent("Dgh","Vvb","Fgh");

        controller.printStudents();
        
    }
}
