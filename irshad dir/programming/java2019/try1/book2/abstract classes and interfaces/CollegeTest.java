abstract class MU{
	
	void fiyc(){
		System.out.println("MU will do it ");
	}
	 abstract void syc();
	 abstract void tyc();
	void foyc(){
		System.out.println("MU will do it ");
	}
}

class C1 extends MU{
	void syc(){
		System.out.println("2nd year C1 will do it ");
	}
	void tyc(){
		System.out.println("3rd year C1 will do it ");
	}
	
}

class C2 extends MU{
	void syc(){
		System.out.println("2nd year C2 will do it ");
	}
	void tyc(){
		System.out.println("3rd year C2 will do it ");
	}
	
}

class CollegeTest{
	public static void main(String args[]){
		C1 c1obj=new C1(
		);
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