class MainStack {	    
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.print();
		s.printTop();
		s.pop();
		s.pop();
		s.print();
		s.push(50);
		s.push(60);
		s.printTop();

	}	
}





