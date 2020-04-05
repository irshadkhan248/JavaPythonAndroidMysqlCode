import java.util.*;
public class Drink implements Comparable {
public String name;

public int compareTo(Object o) {
Drink d = (Drink)o;
return (name.compareTo(d.name));
}

public static void main(String args[]) {
Drink one = new Drink();
Drink two = new Drink();
one.name= "Coffee";
two.name= "Tea";
TreeSet<Drink> set = new TreeSet<Drink>();
set.add(one);
set.add(two);
for(Drink d10 : set)
System.out.print(d10.name + " ");
} 
}