package Postfix;
public  class ConvertIntoPostFix {
	
	char[] stack = new char[11];
	static public char[] post;
	int top = -1;
	
	private void push(char item) {
		
		stack[++top] = item;
		
	}
	
	private char pop() {
		
		if(top == 0)return ' ';
		return(stack[top--]);
	}
	
	private char peek() {
		
		if(isEmpty())
			return ' ';
		return stack[top];
	}
	
	private boolean isEmpty() {
		
		if(top == 0)
			return true;
		else
			return false;
	}
	
	private boolean isOperand(char x) {
		
		if(x == '+' || x == '*' || x == '-' || x == '/')
			return false;
		else
			return true;
	}
	
	private int precedence(char x) {
		
		if(x == '+' || x == '-')
			return 1;
		else if(x == '*' || x == '/')
			return 2;
		else
			return 0;
	}
	
	public char[] convert(ConvertIntoPostFix stack,char[]infix,char[]postfix) {
		
		int i = 0;
		int j = 0;
		
		while(infix[i] !='\000') {
			
			if(isOperand(infix[i])) {
				postfix[j++] = infix[i++];
			}
			else
			{
				if(precedence(infix[i])> precedence(stack.peek())) {
					
					stack.push(infix[i++]);
				}
				else
					postfix[j++] = stack.pop();
			}
		}
		while(!stack.isEmpty()) {
			
			postfix[j++] = stack.pop();
		}
		return postfix;
	}
	
	public static char[] Main() {
		
		
		ConvertIntoPostFix stack = new ConvertIntoPostFix();
		stack.push('#');
		//String str = "a+b*c";
		//String str = "a+b*c-d/e";
		// String str = "a+b+c-d";
		  String str = "3*5+6/2-4";
		char[] infix = new char[10];
		int i =0;
		for(char element : str.toCharArray())
			infix[i++] = element;
		char[] postfix = new char[10];
		post = stack.convert(stack,infix,postfix); 
		//System.out.println(post);

		return post;
	}

}

