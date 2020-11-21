public class Stack {
	public int[] stack;
	public int top;
	private int size;

	Stack(int size){
		// 构建一个长度为size大小的空数组来模拟栈
		this.size = size;
		stack = new int[size];
		top = 0; // top永远指向下一个可放入的位置
	}


	public void push(int item){
		if(top >= size ){
			throw new ExceptionInInitializerError("StackOverflowError");
		}

		stack[top] = item;
		top++;
	}


	public int pop(){
		if(top <=0 ){
			throw new ExceptionInInitializerError("StackEmpty");
		}

		return stack[top--];

	}

	public int peek(){

		if(top <=0 ){
			throw new ExceptionInInitializerError("StackEmpty");
		}
		return stack[top-1];
	}

	public void show(){
		for(int i=top-1;i>=0;i--){
			System.out.print(" "+stack[i]);
		}
	}


}


