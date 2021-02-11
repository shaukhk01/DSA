package UserStack;

public class Precedence {


	public int precedence(char x){

		if(x == '+' || x == '-')
			return 1;
		else if(x == '*' || x == '/')
			return 2;
		else
			return 0;

	}
}
