public class mainQueue{
	public static void main(String[] args){
		Queue q = new Queue(5);
		q.addQueue(7);	
		q.addQueue(5);	
		q.addQueue(2);	
		q.addQueue(6);
		q.addQueue(9);
		q.printLurus();	

		q.deleteLurus();
		q.printLurus();
	}
}
