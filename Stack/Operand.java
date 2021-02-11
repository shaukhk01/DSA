package UserStack;

public class Operand {



	public boolean isOperand(char x) {

		if(x == '+' || x == '-' || x == '*' || x == '/')
			return false;
		else
			return true;
	}

	/*public int precedence(char x){

		if(x=='+' || x=='-')
			return 1;
		else if(x=='*' || x=='/')
			return 2;
		return false;
	}*/
}

	
