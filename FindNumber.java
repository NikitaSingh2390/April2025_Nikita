class FindNumber{
void number(int x){
  if(x%2==0){
	  
    System.out.println("number is even"+x);
}else{
     System.out.println("number is Odd");
}

}
public static void main(String[] args){
 FindNumber findnumber =  new FindNumber();
 findnumber.number(30);
}


}