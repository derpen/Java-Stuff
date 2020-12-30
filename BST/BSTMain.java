class BSTMain{
	class Node{
		int value;
		Node left, right;

		public Node(int data){
			value = data;
			left = right = null;
		}
	}
	Node root;

	BSTMain(){
		root = null;
	}

	//Insert
	void insert(int value){
		root = insertRec(root, value);
	}

	Node insertRec(Node root, int value){
		if(root == null){
			root = new Node(value);
			return root;
		}

		if(value < root.value)
			root.left = insertRec(root.left, value);
		else if(value > root.value)
			root.right = insertRec(root.right, value);

		return root;
	}

	// Print Order
	void inorder(){
		inorderRec(root);
	}
	
	void inorderRec(Node root){
		if(root != null){
			inorderRec(root.left);
			System.out.print(root.value + " ");
			inorderRec(root.right);
		}
	}

	// Print no Order
	void noorder(){
		noorderRec(root);
	}
	void noorderRec(Node root){
		if(root != null){
			System.out.print(root.value + " ");
			noorderRec(root.left);
			noorderRec(root.right);
		}
	}

	// Delete
	void deleteKey(int value){
		root = deleteRec(root, value);
	}

	Node deleteRec(Node root, int value){
		if(root == null)
			return root;

		if(value < root.value)
			root.left = deleteRec(root.left, value);
		else if(value > root.value)
			root.right = deleteRec(root.right, value);

		else{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;

			root.value = minValue(root.right);

			root.right = deleteRec(root.right, root.value);
		}
		return root;
	}

	int minValue(Node root){
		int minv = root.value;
		while(root.left != null){
			minv = root.left.value;
			root = root.left;
		}
		return minv;
	}


	public static void main(String[] args){
		BSTMain tree = new BSTMain();

		tree.insert(50);
		tree.insert(69);
		tree.insert(12);
		tree.insert(35);
		tree.insert(62);
		tree.insert(72);
		System.out.println("Not ordered");
		tree.noorder();

		System.out.println("");
		tree.deleteKey(50);
		tree.noorder();

		System.out.println("");
		tree.deleteKey(35);
		tree.noorder();
		
		System.out.println("");
		tree.deleteKey(12);
		tree.noorder();
	}
}
