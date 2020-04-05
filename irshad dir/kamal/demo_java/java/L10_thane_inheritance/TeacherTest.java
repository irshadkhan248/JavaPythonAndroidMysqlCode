class Person{
private String name;
private int age;
private String add;

public void setName(String name){
this.name=name;
}
public void setAge(int age){
this.age=age;
}
public void setAdd(String add){
this.add=add;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
public String getAdd()
{
return add;
}
}

class Teacher extends Person{
private double sal;
public double getSal(){
return sal;
}
public void setSal(double sal){
this.sal=sal;
}
}

class TeacherTest{
public static void main(String args[])
{
Teacher t=new Teacher();
t.setName("amit");	
t.setAdd("thane");
t.setAge(25);
t.setSal(25000);
}
}