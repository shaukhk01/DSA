//package UserStack;

public class UserStack {

	private char[] stack;
	private int top = -1;
	public int size; 

	public UserStack(int Length) {

		this.size = Length;
		stack = new char[Length];
	}
	public UserStack(){

	}

	public  void push(char item) {

		stack[++top] = item;
	}

	public char pop(){

		if(!isEmpty())
			return ' ';
		return(stack[top--]);
	}

	public boolean isEmpty(){

		return(top != -1 ? true : false);
	}

	public int size(){
		return this.size;
	}

	public boolean isOperand(char x) {

		if(x == '+' || x == '-' || x == '*' || x == '/')
			return false;
		else
			return true;

	}

	public int precedence(char x) {

		if(x == '+' || x == '-')
			return 1;
		else if(x == '*' || x== '/')
			return 2;
		else
			return 0;
	}

	public void convert(String string){

		UserStack stack = new UserStack();
		String str = string;
		char[] infix = new char[8];
		infix = str.toCharArray();
		char[] post = new char[8];
		int i = 0;
		int j = 0;
		
		while(infix[i] !='\000'){

			if(isOperand(infix[i])){
				post[j++] = infix[i++];
			}
			else{
				if(precedence(infix[i]) > precedence(stack.pop())){
					stack.push(infix[i++]);
				}
				else{
					post[j++] = stack.pop();
				}
			}
		}
	}


	public static void main(String[]args) {

		UserStack stack = new UserStack(8);
		stack.push('#');
		stack.convert("hello");
	}
}


