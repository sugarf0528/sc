public class Queue {
	public int[] queue;
	public int index,maxIndex;
	private int size,head,tail;

	Queue(int size){
		// 构建一个长度为size大小的空数组来模拟队列
		this.size = size;
		queue = new int[size];
		head = tail;
	}

	public void add(int item){
		if (head == tail) { //先判断是不是空的
			queue[head] = item;
			tail = 1;
			size++;
		} else {
			queue[tail] = item;
			tail = tail + 1;
			size++;
		}
	}


	public void del(){
			while (queue[head+1] != 0) {
				queue[head] = queue[head+1];
				head++;
			}
			tail--;
			size--;
	}



	public void show(){
		for(int i=0;i<tail;i++){
			System.out.print(" "+queue[i]);
		}
	}


}


