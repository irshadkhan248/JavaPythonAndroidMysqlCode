import java.util.*;
class Employee implements Comparable<Employee>{
String name,location;
double salary;

Employee(String name,String location,double salary){
this.name=name;
this.location=location;
this.salary=salary;
}
public int compareTo(Employee e){
return(int)(e.salary-salary);
}
}
class MySort2{
public static void main(String args[]){
Employee e1=new Employee("Priya","Mumbai",4000);
Employee e2=new Employee("Anil","Pune",3000);
Employee e3=new Employee("Sam","Delhi",7000);
Employee e4=new Employee("Vijay","Patna",5000.0);
ArrayList<Employee>e=new ArrayList<Employee>();
e.add(e1);
e.add(e2);
e.add(e3);
e.add(e4);
Collections.sort(e);
System.out.println("Sorted List: ");
for(Employee e10:e)
System.out.println(e10.name+" "+e10.location+" "+e10.salary);

}
}