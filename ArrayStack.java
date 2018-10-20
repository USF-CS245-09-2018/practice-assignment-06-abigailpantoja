public class ArrayStack implements Stack{
	private Object[] arr = new Object[10];
	private int top = -1;

	public ArrayStack(){
		arr = new Object[10];
		top = -1;

	}



	public void grow(){
		Object[] new_arr = new Object[arr.length*2];
		for(int i = 0; i < arr.length; i++)
			new_arr[i] = arr[i];
		arr = new_arr;
	}

	public void push(Object obj){
		if(top+1 >= arr.length)
			grow();
		arr[++top] = obj;

	}

	public Object pop(){
		if(!empty())
			return arr[top--];
		return null;

	}

	public Object peek(){
		if(!empty())
			return arr[top];
		return null;

	}

	public boolean empty(){
		return top == -1;
	}






}