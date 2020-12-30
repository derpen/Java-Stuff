public class Queue{
	public int[] queue;
	public int tail;
	public int max;
	public int head; //Head for QueueLurus

	public Queue(int size){
		queue = new int[size];
		max = size;
		tail = -1;
		head = 0; //Initialize Head
	}
	
	public void addQueue(int value){
		if(isFull()==true){
			System.out.println("Antrian Penuh");
		}
		else{
			tail++;
			queue[tail] = value;
		}
	}

	public boolean isFull(){
		return tail == max-1;
	}

	public void print(){
		for(int i = 0; i<= tail; i++){
			System.out.println(queue[i] + " ");
		}
	}
		
	public void delete(){
		if(isEmpty()==true){
			System.out.println("Antrian Kosong");
		}
		else{
			int value = queue[0];
			queue[0] = 0;
			for(int i = 1; i<= tail; i++){
				queue[i-1] = queue[i];
				queue[i] = 0;
			}
			tail--;
			System.out.println("Nilai yang dihapus " + value);
		}
	}

	public void deleteLurus(){
		if(isEmpty()==true){
			System.out.println("Antrian Kosong");
		}
		else{
			int value = queue[0];
			queue[0] = 0;
			head++;
			System.out.println("Nilai yang dihapus " + value);
		}
	}
	
	
	public void printLurus(){
		for(int i = head; i<= tail; i++){
			System.out.println(queue[i] + " ");
		}
	}

	public boolean isEmpty(){
		return tail == -1;
	}
}
