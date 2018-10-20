public class ArrayQueue implements Queue{
	private Object [] arr;
	private int head;
	private int tail;

	public ArrayQueue(){
		arr = new Object[10];
		head = 0;
		tail = 0;
	}

	public void grow(){
		Object[] new_arr = new Object[arr.length*2];

		int tail = 0;
		for(int i = head; i < arr.length + head; i++)
			new_arr[tail++] = arr[i%arr.length];
		arr = new_arr;
		tail = arr.length;
		head = 0;
	}

	public void enqueue(Object obj){
		if(full())
			grow();
		arr[tail++] = obj;
		tail = tail%arr.length;

	}

	public Object dequeue(){
		if(empty())
			return null;
		Object obj = arr[head++];
		head = head%arr.length;
		return obj;

	}
	public boolean empty(){
		return tail==head;
	}

	public boolean full(){
		if((tail+1)%arr.length == head)
			return true;
		return false;
	}

}