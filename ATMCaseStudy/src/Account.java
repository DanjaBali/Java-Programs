/**
 *
 * @author Danja Bali UNYT 
 */
public class Account {
    private int accountNumber;
    private int pin;
    private double avaibleBalance;
    private double totalBalance;

    public Account( int theAccountNumber, int thePin,
            double theAvaibleBalance, double theTotalBalance)
    {
        accountNumber = theAccountNumber;
        pin = thePin;
        avaibleBalance = theAvaibleBalance;
        totalBalance = theTotalBalance;
    }
    public boolean validatePin (int userPin)
    {
        if (userPin == pin)
            return true;
        else
            return false;
    }
    public double getAvaibleBalance()
    {
        return avaibleBalance;
    }
    public double getTotalBalance()
    {
        return totalBalance;
    }
    public void credit (double amount)
    {
        totalBalance += amount;
    }
    public void debit (double amount)
    {
        avaibleBalance -= amount;
        totalBalance -= amount;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
}
