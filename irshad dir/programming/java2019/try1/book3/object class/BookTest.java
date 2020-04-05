class Book{
	int isbn;
	String title;
	Book(int isbn,String title){
		this.isbn=isbn;
		this.title=title;
	}
	public String toString(){
		return isbn+" "+title;
	}
}
class BookTest{
	public static void main(String args[]){
		Book b1=new Book(1122,"oca");
		Book b2=new Book(1122,"ccna");
		System.out.println(b1.getClass());
		System.out.println(b2.getClass());
		System.out.println(b1+" "+b1.toString());
		System.out.println(b2+" "+b2.toString());
		System.out.println(b1);
		System.out.println(b2);

	}
}