/**
 *
 * @author Danja Bali UNYT 
 */
public class BankDatabase {
    private Account[] accounts;

    // ArrayList accounts = new ArrayList();
    
    public BankDatabase()
    {
        accounts = new Account[2];
        accounts[0] = new Account( 12345, 54321, 1000.0, 1200.0 );
        accounts[1] = new Account( 98765, 56789, 200.0, 200.0 );
        
        // SQL SELECT * From Accounts
        // while - fill the arraylist with DB data
        
    }
    private Account getAccount( int accountNumber )
    {
        for (Account currentAccount: accounts)
        {
            if(currentAccount.getAccountNumber()== accountNumber)
                return currentAccount;
        }
        return null;
    }
    
    public boolean authenticateUser( int userAccountNumber, int userPin )
    {
        Account userAccount = getAccount (userAccountNumber);

        if (userAccount != null)
            return userAccount.validatePin(userPin);
        else
            return false;
    }
    
    public double getAvailableBalance( int userAccountNumber )
    {
        return getAccount(userAccountNumber).getAvaibleBalance();
    }
    
    public double getTotalBalance( int userAccountNumber )
    {
        return getAccount(userAccountNumber).getTotalBalance();
    }
    
    public void credit ( int userAccountNumber, double amount )
    {
        getAccount(userAccountNumber).credit(amount);
    }
    
    public void debit ( int userAccountNumber, double amount )
    {
        getAccount(userAccountNumber).debit(amount);
    }
}
