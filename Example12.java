class Example12{
 void days(int dayIndex){
    if(dayIndex>=1 && dayIndex<=7){
	     if(dayIndex==1){
         System.out.println(+dayIndex+ "its a weekday");
         System.out.println( " Monday");
   	      }else if(dayIndex==2){
          System.out.println(+dayIndex+ "its a weekday");
          System.out.println( " Tuesday");
	      }else if(dayIndex==3){
          System.out.println(+dayIndex+ ":its a weekday");
          System.out.println( " Wensday");
	      }else if(dayIndex==4){
          System.out.println(+dayIndex+ "its a weekday");
          System.out.println( " Thusday");
	      }else if(dayIndex==5){
          System.out.println(+dayIndex+ "its a weekday");
          System.out.println( " Friday");
	      }else if(dayIndex==6){
          System.out.println(+dayIndex+ "its a weekend");
          System.out.println( " Saturday");
	      }else if(dayIndex==7){
          System.out.println(+dayIndex+ "its a weekdend");
          System.out.println( " Sunday");
	  }
	  }
    else {
   System.out.println(+dayIndex+ " Invoild Day index");
   }
   }
   public static void main(String[] args){
	   Example12 example12 = new Example12();
	   example12.days(4);
	   
   }

}