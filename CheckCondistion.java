class CheckCondistion{
	
	void prosess(int x){
		x=x/2;
		if(x>0){
			
			System.out.println("value of x is postive ");		
		}else if(x==0){
			System.out.println("value of x is zero");
		}else{
			System.out.println("value of x is negative ");	
		}
		
		}
		
		public static void main(String[] args){
		CheckCondistion checkcondistion = new CheckCondistion();
		checkcondistion.prosess(0);
			
		
		
	}
	
	
	
	
	
}