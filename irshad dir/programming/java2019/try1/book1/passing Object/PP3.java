class Employee{
int n;
}

class PP3{
public static void c1(Employee r2){
r2.n=30;
}

public static void main(String args[]){
Employee r1=new Employee();
r1.n=20;
System.out.println("n="+r1.n);
c1(r1);
System.out.println("n="+r1.n);
}
}