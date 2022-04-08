import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {

    Scanner scan = new Scanner(System.in);
    List<String> toDoList = new ArrayList<>();
    Boolean isComplete;

    public Item(){
        isComplete = false;
    }

    public String readItem(){
        String itemToDo = scan.nextLine();
        return itemToDo;
    }

    public void addItemToList(String newItem){
        toDoList.add(newItem);
    }

    public String getOneItem(int itemNumber){
        return toDoList.get(itemNumber);
    }

    public void getAllItems(){
        for(int i = 0; i < toDoList.size(); i++){
            System.out.println(toDoList.get(i));
        }
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(){
        isComplete = true;
    }


    public void removeItem(int itemNumber) {
        toDoList.remove(itemNumber);
    }
}
