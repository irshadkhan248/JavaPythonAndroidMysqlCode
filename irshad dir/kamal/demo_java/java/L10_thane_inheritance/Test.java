/*wajp for the following 

class person:
IV: rno and name
PC:for rno and name
class Student extends Person
IV:marks
IM:showDetails -> for following rno,name,and marks
do write test case for Student object

*/

class Person{
int rno;
String name;

Person(int rno,String name){
this.rno=rno;
this.name=name;
}
}

class Student extends Person{
int marks;
Student(int rno,String name,int marks){
super(rno,name);
this.marks=marks;
}
void showDetails(){
System.out.println("rno:"+rno+" name:"+name+" marks:"+marks);
}
}
class Test{
public static void main(String args[]){
Student s=new Student(10,"amit",98);
s.showDetails();
}
}