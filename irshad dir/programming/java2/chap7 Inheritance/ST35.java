		//super calss construtor subclass construtor
	
	
	class A
	{
		A()
		{
			System.out.println("A() Sup CC ");
		}
		void displayA()
		{
			System.out.println("A method ");
		}
	}
	class B extends A
	{
		B()
		{
			System.out.println("B() SuB CC ");
		}
		void displayB()
		{
		super.displayA();
		System.out.println("B Method ");
		super.displayA();
		}
		
	}
	class ST35
	{
		public static void main(String args[])
			{
			A a=new A();
			a.displayA();
			B b=new B();
			b.displayB();
			}
	}