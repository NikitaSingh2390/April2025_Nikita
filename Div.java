class Div{
 void add(int num){
 
 if (num % 2==0){
 System.out.println("its even " +num);
 }
 else {
 System.out.println("it is odd");
 }
 if (num>100&&num<1000){
	System.out.println("its is 3 digit number"); 
	 
 }
 else{System.out.println("it is not");
 }


 }
public static void main(String[] args) {
 Div div = new Div();
 div.add(300);
 
}

}