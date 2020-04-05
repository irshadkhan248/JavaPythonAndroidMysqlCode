//program to illustrate method overridding;

	class A
	{
		 void calculate(double x)
		{
			System.out.println("Square of given number "+ x*x);
		}
	}
	class B extends A
	{
		 void  calculate(double x)
		{
			System.out.println("Square root of given number "+Math.sqrt(x));
		}
	}
	class CalTest
	{
		public static void main(String args[])
		{
			A a=new A();
			B b=new B();
			a.calculate(5);
			b.calculate(36);
		}
	}