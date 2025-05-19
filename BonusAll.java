class BonusAll{
double  balance;
double bouns;

void allCustomer(){
	
 if(balance>5000 ){
   bouns=0.05*balance;
   balance=balance + bouns;
   System.out.println("Current Balance is "+balance);
	
 if(balance<5000){
    bouns=0.02*balance;
	balance=balance+bouns;
    System.out.println("Current Balance is "+balance);
 }
 }else{
    bouns=0.02*balance;
	balance=balance+bouns;
    System.out.println("Current Balance is "+balance);
  }
  
  }
 public static void main(String[] args){
  BonusAll bonusall = new BonusAll();
  bonusall.allCustomer();
}

}