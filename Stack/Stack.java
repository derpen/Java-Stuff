class Stack {
	public int[] stack;
	        public int max;
    		public int top;
	    
		public Stack(int size){
			max = size;
		      	stack = new int[max];
		 	top = -1;				        
		}
	     	public void push (int value){
	    		if(isFull() == false){
				top = top+1;
				stack[top]=value;
			}
		    	else{  
				System.out.println(value + "stack penuh"); 				       
			}       
		}
	    
		public boolean isFull(){
			return top==max-1;				        
		}

	    	public void print(){
		    for (int i=0; i<=top; i++){
			    if (i == top){
				    System.out.println(stack[i] + " top");						                }
			    else{
				    System.out.println(stack[i]);
			    }
		    }			        
		}        
		 
	     	public void printTop(){
			System.out.println("top adalah " +(top+1));
    		}
    		public void pop(){
			if(isEmpty()==false){
				System.out.println( "nilai yang dihapus :" +stack[top] );
				stack[top]= 0;
				top = top-1;

			}
			else{
				System.out.println("stack kosong");
			}		
				

		}

		public boolean isEmpty(){
			return top==-1;
		}
}

