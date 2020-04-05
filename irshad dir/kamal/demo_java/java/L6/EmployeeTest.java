/*waooj fro class Employee:
sv :compny_name="Accenture"
iv: eid,ename,and salary
sm:showCompanyName()
pc:for eid,ename and salary
im:showDetails()
create one object and test the above*/


import java.io.*;

class Employee{
private static String company_name="Accenture";
private int eid;
private String ename;
private double esalary;
public static void showCompanyName(){
System.out.println("Company Name "+company_name);
}
Employee(int eid,String ename,double esalary){
this.eid=eid;
this.ename=ename;
this.esalary=esalary;
}
public void showDetails(){
System.out.println(eid +" "+ename+" "+esalary+ " "+company_name);
}
}

class EmployeeTest{
public static void main(String args[])throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter Employee Id");
int eid=Integer.parseInt(br.readLine());

System.out.println("Enter Employee Name");
String ename=(br.readLine());

System.out.println("Enter Employee Salary");
double esalary=Double.parseDouble(br.readLine());
Employee e=new Employee(eid,ename,esalary);
e.showDetails();
e.showCompanyName();
}
}