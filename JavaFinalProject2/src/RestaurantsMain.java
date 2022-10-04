
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
public class RestaurantsMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Restaurant menu = new Restaurant();
        LoyalCustomer l = new LoyalCustomer();
        CompanyCustomer c = new CompanyCustomer();
        CustomerEmployee ce =new CustomerEmployee();
        Table t =new Table();
            

        System.out.print("\t1- Login as Employee \n"
                + " \t2- Show Customer Interface ");
        int option = input.nextInt();
        if (option == 1) {
            menu.Login();
            menu.start();
        } else {
            System.out.print("Type of Customer \n"
                    + " \t1- Simple Customer \n "
                    + " \t2- Loyal Customer \n "
                    + " \t3- Company Customer \n "
                    + " \t4- Customer Employee \n ");
            /*int type = input.nextInt();
             if (type == 1) {
                 t.populateMenu();
                  System.out.print("No Bonus ");
             }
            if (type == 2) 
            {
                t.populateMenu();
                double b = l.GetBonus(300);
                System.out.print("Bonus " + b + " Euro");
                System.out.print("\n");
            }
            if (type == 3) 
            {
                t.populateMenu();
                double b = c.GetBonus(300);
                System.out.print("Bonus " + b + " Euro");
                System.out.print("\n");
            }
            if (type == 4) 
            {
                t.populateMenu();
                double b= ce.GetBonus(500);
                System.out.print("Bonus " + b + " Euro");
                System.out.print("\n");
            }*/
        }
    }
}
