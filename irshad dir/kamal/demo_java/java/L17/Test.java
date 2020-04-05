//wajp dor Stream demonstraion

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Employee{
int eid;
String name;
String location;
double salary;
Employee(int eid,String name,String location,double salary){
this.eid=eid;
this.name=name;
this.location=location;
this.salary=salary;
}
public String toString(){
return eid+" "+name+" "+location+" "+salary;
}
}

class Test{
public static void main(String args[]){
ArrayList<Employee> e=new ArrayList<>();
Employee e1=new Employee(100,"Amit","Mumbai",4500.00);
Employee e2=new Employee(200,"Reena","Thane",6000.00);
Employee e3=new Employee(400,"Rumit","Mumbai",4500.00);
Employee e4=new Employee(300,"Veena","Thane",6500.00);
Employee e5=new Employee(500,"Sumit","Thane",7500.00);
Employee e6=new Employee(700,"Anil","Mumbai",5000.00);
Employee e7=new Employee(600,"Reema","Mumbai",5700.00);
e.add(e1);
e.add(e2);
e.add(e3);
e.add(e4);
e.add(e5);
e.add(e6);
e.add(e7);



// create Stream and display the Stream.
Stream<Employee>s1=e.stream();
s1.forEach(p -> System.out.println(p +" "));
System.out.println();

//create a stream of employees staying in mumbai.
Stream<Employee>s2=e.stream().filter(m -> m.location.equals("Mumbai"));
s2.forEach(p -> System.out.println(p +" "));
System.out.println();

//employee salary having salary greater than 6000.
Stream<Employee>s3=e.stream().filter(m -> m.salary>6000);
s3.forEach(p -> System.out.println(p +" "));
System.out.println();


//find the total salary of all employee.
double salary =e.stream().map(r -> r.salary).reduce(0.0,(x,y) ->(x+y));
System.out.println("Total Salary "+salary);

System.out.println();
System.out.println();
//dispay all employees as per decending order of salary


Comparator<Employee> c1=(t1,t2)->(int)(t2.salary-t1.salary);
e.stream().sorted(c1).forEach(p -> System.out.println(p));

}
}