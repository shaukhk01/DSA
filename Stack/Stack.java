public class Stack{


	int[] stack; 
	private int top = -1;

	private Stack(int Length){
		stack= new int[Length];
	}

	public void push(int item){

		
			try{
			stack[++top] = item;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Stack is full");
				System.exit(0);
			}
	}

	public int pop(){

		if(isEmpty()){
			System.out.println("stack is empty");
			System.exit(0);
		}
			
		int pop = stack[top];
		stack[top] = 0;
		top--;

		return pop;
	}

	public int peek(){

		if(isEmpty()){
			System.out.println("stack is empty");
			System.exit(0);
		}
		return stack[top];
	}
	public boolean isEmpty(){

		if(top == -1)
			return true;
		return false;
	}

	public static void main(String[]args) {

		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		//System.out.println(stack.pop());
//		System.out.println(stack.pop());

//		System.out.println(stack.peek());	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());	
		System.out.println(stack.peek());	
		System.out.println(stack.peek());	
	}
}
