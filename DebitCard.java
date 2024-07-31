
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{

    private int pinNumber;
    private int withdrawlAmount;
    private String dateOfWithdrawl;
    private boolean hasWithdrawn; 

    protected DebitCard(double balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber){
        super(balanceAmount, cardID, bankAccount, issuerBank);
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public int getWithdrawlAmount(){
        return withdrawlAmount;
    }

    public String getDateOfWithdrawl(){
        return dateOfWithdrawl;
    }

    public boolean getHasWithdrawn(){
        return hasWithdrawn;
    }

    public void setWithdrawlAmount(int withdrawlAmount){
        this.withdrawlAmount = withdrawlAmount;
    }

    public void WithDraw(int withdrawlAmount, String dateOfWithdrawl , int pinNumber){
        //checked if pin is valid.
        if (this.pinNumber == pinNumber){
            //compare withdrawl amount and balance amount..
            if(withdrawlAmount<= getBalanceAmount()){
                super.setBalanceAmount(this.getBalanceAmount()-withdrawlAmount);
                this.withdrawlAmount = withdrawlAmount;
                this.dateOfWithdrawl = dateOfWithdrawl;
                this.hasWithdrawn = true;
            }
            else{
                System.out.println("balance is insufficient");
            }
        }
        else{
            System.out.println("Pin is invalid");
        }

    }

    protected void display(){
        super.display();
        System.out.println("PIN number: " + pinNumber);
        //  it display while  hasWithdrawn is true
        if(hasWithdrawn){
            System.out.println("Withdrawl amount: " + withdrawlAmount);
            System.out.println("Date of withdrawl: " + dateOfWithdrawl);
        } 
        //if hasWithdrawn is false, show the thoes  message in display.
        else{
            System.out.println("no withdrawl has been made");
        }

    }
   
}
