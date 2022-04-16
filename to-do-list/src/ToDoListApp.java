import java.util.Scanner;

public class ToDoListApp {

    Scanner scan;
    ToDoList toDoList;

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 ToDoList toDoList = new ToDoList();
	 ToDoListApp toDoListApp = new ToDoListApp();
	 toDoListApp.run();
    }

    private void run() {
        welcome();
        buildList();
    }

    private void welcome() {
        System.out.println("Welcome to your to-do list.");
        System.out.println();
    }

    public void buildList() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Do you want to add an toDoList to the list?");
            System.out.println("Type Y for Yes or N for No");

            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Add new toDoList below:");
                String taskEntered = scan.nextLine();
                toDoList.addNewTaskToList(taskEntered);
                System.out.println("-------------------------------");
                System.out.println("Things to do:");
                toDoList.getAllTasks();
                System.out.println("-------------------------------");
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("-------------------------------");
                System.out.println("Things to do:");
                toDoList.getAllTasks();
                break;
            } else {
                System.out.println("Not a valid option.");
            }
        }
    }




}
