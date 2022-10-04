
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
public class Waiter extends User {

    private String internalPhoneNumber;
    private final int position = 0;

    public Waiter() {

    }

    public Waiter(String name, String surname, String username, String password, String address, String phoneNumber, String internalPhoneNumber) {
        super(name, surname, username, password, address, phoneNumber);
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public void Action() {
        wagePerHour();
    }

    public String getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber(String internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public boolean isWaiter() {
        if (this.position == 0) {
            return true;
        }
        return false;
    }

    static double wagePerHour(int standardHours, double overtimeBonus) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of hours worked in day: ");
        double totalHoursWorked = input.nextInt();

        double standardWage = 10.50;
        standardHours = 10;
        double totalWage;
        overtimeBonus = 5.00;
        double overtimeWage = 0.0;
        if (totalHoursWorked > standardHours) {
            double hoursRounded = Math.floor(totalHoursWorked);
            overtimeWage = (hoursRounded - standardHours) * overtimeBonus;
            totalWage = (standardWage * totalHoursWorked) + overtimeWage;
            // Formula: Daily Wage = Rate per hour * No. of hours worked + OverTime payâ€�
        } else if (totalHoursWorked < 10) {
            totalWage = standardWage * totalHoursWorked;
        } else {
            totalWage = standardWage * standardHours;
        }

        System.out.println("Your total salary of the day is: " + totalWage);

        return totalWage;
    }

    static double wagePerHour() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of hours worked in day: ");
        double totalHoursWorked = input.nextInt();

        double standardWage = 10.50;
        int standardHours = 10;
        double totalWage;
        double overtimeBonus = 5.00;
        double overtimeWage = 0.0;
        if (totalHoursWorked > standardHours) {
            double hoursRounded = Math.floor(totalHoursWorked);
            overtimeWage = (hoursRounded - standardHours) * overtimeBonus;
            totalWage = (standardWage * totalHoursWorked) + overtimeWage;
            // Formula: Daily Wage = Rate per hour * No. of hours worked + OverTime payâ€�
        } else if (totalHoursWorked < 10) {
            totalWage = standardWage * totalHoursWorked;
        } else {
            totalWage = standardWage * standardHours;
        }

        System.out.println("Your total salary of the day is: " + totalWage);

        return totalWage;
    }
}
