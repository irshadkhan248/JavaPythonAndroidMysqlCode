public class ScorePrinter{

public static void printScore(int... score){
for(int x:score)
{
System.out.print(x +", ");
}
}
public static void main(String args[])
{
int x[]={198,247,895,754,635};
printScore(x);
}
}