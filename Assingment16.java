class Assingment16{
     int num;
	void max(int num1,int num2){
	 if(num1>num2){
	 System.out.println(num2+":is smaller between:"+num1);}
	 }
	void min(int num1, int num2){
	 if(num2>num1){
	 System.out.println(num2+":is bigger between "+num1);}
	 }
	 void even(){
		 for(num=1;num<15;num++){
			 if(num%2==0){
				 System.out.println(num+"number is even");
			 }
		 }
	 }
     public static void main(String[] args){
	 Assingment16 assingment16= new Assingment16();
	 assingment16.max(34,12);
	 assingment16.min(23,26);
	 assingment16.even();	
	 
	 }






}