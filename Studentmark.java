class Studentmark{
int mark=40;

 void passed(int mark){
 if(mark>=40){
 System.out.println("Student is passed");
 }
 else if(mark<=40){
 System.out.println("Student is failed");
 }else{
	System.out.println("zero "); 
 }
 }
 public static void main(String[] args){
 Studentmark studentmark = new Studentmark();
 studentmark.passed(23);

}
}