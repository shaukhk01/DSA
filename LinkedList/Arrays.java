package Arrays;

public class Arrays {


	int[] item;

	public Arrays(int length) {
		item = new int[length];
	}

	static int index = 0;

	public void insert(int x){


			item[index++] = x;
		}

	public void print(){

		for(int x:item)
		System.out.println(x);

		}
}


