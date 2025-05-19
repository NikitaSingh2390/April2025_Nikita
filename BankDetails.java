class BankDetails{
int debitCount,creditCount,printStatmentCount;
static int totalDebitCount,totalCreditCount,totalPrintSatatmentCount;
void debitAmount(){
 debitCount=debitCount+1;
 totalDebitCount=totalDebitCount+1;
}
void creditAmount(){
creditCount=creditCount+1;
totalCreditCount=totalCreditCount+1;

}
void printStatment(){
printStatmentCount=printStatmentCount+1;
totalPrintSatatmentCount=totalPrintSatatmentCount+1;

}
void totalCountInfo(){

System.out.println(" debit method call count -> " +debitCount);
System.out.println(" credit method call count -> " +creditCount);
System.out.println(" printstatment  method call count -> " +printStatmentCount);
System.out.println();
}
void totalAllInfo(){
System.out.println("total debit Operations-->"+totalDebitCount);
System.out.println("total credit Operations-->"+totalCreditCount);
System.out.println("printstatment method call count --->"+totalPrintSatatmentCount);
System.out.println();
}
public static void main(String[] arg){
BankDetails bankdetails = new BankDetails();
BankDetails bankdetails_1 = new BankDetails();
bankdetails.debitAmount();
bankdetails.creditAmount();
bankdetails.creditAmount();
bankdetails.creditAmount();
bankdetails.printStatment();
bankdetails.totalCountInfo();

bankdetails_1.creditAmount();
bankdetails_1.printStatment();
bankdetails_1.printStatment();
bankdetails_1.printStatment();
bankdetails_1.totalCountInfo();
bankdetails_1.totalAllInfo();



}
 

}