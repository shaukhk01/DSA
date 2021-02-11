package UserStack;

public class MainInfix {


	UserStack stack; 
	Precedence pre = new Precedence();
	Operand o = new Operand();;
	public String data;
	private char[] infix;
	private char[] postfix;
	private int index;
	public MainInfix(int Length,String data){

		this.infix = new char[Length];
		this.postfix = new char[Length];
		this.index = 0;
		this.data = this.data;
	//	this.stack = this.stack;
	//	this.pre = this.pre;
	//	this.o = this.o;

		
		for(char item : data.toCharArray()){
			infix[index++] = item;
		}
		
	}

	public void convert() {

		int i = 0;
		int j = 0;

		while(infix[i] !='\000'){
			if(o.isOperand(infix[i])){
				postfix[j++] =infix[i++];
			}
			else{
				if(pre.precedence(infix[i]) >pre.precedence(stack.pop())){
					stack.push(infix[i++]);
				}
				else{
					postfix[j++] = stack.pop();
				}
			}
		}
	while(!stack.isEmpty()){
		postfix[j++] = stack.pop();
	}
	}
}
