/** **********************************************
 ***********     JAVA CALCULATOR    **************
 ********         BY Danja Bali       ************
 ************************************************ */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Calculator {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TODO code application logic here
        Scanner input = new Scanner(System.in);
        CalculatorTest Test = new CalculatorTest(); // create Test Object 
        int num1, num2, result; //variable storage, int type
        double result1;// variable storage, double type for float and int input for three last operation
        int choice = MenuOfChoice(); //inicialize choice with MenuOfChoice(); function 

        while (choice != 9) { //While condition for choices !=9
          //Switch case statement for each operation.
            switch (choice) {
                case 1:
                    System.out.println("Enter first number:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter the second number");
                    num2 = input.nextInt();
                    result = Test.Addition(num1, num2); //Class method for Addition
                    System.out.println(+num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    System.out.println("Enter first number:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter the second number");
                    num2 = input.nextInt();
                    result = Test.Substraction(num1, num2);//Class method for Substraction
                    System.out.println(+num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    System.out.println("Enter first number:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter the second number");
                    num2 = input.nextInt();
                    result = Test.Multipication(num1, num2);//Class method Multiplication
                    System.out.println(+num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    System.out.println("Enter two number:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter the second number(Cannot be zero for Divison)");
                    num2 = input.nextInt();
                    if (num2 == 0) { //Condition for division by zero 
                        System.out.println(+num1 + " / " + num2 + " = Undefined");
                    } else {
                        result = Test.Division(num1, num2); //Class method for Division
                        System.out.println(+num1 + " / " + num2 + " = " + result);
                    }
                    break;
                case 5:
                    System.out.println("Enter base:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter exponent:");
                    num2 = input.nextInt();
                    result = Test.power(num1, num2);//Class method for Power
                    System.out.println(+num1 + " ^ " + num2 + " = " + result);
                    break;
                case 6:
                    System.out.println("Enter number:   ");
                    num1 = input.nextInt();
                    result1 = Math.sin(Math.toRadians(num1));//Class method for Sin
                    System.out.printf("sin " + num1 + "°" + " =  %.1f", result1);
                    break;
                case 7:
                    System.out.println("Enter number: ");
                    num1 = input.nextInt();
                    result1 = Math.cos(Math.toRadians(num1));//Class method for Cos
                    System.out.printf(" cos " + num1 + "°" + " =  %.1f", result1);
                    break;
                case 8:
                    System.out.println("Enter number:   ");
                    num1 = input.nextInt();
                    System.out.println("Enter base:");
                    num2 = input.nextInt();
                    result1 = Test.logb(num1, num2);//Class method for Log
                    System.out.printf("Logarithm " + num1 + " with base " + num2 + " = %.2f", result1);
                    System.out.println("\n");
                    break;
                default:
                    break;
            }//end of swith case
            choice = MenuOfChoice();
        }//end of while

    }// end of main()

    private static int MenuOfChoice() { //Function of Menu of choice for each operation
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("\n*****Menu Of Choice ***** "
                + "\n1 For Addition:\n2 For Substratcion:\n3 For Multiplication: \n4 For Division:\n5 For power: \n6 For sine \n7 For cos:\n8 For log:"
                + "\n(-1) To exit:"
                + "\nEnter Choice: ");
        choice = input.nextInt();
        if (choice == -1) { // If condition to close program by pressing -1 
            System.exit(0);
        }
        if (choice > 8 || choice < 1) {   //if condition to warns the user for invalid options which differ from 1-9 and -1
            System.out.print("Invalid choice \n");//Print Message
            choice = MenuOfChoice();
        } //Function call to reprint MenuOfChoice
        return choice; //Return MenuOfChoice();

    } // end of MenuOfChoice()
}//end of public class calculator
