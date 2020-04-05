class Person{
private int id;
private String name,address;
public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}

public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}


public String getAddress()
{
return address;
}
public void setAddress(String address)
{
this.address=address;
}
}

class Teacher extends Person
{
private double salary;
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
this.salary=salary;
}
}

class Hod extends Teacher
{
private String dept;
public String getDept()
{
return dept;
}
public void setDept(String dept)
{
this.dept=dept;
}
}



class HodTest
{
public static void main(String args[])
{
Hod t=new Hod();
t.setId(101);
t.setName("ravi");
t.setAddress("mumbai");
t.setSalary(25000);
t.setDept("computer");
System.out.println("id= "+t.getId());
System.out.println("name= "+t.getName());
System.out.println("address= "+t.getAddress());
System.out.println("salary= "+t.getSalary());
System.out.println("Department= "+t.getDept());
}
}























