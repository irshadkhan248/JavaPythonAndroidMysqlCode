import java.io.*;
import java.util.*;
class Employee implements Serializable{
	transient int eid;
	transient String ename;
}
class O1{
	public static void main(String args[])throws Exception{
		Employee e=new Employee();
		e.eid=10;
		e.ename="Raj";
		
		FileOutputStream f1=new FileOutputStream("C:/demo_java/java/file1.ser");
		BufferedOutputStream b1=new BufferedOutputStream(f1);
		ObjectOutputStream o1=new ObjectOutputStream(b1);
		o1.writeObject(e);
		o1.close();
		
		FileInputStream f2=new FileInputStream("C:/demo_java/java/file1.ser");
		BufferedInputStream b2=new BufferedInputStream(f2);
		ObjectInputStream o2=new ObjectInputStream(b2);
		
		Employee b=(Employee)o2.readObject();
		System.out.println(b.eid+"  "+b.ename);
		o2.close();
	}
}