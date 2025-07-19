public class function {

    private int accountholdernumber;
    private int pin;
    private String name;
    private double balance;



   public function(int accountholdernumber,int pin,String name){

    
    this.accountholdernumber = accountholdernumber;
    this.pin = pin;
    this.name = name;
    balance = 0;

   }
    

public int getaccountholdernumberr() {
    return accountholdernumber;
}
public void setaccountholdernumber(int accountholdernumber) {
    this.accountholdernumber = accountholdernumber;
}
public int getPin() {
    return pin;
}
public void setPin(int pin) {
    this.pin = pin;
}

public String getname( ){
    return name;
}

public void setname(String name){

    this.name = name;
}
public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}


    
public void balanceinquir(){


    System.out.println("Balance: "+ balance);
}

public double withdraw(double amount ) {

    if(amount<=0){

        System.out.println("Amount must be Positive ");
    }
    else {

        if(amount<balance){

             balance-=amount;
            System.out.println("succesfully Withdraw");
        }
        else {

            System.out.println("Balance is unsufficient! to withdraw");
        }
    }
    return balance;
}

public double deposit (double amount){

   
    return balance+=amount;
}

}
