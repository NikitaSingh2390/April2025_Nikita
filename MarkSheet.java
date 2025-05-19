class MarkSheet{
 void percent(double num){
     if(num>=90 && num<= 100){
	 System.out.println("Congreat You Got A grade " +num);
	 }
	 else if(num>= 80&& num<=90){
	 System.out.println("Congreat You Got b grade " +num);
	 }
	 else if(num>= 70&& num<=80){
	 System.out.println("Congreat You Got c grade " +num);
	 }
	 else if(num>= 60&& num<=70){
	 System.out.println("Congreat You Got d grade " +num);
	 }
	 else if(num>50&& num<=60){
	 System.out.println("Congreat You Got e grade " +num);
	 }
	 else if(num>20 && num <=50 ){
	 System.out.println("work hard " +num);
	 }
     else if(num<20){
		 System.out.println("invaild   "+num);
	 }
  }
  public static void main(String[] args){
       MarkSheet marksheet = new MarkSheet();
	   marksheet.percent(92);
	   marksheet.percent(76);
	   marksheet.percent(23);
	   marksheet.percent(19);
	   marksheet.percent(102);
  }
}