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