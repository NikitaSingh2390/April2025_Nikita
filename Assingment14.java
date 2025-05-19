class Assingment14{
	int count;
   void divProcess(){
	 for(count=1;count<=100;count++){
	   if(count % 5==0){
	   System.out.println(count+":number is div by 5");
	   }
       else if(count%7==0){
	   System.out.println(count+": number is div by 7");
     }
	}
	}
	   void both(){
		   	 for(count=1;count<=100;count++)
	    if(count%5==0 && count%7==0){
		System.out.println(count+":number is div by both ");
		}	 
	 }
 
    public static void main(String[] args){
		Assingment14 assingment14 = new Assingment14();
		assingment14.divProcess();
		assingment14.both();
	}
}