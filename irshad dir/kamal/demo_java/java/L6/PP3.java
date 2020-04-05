class Employee{
int n;
}
class PP3{	
static void c1(Employee e2){
e2.n=30;
}


public static void main(String args[]){
Employee e=new Employee();
e.n=20;
System.out.println("n= "+e.n);
c1(e);
System.out.println("n= "+e.n);
}
}