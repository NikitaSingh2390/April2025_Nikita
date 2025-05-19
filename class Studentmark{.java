class Studentmark{
int mark=40;

void passed(){

 if(mark>=40){
 System.out.println("Student is passed"+mark);
 }
elseif(mark<=40){
System.out.println("Student is failed"+mark);

}


}
public static void main(String[] args);
Studentmark studentmark = new Studentmark();
studentmark.passed();

}