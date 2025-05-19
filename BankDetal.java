class BankDetal{
	
int balance=1000;
int debitCount, creditCount,printStatmentCount;

void debitAmt(){
debitCount=debitCount+1;
balance=balance-200;

 }
void creditAmt(){
creditCount=creditCount+1;
balance=balance+400;
 }
void display(){
 System.out.println("remaining balance is --->"+balance);
    } 
  void printCount(){
	printStatmentCount=printStatmentCount+1;  
  }
void printcountInfo(){
	System.out.println("debit method call count--->"+debitCount);
    System.out.println("credit method call count--->"+creditCount);
	System.out.println("printstatment method call count--->"+printStatmentCount);

 }
public static void main(String[] args){
	BankDetal bankdetail = new BankDetal();
	bankdetail.debitAmt();
	bankdetail.creditAmt();
	bankdetail.creditAmt();
	bankdetail.creditAmt();
	bankdetail.printCount();
	bankdetail.display();
	bankdetail.printcountInfo();
	bankdetail.printCount();
	bankdetail.printCount();
	bankdetail.printcountInfo();
}


}