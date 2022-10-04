/**
 *
 * @author Danja Bali UNYT 
 */
public class BalanceInquiry extends Transaction {

    public BalanceInquiry (int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase)
    {
        super (userAccountNumber, atmScreen, atmBankDatabase);
    }
    
    @Override
    public void execute()
    {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        double availableBalance =
                bankDatabase.getAvailableBalance( getAccount() );
        double totalBalance = 
                bankDatabase.getTotalBalance( getAccount() );
        
        screen.displayMessageLine("\nBalance Information:");
        screen.displayMessage(" - Avalaible balance:    ");
        screen.displayDollarAmount(availableBalance);
        
        screen.displayMessage("\n - Total balance:    ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}
