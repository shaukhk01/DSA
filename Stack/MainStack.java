package UserStack;

public class MainStack {

	public static void main(String[]args) {

		UserStack stack = new UserStack(8);
		Precedence pre = new Precedence();
		Operand o = new Operand();
	//System.out.println(stack.size());
		/*
		stack.push('a');
		stack.push('b');
		stack.push('z');
		stack.push('+');
		stack.push('/');

		*/
		MainInfix infix = new MainInfix(8,"hello");
		//System.out.println(infix.data);
		stack.push('#');
		infix.convert();
	}
}
