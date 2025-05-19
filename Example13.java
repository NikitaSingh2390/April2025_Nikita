class Example13{
	int count;
  void forProcess(){
     for (count=1;count<=100;count++){
		 if(count%3==0 && count%15==0){
			System.out.println(+count+ ": numbeer is even"); 
		  }
    
  }      }	  
		
  public static void main (String[] args){
	Example13 example13= new Example13();
	example13.forProcess();
	
}

}