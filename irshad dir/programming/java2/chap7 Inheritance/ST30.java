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
	
	}
	class ST30
	{
		public static void main(String args[])
			{
			A a=new A();
			B b=new B();
			
			}
	}