interface Actor{
	void act();
	void speak();
	default void comedy(){
		System.out.println("Comedy");
	}
}

class Hero implements Actor{
	public void act(){
		System.out.println("i can act");
	}
	public void speak(){
		System.out.println("i can speak hindi English");
	}
	public void comedy(){
		System.out.println("i can do Comedy");
	}
}

class Villain implements Actor{
	public void act(){
		System.out.println("i can act");
	}
	public void speak(){
		System.out.println("i can speak hindi English");
	}
	public static void main(String args[]){
		Hero h=new Hero();
		Villain v=new Villain();
		h.act();
		h.speak();
		h.comedy();
		System.out.println("\n");
		v.act();
		v.speak();
		v.comedy();
	}
}

