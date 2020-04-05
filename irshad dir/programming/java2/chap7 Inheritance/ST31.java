		//super calss construtor subclass construtor
	
	
	class A
	{
		A()
		{
			System.out.println("A() Sup CC ");
		}
	}
	class B extends A
	{
		B()
		{
			System.out.println("B() SuB CC ");
		}
		B(int d)
		{
			System.out.println("B(d) SuB CC ");
		}
	}
	class ST31
	{
		public static void main(String args[])
			{
			A a=new A();
			B b=new B();
			B b1=new B(5);
			}
	}