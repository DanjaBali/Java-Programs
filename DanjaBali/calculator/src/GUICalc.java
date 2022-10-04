/************************************************
***********     JAVA CALCULATOR    **************
********         BY Danja Bali       ************
*************************************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class GUICalc {

    public static void main(String[] args) {
//TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1, num2, result; //variables storage, type int.

        GUICalcTest Test = new GUICalcTest(); //Object Test

        int choice = MenuOfChoice(); //Inicialize choice with MenuOfChoice(); function
        while (choice != 9) {//While condition for choices !=9
            //Switch case statement for each operation.
            switch (choice) {
                case 1:
                    String Input1 = JOptionPane.showInputDialog("Enter first Number: ");
                    String Input2 = JOptionPane.showInputDialog("Enter second Number: ");
                    num1 = Integer.parseInt(Input2);
                    num2 = Integer.parseInt(Input2);
                    result = (int) Test.Addition(num1, num2);//Class method for Addition
                    JOptionPane.showMessageDialog(null, +num1 + " + " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    Input1 = JOptionPane.showInputDialog("Enter first Number: ");
                    Input2 = JOptionPane.showInputDialog("Enter second Number: ");
                    num1 = Integer.parseInt(Input1);
                    num2 = Integer.parseInt(Input2);
                    result = (int) Test.Substraction(num1, num2);//Class method for Substraction
                    JOptionPane.showMessageDialog(null, +num1 + " - " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    Input1 = JOptionPane.showInputDialog("Enter first Number: ");
                    Input2 = JOptionPane.showInputDialog("Enter second Number: ");
                    num1 = Integer.parseInt(Input1);
                    num2 = Integer.parseInt(Input2);
                    result = (int) Test.Multipication(num1, num2);//Class method Multiplication
                    JOptionPane.showMessageDialog(null, +num1 + " * " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    Input1 = JOptionPane.showInputDialog("Enter first Number: ");
                    Input2 = JOptionPane.showInputDialog("Enter second Number: ");
                    num1 = Integer.parseInt(Input1);
                    num2 = Integer.parseInt(Input2);
                    if (num2 == 0) {//Condition for division by zero 
                        JOptionPane.showMessageDialog(null, +num1 + " / " + num2 + " = Undefined");
                    } else {
                        result = (int) Test.Division(num1, num2);//Class method for Division
                        JOptionPane.showMessageDialog(null, +num1 + " / " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    }
                    break;
                case 5:
                    Input1 = JOptionPane.showInputDialog("Enter base: ");
                    Input2 = JOptionPane.showInputDialog("Enter exponent: ");
                    num1 = Integer.parseInt(Input1);
                    num2 = Integer.parseInt(Input2);
                    result = Test.power(num1, num2);//Class method for Power
                    JOptionPane.showMessageDialog(null, + num1 + " * " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 6:
                    Input1 = JOptionPane.showInputDialog("Enter Number: ");
                    num1 = Integer.parseInt(Input1);
                    result = (int) Math.sin(Math.toRadians(num1));//Class method for Sin
                    JOptionPane.showMessageDialog(null, "sin" + num1 + " ° " + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 7:
                    Input1 = JOptionPane.showInputDialog("Enter Number: ");
                    num1 = Integer.parseInt(Input1);
                    result = (int) Math.cos(Math.toRadians(num1));//Class method for Cos
                    JOptionPane.showMessageDialog(null, "cos" + num1 + " ° " + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                // end of main()
                case 8:
                    Input1 = JOptionPane.showInputDialog("Enter Number: ");
                    Input2 = JOptionPane.showInputDialog("Enter  Base: ");
                    num1 = Integer.parseInt(Input1);
                    num2 = Integer.parseInt(Input2);
                    result = (int) Test.logb(num1, num2);//Class method for Log
                    JOptionPane.showMessageDialog(null, "Logarithm " + num1 + " with base " + num2 + " = " + result, "Result", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    break;
            }// end of switch case
            choice = MenuOfChoice();
        }//end of while
    }// end of main()

//Void Returning method 
    private static int MenuOfChoice() {//Function of Menu of choice for each operation
        Scanner input = new Scanner(System.in);
        int choice;
        String Option;
        Option = JOptionPane.showInputDialog("****Menu Of choice **** "
                + "\n1 For Addition:\n2 For Substratcion:\n3 For Multiplication: \n4 For Division:\n5 For Power \n6 For sine:\n7 For cos:\n8 For log:"
                + "\n(-1) To exit:"
                + "\nEnter Choice: ");
        choice = Integer.parseInt(Option);

        if (choice == -1) {// If condition to close program by pressing -1 
            System.exit(0);//successful exit the program
        }
        if (choice > 8 || choice < 1) {//if condition to warns the user for invalid options which differ from 1-9 and -1
            JOptionPane.showMessageDialog(null, "Invalid choice \n"); //Print Message
            choice = MenuOfChoice();
        }//Function call to reprint MenuOfChoice
        return choice;// Return MenuOfChoice();
    } // end of MenuOfChoice()
}//end of public class calculator
