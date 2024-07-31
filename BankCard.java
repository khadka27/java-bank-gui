public class BankCard {


    //instance variables;

    private int cardID;
    private double balanceAmount;
    private String bankAccount;
    private String clientName;
    private String issuerBank;

    //constructor with different parameters
    

    protected BankCard(double balanceAmount,int cardID, String bankAccount,String issuerBank ){
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }

    public int getCardId(){
        return cardID;
    }

    public double getBalanceAmount(){
        return balanceAmount;
    }

    public String getBankAccount(){
        return bankAccount;
    }

    public String getClientName(){
        return clientName;
    }

    public String getIssuerBank(){
        return issuerBank;
    }
    

    //method to set the client name setter
    public void  setBalanceAmount(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;

    }

    //a method to display
    protected void display(){
        
        //checks if clientName is empty or not
        if (clientName.equals("")){
            System.out.println("Client name has not been set");
        
        }else{
            System.out.println("Client Name: " + clientName); 
        }
        System.out.println("Card Id: " + cardID);
        System.out.println("Balance Amount: " + balanceAmount);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Issuer Bank" + issuerBank);
    
    
    
    

}
}