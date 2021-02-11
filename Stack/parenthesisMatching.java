
class Stack {

	
	 char[] stack;
	int top = -1;
	 Stack(int Length) {
		stack = new char[Length];
	}

	public void pop(){

		if(top >-1)
		stack[top--] = 0;
	}
	
	public void push(char item) {


		//if('(' == item)
		  if('{' == item || '(' == item || '[' == item )
    			stack[++top] = item;

		else if('}' == item || ']' == item || ')' == item)
		//else if(')' == item)
			   pop();
	}

	public boolean isEmpty(){

		return (top == -1 ? true : false);
	}
}

class Main extends Stack {

	public Main(){

		super(20);
	}

	public static void main(String[]args) {

		Stack stack = new Main();
		//String data = "((a+(b)+(a*b))";
		//String data = "{([a+b])* ([)c-d]/e}";
		 String data = "{[(])}";
		char[] item = data.toCharArray();

		for(char p : item){
			    stack.push(p);
		}
		System.out.println(stack.isEmpty());

	}
}

