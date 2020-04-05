				//program to illustrate method overloading:

				class A
				{
				protected  void dispaly()
				{
				System.out.println("welcome");
				}
				}
				class B extends A
				{
				protected String dispaly(String s)
				{
				return "welcome"+s;
				}
				public void dispaly(String s,int n)
				{
				System.out.println("welcome "+s+"@"+n);
				}
				}
				class ABTest
				{
				public static void main(String args[])
				{
				A a=new A();
				a.dispaly();
				B b=new B();
				b.dispaly();
				/*String str1=*/;
				System.out.println(b.dispaly("vimal"));
				b.dispaly("kunal",200);
				}
			}