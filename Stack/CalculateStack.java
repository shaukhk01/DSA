package Postfix;

public class CalculateStack{

	int[] stack = new int[20];
	static public int[] post;
	int top = -1;
	
	public void push(int item) {
		
		stack[++top] = item;
		
	}
	
	public int pop() {
		
		if(top == 0)return ' ';
		return(stack[top--]);
	}
	
	public int peek() {
		
		if(isEmpty())
			return ' ';
		return stack[top];
	}
	
	public boolean isEmpty() {
		
		if(top == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOperand(char x) {
		
		if(x == '+' || x == '*' || x == '-' || x == '/')
			return false;
		else
			return true;
	}
	
	public int precedence(char x) {
		
		if(x == '+' || x == '-')
			return 1;
		else if(x == '*' || x == '/')
			return 2;
		else
			return 0;
	}

	public int eval(char[] postfix){

		CalculateStack stack = new CalculateStack();
		stack.push('#');
		char[] post = new char[15];
		post = postfix;
		int i=0;
		int x1=0;
		int x2=0;
		int r =0;

		for(i = 0;post[i] <9;i++){

			if(isOperand(post[i])){
				stack.push(post[i]-'0');
			}
			else{
				x2 = stack.pop();
				x1 = stack.pop();

				switch(post[i]){
					case '+':
						r = x1 + x2;
						stack.push(r);
						break;
					case '-':
						r = x1 - x2;
						stack.push(r);
						break;
					case '*':
						r = x1 * x2;
						stack.push(r);
						break;
					case '/':
						r = x1 / x2;
						stack.push(r);
						break;
				}
			}
		}


		return stack.peek();
	}


}
