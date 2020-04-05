/*waoojp for class Rbi with following specfication:
IV:acc_no and balanve
PC:for acc_no and balance
IM:showDetails() for acc_no and balance
AM:deposit(amount)and withdraw(amount)

a new bank is getting opened under Rbi.
Rbi has asked the new bank to impose a penalty of min  rs for every deposit and 
a penalty of min 20 rs for every withdrawl */


abstract class Rbi{
int acc_no;
double balance;
Rbi(int acc_no,double balance){
this.acc_no=acc_no;
this.balance=balance;
}
void showDetails(){
System.out.println(acc_no+" "+balance);
}
abstract void deposit(double amount);
abstract void withdraw(double amount);
}

class NayaBank extends Rbi{
NayaBank(int acc_no,double balance){
super(acc_no,balance);
}
public void deposit(double amount){
balance=balance+amount-10;

}
public void withdraw(double amount){
balance=balance-amount-20;
}
}

class Test{
public static void main(String args[]){
NayaBank a=new NayaBank(101,5000);
a.showDetails();
a.deposit(1000);
a.showDetails();
a.withdraw(500);
a.showDetails();
}
}