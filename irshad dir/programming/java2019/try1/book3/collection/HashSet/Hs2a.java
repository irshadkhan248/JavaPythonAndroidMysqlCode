import java.util.*;
class Student{
	 int rno;
	 String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public boolean equals(Object o){
		Student s=(Student)o;
		return(rno==s.rno);
	}
	public int hashCode(){
		return rno;
	}
}
class Hs2a{
	public static void main(String args[]){
		Student s1=new Student(10,"Anil");
		Student s2=new Student(10,"Raj");
		Student s3=new  Student(10,"Anil");
		HashSet<Student>sdata=new HashSet<>();
		sdata.add(s1);
		sdata.add(s2);
		sdata.add(s3);
		for(Student s:sdata)
			System.out.println(s.rno+" "+s.name);
	}
}