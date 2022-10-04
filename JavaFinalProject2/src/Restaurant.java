
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danja Bali UNYT
 */
public class Restaurant {

    private boolean exit = false;
    private int option;
    Scanner input = new Scanner(System.in);

    private static int OrderNr=1;
    private ArrayList<Item> order = new ArrayList<>();
     
    private User currentUser;
    private MainDatabase main = new MainDatabase();
    private Waiter w = new Waiter();
    

    public void start() {
        do {
            printMenu();
            Action();

            System.out.println();
        } while (!exit);
    }
    
    public void Login(){
      System.out.print("Login as: \n"
                + "\t1- Manager \n "
                + "\t2- Waiter \n ");
        int type = input.nextInt();
        if (type == 1) {
            login();
        } else {
            WaiterLogin();
            w.Action();
        }
    }
   private void printMenu() {
        System.out.print("Menu\n"
                + "Choose an option:\n"
                + "\t1 - Insert item in table \n"
                + "\t2 - Remove item from table \n"
                + "\t3 - Modify item in table \n"
                + "\t4 - Print information for current table\n"
                + "\t5 - Print information for table with a certain ID\n"
                + "\t6 - Apply discount to table with 10%\n"
                + "\t7 - Overall number of tables for the waiter with a certain username\n"
                + "\t8 - Total amount of all tables processed by the waiter with a certain username \n"
                + "\t9 - Total number of all items processed by the waiter with a certain username  \n"
               + "\t10 - Total amount of all items of the current day \n"
               + "\t11 - Switch program from one waiter to another waiter\n"
               + "\t12 - Switch program from Waiter to Manager and vice-versa\n"
               + "\t13 - Exit\n"
               + "Select an option: ");

        option = input.nextInt();
    }
       private void Action() {
        switch (option) {
            case 1:
               
                break;
            case 2:
                
                break;
            case 3:
               
                break;
            case 4:
                
                break;
            case 5:
              
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
              
                break;
            case 9:
                
                  break;
            case 10:
                
                break;
            case 11:
              getServer();
                break;
            case 12:
                
                break;
            case 13:
                exit();
                break;
            default:
                System.out.println("Wrong Input. Enter a number between 1 and 13.");
                break;
        }
    }
       
    
     private void login() {
        boolean isAuthenticated;

        System.out.println("LOG IN");
        do {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            isAuthenticated = main.AuthenticateUser(username, password);

            if (isAuthenticated) {
                System.out.println("Logging In");
                currentUser = main.getAccount(username);
            } else {
                System.out.println("Invalid Username or Password\n");
            }
        } while (!isAuthenticated);

    }
          private void WaiterLogin() {
        boolean isAuthenticated;

        System.out.println("LOG IN");
        do {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            isAuthenticated = main.AuthenticateUser(username, password);

            if (isAuthenticated) {
                System.out.println("Logging In");
               currentUser = main.getWaiterAccount(username);
            } else {
                System.out.println("Invalid Username or Password\n");
            }
        } while (!isAuthenticated);

    }
   
    public void removeItem(Item item){
    order.remove(item);
    
}
     
  public String getServer(){
Random random = new Random();
int num=random.nextInt(4)+1;
switch(num){
     
           case 1:
            return "Mark"; 
          case 2:
            return "Rahul"; 
          case 3:
            return "Fred";
          case 4:
            return "Maria";
          case 5:
            return "Steve";   
            default:
            return "No Server Available";
 }
} 

 private void exit() {
        System.out.println("Closing the Program.");
        exit = true;
    }
 
}
