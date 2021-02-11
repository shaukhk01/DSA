interface Interf{

	public void members();
}

class Store {

	Interf[] interf = new Interf[10];
	int count = 0;

	void register(Interf m){

		interf[count++] = m;
	}

	void call(){

		for(int index = 0;index<count;index++){
			interf[index].members();
		}
	}
}


class Customers implements Interf {


	String name;

	Customers(String name){
		this.name = name;
	}

	public void members(){

		System.out.println("hi "+name);
	}

}

class Main {
	public static void main(String[]args){

		Customers c1 = new Customers("annie");
		Customers c2 = new Customers("hector");
		Customers c3 = new Customers("bridget");
		Store s = new Store();
		s.register(c1);
		s.register(c2);
		s.register(c3);
		s.call();
	}
}

