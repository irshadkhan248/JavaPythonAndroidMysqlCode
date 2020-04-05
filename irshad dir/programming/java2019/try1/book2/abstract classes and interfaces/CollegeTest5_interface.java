interface MU{
	void fiyc();
	void syc();
	void tyc();
	void foyc();
}

class C1 implements MU{
	public void fiyc(){
		System.out.println("1st year C1 will do it ");
	}
	public void syc(){
		System.out.println("2nd year C1 will do it ");
	}
	public void tyc(){
		System.out.println("3rd year C1 will do it ");
	}
	 public void foyc(){
		 System.out.println("4th year C1 will do it ");
	 }
	
}

class C2 implements MU{
	public void fiyc(){
		System.out.println("1st year C2 will do it ");
	}
	public void syc(){
		System.out.println("2nd year C2 will do it ");
	}
	public void tyc(){
		System.out.println("3rd year C2 will do it ");
	}
	public void foyc(){
		System.out.println("4th year C2 will do it ");
	}
	
}

class CollegeTest5_interface{
	public static void main(String args[]){
		C1 c1obj=new C1();
		c1obj.fiyc();
		c1obj.syc();
		c1obj.tyc();
		c1obj.foyc();
		
		System.out.println("\n\n\n");
		
		C2 c2obj=new C2();
		c2obj.fiyc();
		c2obj.syc();
		c2obj.tyc();
		c2obj.foyc();
	}
}