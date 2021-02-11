class A{

	public static void main(String[]args){
		System.out.println("HELLO");
	}
}

class B extends A {

	public static void main(String[]args){

		A a = new B();
		String[] s = {"hello"};
		a.main(s);
		System.out.println("WORLD");
	}

}
