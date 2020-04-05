		//super calss construtor subclass construtor
	
	
	class A
	{
/* 		A() */
		{}
		A(int d)
		{
			System.out.println("A(d) Sup CC ");
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
			super();
		}
	
		void displayB()
		{
		
		System.out.println("B Method ");
	
		}
		
	}
	class ST36
	{
		public static void main(String args[])
			{
			A a=new A(5);
			a.displayA();
			B b=new B();
			b.displayB();
			}
	}