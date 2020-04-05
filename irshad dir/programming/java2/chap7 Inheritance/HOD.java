class Person
{
private int id;
private String name;
private String address;

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

public String getaddress()
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
class HOD extends Teacher
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

public static void main(String args[])
{
	HOD hod=new HOD();
	hod.setId(101);
	hod.setAddress("Mumabi");
	hod.setName("ravi");
	hod.setSalary(25000);
	hod.setDept("copm");
	System.out.println("id "+hod.getId());
	System.out.println("name "+hod.getName());
	System.out.println("Address "+hod.getaddress());
	System.out.println("salary "+hod.getSalary());
	System.out.println("dept "+hod.getDept());
}
}























