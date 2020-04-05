import java.util.*;
public class Hs1{
	public static void main(String args[]){
		HashSet<String>carData=new HashSet<>();
		carData.add("Santro");
		carData.add("Esteem");
		carData.add("Accent");
		carData.add("Polo");
		carData.add("Xylo");
		carData.add("Accent");//in HashSet duplicate data are not allowed //HashSet cares about the uniqueness
		carData.add("Nano");
		System.out.println(carData.size());
		System.out.println(carData);
		System.out.println();
		carData.remove("Accent");
		carData.remove("XUV");
		System.out.println(carData);
		System.out.println();
		carData.clear();
		System.out.println(carData.isEmpty());
		System.out.println(carData);
		System.out.println();
	}
}