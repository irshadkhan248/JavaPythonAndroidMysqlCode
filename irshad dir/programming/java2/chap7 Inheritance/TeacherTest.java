			class Person{
			private int id;
			private String name,address;
			public int getId()
			{
			return id;
			}
			public void setId(int id)
			{
			this.id=id;
			}

			public String getName()
			{
			return name;
			}
			public void setName(String name)
			{
			this.name=name;
			}


			public String getAddress()
			{
			return address;
			}
			public void setAddress(String address)
			{
			this.address=address;
			}
			}

			class Teacher extends Person
			{
			private double salary;
			public double getSalary()
			{
			return salary;
			}
			public void setSalary(double salary)
			{
			this.salary=salary;
			}
			}

			class TeacherTest
			{
			public static void main(String args[])
			{
			Teacher t=new Teacher();
			Person p=new Person();
			t.setId(101);
			t.setName("ravi");
			t.setAddress("mumbai");
			t.setSalary(25000);
			System.out.println("id= "+t.getId());
			System.out.println("name= "+t.getName());
			System.out.println("address= "+t.getAddress());
			System.out.println("salary= "+t.getSalary());
			}
			}























