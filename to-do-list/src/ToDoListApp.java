import java.util.Scanner;

public class ToDoListApp {

    Scanner scan = new Scanner(System.in);
    Item item = new Item();

    public static void main(String[] args) {
	 ToDoListApp toDoList = new ToDoListApp();
	 toDoList.run();
    }

    private void run() {
        welcome();
        buildList();
        markItemAsComplete();
    }

    private void welcome() {
        System.out.println("Welcome to your to-do list.");
        System.out.println();
    }

    public void buildList() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Do you want to add an item to the list?");
            System.out.println("Type Y for Yes or N for No");

            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Add new item below:");
                String newItem = item.readItem();
                item.addItemToList(newItem);
                System.out.println("-------------------------------");
                System.out.println("Things to do:");
                item.getAllItems();
                System.out.println("-------------------------------");
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("-------------------------------");
                System.out.println("Things to do:");
                item.getAllItems();
                break;
            } else {
                System.out.println("Not a valid option.");
            }
        }
    }

    public void markItemAsComplete(){
            System.out.println("Are any items now complete? Please select using the number in the list");
            int itemNumber = scan.nextInt();
            item.getOneItem(itemNumber-1);
            System.out.println("Is this complete?");
            System.out.println("Type Y for Yes or N for No");

            String choice = scan.nextLine();
            if(choice.equalsIgnoreCase("y")){
                item.setComplete();
                item.removeItem(itemNumber);
                item.getAllItems();
            } else {
                System.out.println("Not a valid option.");
        }
    }


}
