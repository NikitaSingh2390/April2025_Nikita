class Example11 {
	
    void monthIndex(int num) {
        if (num >= 1 && num <=12) {
            if(num >= 1 && num <= 3){
                System.out.println(+num + ": jan is in Q1");
				}else if (num == 2){
                System.out.println(+num + ": feb is in Q1");
				}else if (num==3){
                System.out.println(+num + ": march is in Q1");
		        }
			if(num >= 4 && num <= 6){ 
			    System.out.println(+num + ": april is in Q2");
				}else if (num ==5) {
                System.out.println(+num + ": may is in Q2");
                }else if (num==6) {
                System.out.println(+num + ": june is in Q2");
                }
            if (num >= 7 && num <= 9){ 
			   System.out.println(num + ": July is in Q3");
				}else if (num==8){
                System.out.println(+num + ": Augest is in Q3");
               }else if (num==9){
                System.out.println(+num + ": September is in Q3");
              }
			if (num >= 10&& num <= 12){
                System.out.println(+num + ": Oct is in Q4");
			    }else if (num==11){
                System.out.println(+num + ": Nov is in Q4");
                }else if (num==12){
                System.out.println(+num + ": Dec is in Q4");
		}}
	   else {
            System.out.println(+num+"Number is invalid");
        }
    }

    public static void main(String[] args) {
        Example11 example11 = new Example11();
        example11.monthIndex(1);
    }
}

