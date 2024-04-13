public class CreditCard
{
private String cardType;
private long cardNumber;
private float limit;//Max amount you can spend.
private float currentBalance;//The amount you have spent. It should be called amountUsed ???

//Constructors
CreditCard(){}
CreditCard(String cardType, long cardNumber, float limit, float currentBalance)
{
this.cardType = cardType;
this.cardNumber = cardNumber;
this.limit = limit;
this.currentBalance = currentBalance;
}

//Setters
public void setCardType(String cardType){ this.cardType = cardType;}
public void setCardNumber(long cardNumber){this.cardNumber = cardNumber;}
public void setLimit(float limit){this.limit = limit;}
public void setCurrentBalance(float currentBalance){this.currentBalance = currentBalance;}

//Getters
public String setCardType(){ return this.cardType;}
public long setCardNumber(){return this.cardNumber;}
public float setLimit(){return this.limit;}
public float setCurrentBalance(){return this.currentBalance;}

//Other methods
public boolean createCharge(float price)
{
if(price <= limit - currentBalance)
{
makePayment(price);
System.out.println("Transaction Successful !");
return true;//
}else
{
System.out.println("Transaction Faailure: Insufficient funds !");
return false;
}

}
