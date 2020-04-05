import java.util.*;
class Employee {
String name,location;
double salary;

Employee(String name,String location,double salary){
this.name=name;
this.location=location;
this.salary=salary;
}
/*public int compareTo(Employee e){
return(int)(e.salary-salary);
}*/
}
class An implements Comparator<Employee>{
public int compare(Employee e1,Employee e2){
return e1.name.compareTo(e2.name);
}
}

class Dn implements Comparator<Employee>{
public int compare(Employee e1,Employee e2){
return e2.name.compareTo(e1.name);
}
}

class As implements Comparator<Employee>{
public int compare(Employee e1,Employee e2){
return (int)(e1.salary-e2.salary);
}
}


class Ds implements Comparator<Employee>{
public int compare(Employee e1,Employee e2){
return (int)(e2.salary-e1.salary);
}
}

class MySort2_Comparator{
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
Collections.sort(e,new An());
System.out.println("Sorted List Assending Name: ");
for(Employee e10:e)
System.out.println(e10.name+" "+e10.location+" "+e10.salary);

System.out.println("\n\n");
Collections.sort(e,new Dn());
System.out.println("Sorted List Decending Name: ");
for(Employee e10:e)
System.out.println(e10.name+" "+e10.location+" "+e10.salary);

System.out.println("\n\n");
Collections.sort(e,new As());
System.out.println("Sorted List:Assending Salary ");
for(Employee e10:e)
System.out.println(e10.name+" "+e10.location+" "+e10.salary);

System.out.println("\n\n");
Collections.sort(e,new Ds());
System.out.println("Sorted List:Decending Salary ");
for(Employee e10:e)
System.out.println(e10.name+" "+e10.location+" "+e10.salary);
}
}