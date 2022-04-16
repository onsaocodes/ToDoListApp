import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task {
  private Scanner scan;
  private Boolean isComplete;
  private GregorianCalendar dueDate;

  public Task(Scanner scan){
    this.scan = scan;
    isComplete = false;
  }

  public String insertNewTask(String newTask){
    return newTask;
  }

  public Boolean getIsComplete(){
    return isComplete;
  }

  public void setIsComplete(){
    isComplete = true;
  }

  public void setDueDate(int year, int month, int date){
    dueDate.set(year, month, date);
  }

  public GregorianCalendar getDueDate(){
    return dueDate;
  }

//  public void markItemAsComplete(){
//    System.out.println("Are any items now complete? Please select using the number in the list");
//    int itemNumber = scan.nextInt();
//    item.getOneItem(itemNumber-1);
//    System.out.println("Is this complete?");
//    System.out.println("Type Y for Yes or N for No");
//
//    String choice = scan.nextLine();
//    if(choice.equalsIgnoreCase("y")){
//      item.setComplete();
//      item.removeItem(itemNumber);
//      item.getAllItems();
//    } else {
//      System.out.println("Not a valid option.");
//    }
//  }
}
