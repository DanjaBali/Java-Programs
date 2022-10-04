/**
 *
 * @author Danja Bali UNYT 
 */
public class Deposit extends Transaction
{
    private double amount;
    private Keypad keypad;
    private DepositSlot depositSlot;
    private final static int CANCELED = 0;

    public Deposit ( int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase, Keypad atmKeypad,
            DepositSlot atmDepositSlot)
    {
         super (userAccountNumber, atmScreen, atmBankDatabase);
         keypad = atmKeypad;
         depositSlot = atmDepositSlot;
    }
    
@Override
public void execute()
    {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        amount = promptForDepositAmount();

        if (amount !=CANCELED)
        {
        screen.displayMessage("\nPlease insert a deposit envelope containing ");
        screen.displayDollarAmount(amount);
        screen.displayMessageLine(".");

        boolean envelopeRecevied = depositSlot.isEnvelopeReceived();

        if(envelopeRecevied)
        {
        screen.displayMessageLine("Your envelope has been "
                + "recevied.\nNOTE: The money just deposited will not "
                + "be avaible we verify the amount of any "
                + "enclosed cash and your checks clear");
        bankDatabase.credit(getAccount(), amount);
        }
        else
        screen.displayMessageLine("Your envelope has not been validated!");
       }
 else
        {
        screen.displayMessageLine("\nCanceling transaction...");
        }
}

    private double promptForDepositAmount() {
        Screen screen = getScreen();
        screen.displayMessage("\nPlease enter a deposit amount "
                + "CENTS (or 0 to cancel): ");
        int input = keypad.getInput();

        if (input == CANCELED)
            return CANCELED;
        else
        return( double ) input / 100;
    }
}
