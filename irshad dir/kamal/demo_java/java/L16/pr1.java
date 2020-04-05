import java.util.*;
class pr1{
public static void main(String args[]){
HashSet<String>python=new HashSet<>();
python.add("ravi");
python.add("seema");
python.add("raj");

HashSet<String>android=new HashSet<>();
android.add("raju");
android.add("seema");
android.add("reema");
android.add("ravi");




///union
System.out.println("\t\t\t::::Union:::: ");
HashSet<String>s1=new HashSet<>();
for(String m:python)
s1.add(m);

for(String m:android)
s1.add(m);

for(String m:s1)
System.out.println(m);

//intersection

System.out.println("\t\t\t::::Interscetion:::: ");
HashSet<String>s2=new HashSet<>();
for(String m:python)
s1.add(m);



for(String m:python)
s1.add(m);

for(String m:android)
s1.add(m);


for (String t : m) {
            if(t.contains(s1)) {
                //list.add(t);
	System.out.println(t);
            }
}
}
}