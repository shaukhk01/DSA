package Postfix;

public class EvaluationOfPostfix extends ConvertIntoPostFix {


	public static void main(String[]args) {


		ConvertIntoPostFix postfix = new EvaluationOfPostfix();

		CalculateStack cal = new CalculateStack();

		//char[] post = postfix.Main();
		char[] post ={'2','3','4','*','+','8','2','/','-'};
	System.out.println(post);
		int result = cal.eval(post);
		System.out.println(result);
	}
}



