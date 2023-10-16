import java.util.*;
class Bank{
String accounthold;
double balance;

void bank(String accounthold,double initialbalance){
this.accounthold=accounthold;
if(initialbalance>1000){
this.balance=initialbalance;
}else{
	System.out.println("The balance should be greater than 1000");
}
}
void deposit(double amount){
if(amount>0){
	balance+=amount;
	System.out.println("Deposited"+amount);
	System.out.println("New Balance"+balance);
}else{
	System.out.println("Amount deposited is invalid");
}
}
void withdrawal(double amount){
	if(balance-amount>=1000){
		balance-=amount;
	System.out.println("Withdrawn Amount"+amount);
	System.out.println("New Balance"+balance);	
	}
	if(amount>balance){
		balance-=amount;
	System.out.println("Amount Invalid");	
	}else{
		System.out.println("Withdrawal of requested amount will result in balance lower than 1000");
	}
}
double getbalance(){
	return balance;
}

}
class Bank1{
public static void main(String[] args) {
        Bank bankAccount = new Bank();
        bankAccount.bank("Tanya Kumar",15000);
        System.out.println("Initial balance: " + bankAccount.getbalance());
        
        bankAccount.deposit(5000);
        bankAccount.withdrawal(2000);
        bankAccount.withdrawal(18500); 
    }	
}
