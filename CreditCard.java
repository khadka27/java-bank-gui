
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


  public class CreditCard extends BankCard{
    
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;


    protected CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate){
        super(balanceAmount, cardID, bankAccount, issuerBank);
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //getters asked in question
    public int getCvcNumber(){
        return cvcNumber;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public int getGracePeriod(){
        return gracePeriod;
    }

    public boolean getIsGranted(){
        return isGranted;
    }

    //modifier for credit limit 
    public void setCreditLimit(int creditLimit, int gracePeriod){
        if (creditLimit<= 2.5 * getBalanceAmount()){
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            
        }
        else{
            System.out.println("Credit cannot be issued");
        }
        
    }
    //method to cancel the credit card
    protected void cancelCreditCard(){
        if(this.isGranted){
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        }
        else{
            System.out.println("Credit has not been granted");
        }
    }

    protected void display(){
        //call the display method of BankCard class
         super.display(); 
        if (this.isGranted){
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        }
        else{
            System.out.println("credit has not been granted");
        }
    }
}

