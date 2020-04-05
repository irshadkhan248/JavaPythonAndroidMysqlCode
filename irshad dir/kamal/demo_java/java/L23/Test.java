import java.util.concurrent.*;
class R1 implements Runnable{

public void run(){
for(int i=1;i<=5;i++)
System.out.println("Square "+i*i);
} 
}

class C1 implements Callable<Integer>{
public Integer call(){
for(int i=1;i<=5;i++)
System.out.println("Cube "+i*i*i);
return 0;
}
}

class Test{
public static void main(String args[]){
ExecutorService es=Executors.newFixedThreadPool(5);
es.submit(new R1());
es.submit(new C1());
es.shutdown();
}
}
