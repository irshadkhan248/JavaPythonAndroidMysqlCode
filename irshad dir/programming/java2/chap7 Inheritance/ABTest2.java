//program to illustrate method overloading

		class A
		{
			protected void display()
			{															
				System.out.println("welcome");
			}
		}
		class B extends A
		{
			String display(String s)
			{
				return "Welcome "+s;
			}

			public void display(String s,int a)
			{
				System.out.println("welcome "+s+" @ "+a);
			}
		}
		class ABTest2
		{
			public static void main(String args[])
			{
				A a=new A();
				a.display();
				B b=new B();
				b.display();
				System.out.println(b.display(" Ravi "));
				b.display(" Ravi ",200);
			}
		}