import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private List<String> toDoList;
    private Task tasks;
    private boolean hasDueDate;

    public ToDoList(){
        toDoList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        tasks = new Task(scan);
    }

    public void addNewTaskToList(String newTask){
        tasks.insertNewTask(newTask);
        toDoList.add(newTask);
    }

    public void setHasDueDate(boolean hasDueDate) {
        this.hasDueDate = hasDueDate;
    }

    public void getAllTasks(){
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println(toDoList.get(i));
        }
    }
}
