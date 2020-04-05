//overloading and overriding
	class A
	{
	void calc(int x)
		{
			System.out.println("Square of given number "+ x*x);
		}
	}
	class B extends A
	{
	protected void  calc(int x)							//overriding
		{
			System.out.println("qube of given number "+ x*x*x);
		}
	protected void  calc(float x)						//overloading
		{
			System.out.println("Square root  of given number "+Math.sqrt(x));
		}
	}

	class ABTest10
	{
		public static void main(String args[])
			{
			B b =new B();
			A a =new A();
			a.calc(5);
			b.calc(2);
			b.calc(36f);
			}
	}
