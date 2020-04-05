//wajp for performing CURD operation with File.
import java.io.*;
import java.util.*;
class Student implements Serializable{
	private int rno;
	private String name;
	
	public Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}
	public String toString(){
		return " rno: "+rno+ " "+"  name: "+name;
	}
	public int hashCode(){
		return rno;
	}
	public boolean equals(Object o){
		Student s=(Student)o;
		return rno ==s.rno;
	}
}

class StudentTest{
	public static void main(String args[]){
		Console c=System.console();
		LinkedHashSet<Student>stu=new LinkedHashSet<>();
		try{
			FileInputStream f2=new FileInputStream("student_data.ser");
			BufferedInputStream b2=new BufferedInputStream(f2);
			ObjectInputStream o2=new ObjectInputStream(b2);
			stu=(LinkedHashSet<Student>)o2.readObject();
			o2.close();
		}
		catch(Exception e){}
		
		while(true){
			System.out.println();
			int op=Integer.parseInt(c.readLine(" 1 create , 2 read , 3 update , 4 delete , 5 exit :"));
			if(op==1){
				int rno=Integer.parseInt(c.readLine("Enter rno:"));
				String name=c.readLine("Enter Name:");
				Student s=new Student(rno,name);
				boolean res=stu.add(s);
				if(res)
					System.out.println("record created");
				else
					System.out.println(rno+" already exists");
			}
			else if(op==2){
				for(Student m:stu)
					System.out.println(m);
			} 
			else if (op==3){
				//write code for update
			}
			else if (op==4){
				//witer code for delete
			}
			else if (op==5){
				try{
			FileOutputStream f1=new FileOutputStream("student_data.ser");
			BufferedOutputStream b1=new BufferedOutputStream(f1);
			ObjectOutputStream o1=new ObjectOutputStream(b1);
			o1.writeObject(stu);
			o1.close();
		}
		catch(Exception e){
			System.out.println("ser issue "+e);
		}
		break;	
			}
			else{
				System.out.println("invalid option");
			}
		}		//end of while
	}			//end of main()
}				//end of class StudentTest