
class Batman
{
int square=91;
public static void main(String args[])
{
new Batman().go();
}

void go()
{
incr(++square);			//square=incr(++square);
System.out.println(square);
}

int incr(int square)
{
square+=10;
				//return square;		
}

}