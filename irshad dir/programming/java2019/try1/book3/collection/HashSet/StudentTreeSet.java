import java.util.*;
class Student implements Comparable<Student>{
	 int rno;
	 String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public int compareTo(Student s){
		return name.compareTo(s.name);
	}
}
class StudentTreeSet{
	public static void main(String args[]){
		Student s1=new Student(10,"Anil");
		Student s2=new Student(20,"Raj");
		Student s3=new  Student(30,"Sunil");
		Student s4=new  Student(40,"AAASunil");
		TreeSet<Student>sdata=new TreeSet<>();
		sdata.add(s1);
		sdata.add(s2);
		sdata.add(s3);
		sdata.add(s4);
		for(Student s:sdata)
			System.out.println(s.rno+" "+s.name);
	}
}