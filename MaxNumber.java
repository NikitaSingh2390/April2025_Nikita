class MaxNumber{

 void max(int num1, int num2){
    if(num1>=1){
	System.out.println("is gether number "+num1);
	}
    else{
	System.out.println("is gether number "+num2);
	}
    }
  public static void main(String[] args){
   MaxNumber maxnumber = new MaxNumber();
   int input1=1;
   int input2=-235;
   maxnumber.max(input1,input2);
   }  
 }