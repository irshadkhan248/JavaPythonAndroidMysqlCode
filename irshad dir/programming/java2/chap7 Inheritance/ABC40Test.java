//casting generlizatiin specialization

class Friut
{}
class Lemon extends Friut
{}
class Mango extends Friut
{}
class ABC40Test
{
public static void main(String args[])
{
Friut f=new Friut();
Lemon l=new Lemon();
Mango m=new Mango();
Friut f1=new Lemon();
Friut f2=new Mango();
//f=()l;   			CAR
//f=(Friut)l;		CAR
//f=m;				CAR
//f=(Friut)m;		CAR
//l=f;				CF INCOMPATIBLE TYPES
			
//l=(Lemon)f;			c but not run	
//l=m;				not compile

}
}