class BounsCustomer{
double  malebalance,Femalebalance;
double bouns;
void allCustomer(double femalebalnce){
	
 if(femalebalnce>5000 ){
   bouns=0.05*femalebalnce;
   femalebalnce=femalebalnce + bouns;
   System.out.println("Current Balance is geaterthan 5000 "+femalebalnce);
     if(femalebalnce<5000){
		
    bouns=0.02*femalebalnce;
	femalebalnce=femalebalnce+bouns;
    System.out.println("Current Balance is lessthan 5000::"+femalebalnce);
   } }else{
    bouns=0.02*malebalance;
	malebalance=malebalance+bouns;
    System.out.println("Current Balance is all member"+malebalance);
  }
  
  }
 public static void main(String[] args){
  BounsCustomer bounscustomer = new BounsCustomer();
  bounscustomer.allCustomer(2000);
}

}