		//super calss construtor subclass construtor
	
	
	class A
	{
		A()
		{
			System.out.println("A() Sup CC ");
		}
		A(int d)
		{
			System.out.println("A(d) Sup CC ");
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
		super(40);
			System.out.println("B(d) SuB CC ");
		}
	}
	class ST33
	{
		public static void main(String args[])
			{
			A a=new A();
			B b=new B();
			B b1=new B(5);
			}
	}