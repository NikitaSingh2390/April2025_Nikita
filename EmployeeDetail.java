class EmployeeDetail{
String FistName, last_Name,Address,PhonNumber;
int empId,managerId;

 void updatePrimaryinfo(){
	FistName = "nikita";
	last_Name="Sahu";
	empId = 8965;
	managerId=10;	
 }
 void secoundaryInfo(){
	 Address="sai marigold";
	 PhonNumber="5342335434";
 }
 void displayPrimaryinfo(){
	 System.out.println(" FistName: "+FistName);
	 System.out.println(" last_Name: "+last_Name);
	 System.out.println(" empId: "+empId);
	 System.out.println(" managerId: "+managerId);
	 System.out.println();
	  }
 void displaySecoundary(){
	 System.out.println(" Address: "+Address);
	 System.out.println(" PhonNumber: "+PhonNumber);
     System.out.println();	 
 }
 void displayAllInfo(){
	 System.out.println(" FistName: "+FistName);
	 System.out.println(" last_Name: "+last_Name);
	 System.out.println(" empId: "+empId);
	 System.out.println(" managerId: "+managerId);
	 System.out.println(" Address: "+Address);
	 System.out.println(" PhonNumber: "+PhonNumber);
 }
 public static void main(String[] arg){
 EmployeeDetail employeedetail = new EmployeeDetail();
 employeedetail.updatePrimaryinfo();
 employeedetail.displayPrimaryinfo();
 employeedetail.secoundaryInfo();
 employeedetail.displaySecoundary();
 employeedetail.updatePrimaryinfo();
 employeedetail.secoundaryInfo();
 employeedetail.displayAllInfo();
 


}
}