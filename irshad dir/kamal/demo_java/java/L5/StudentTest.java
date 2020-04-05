/*waoojp for class Student:
IV:rno,name,sub1 and sub2
IM:setData(),showData() and findAvg()
*/

class Student
{
private int rno;
private String name;
private int sub1;
private int sub2;

public void setData(int rno,String name,int sub1,int sub2)
{
this.rno=rno;
this.name=name;
this.sub1=sub1;
this.sub2=sub2;
}
public void showData()
{
System.out.println("rno "+rno+ " name " + name + " sub1 " + sub1 + " sub2 " + sub2);
}
public double findAvg()
{
double ans=(sub1+sub2)/2.0;
System.out.println(ans);
return ans;
}
}

class StudentTest{
public static void main(String args[]){
int rno=Integer.parseInt(args[0]);
String name=args[1];
int sub1=Integer.parseInt(args[2]);
int sub2=Integer.parseInt(args[3]);
Student s1=new Student();
Student s2=new Student();
s1.setData(rno,name,sub1,sub2);
s1.showData();

/*s2.setData(rno,name,sub1,sub2);
s2.showData();*/


double avg=s1.findAvg();
System.out.println("Avg= "+avg);
}
}