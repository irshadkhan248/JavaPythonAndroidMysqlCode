import java.util.*;
public class Quest
{
public static void main(String args[])
{
String []color={"blue","red","green","yellow","orange","pink","brawoon"};
Arrays.sort(color);
int s2=Arrays.binarySearch(color,"orange");
int s3=Arrays.binarySearch(color,"white");
System.out.println(s2+" "+s3);
}
}