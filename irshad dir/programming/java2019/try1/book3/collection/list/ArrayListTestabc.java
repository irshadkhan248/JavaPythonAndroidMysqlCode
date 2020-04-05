import java.util.*;
public class ArrayListTestabc{
	public static void main(String args[]){
		List<String> names=new ArrayList<>();
		names.add("robb");
		names.add("bran");
		names.add("rick");
		names.add("bran");
		if(names.remove("irshad"))
		names.remove("bran");
		else
		names.remove("rick");
	System.out.println(names);
		}
		}