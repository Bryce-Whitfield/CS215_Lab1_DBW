
public class BST {
	private class TNode {
		public int item;
		public TNode left;
		public TNode right;
		
		public TNode(int newitem) {
			this.item = newitem;
			this.left = null;
			this.right = null;
		}
	}
	
	public TNode root;
	
	public BST() {
		root = null;
	}
	
	private TNode insert(TNode currnode, int newitem) {
		if (currnode == null) {
			currnode = new TNode(newitem);
		} else if (newitem<currnode.item) {
			currnode.left = insert(currnode.left, newitem);
		} else {
			currnode.right = insert(currnode.right,newitem);
		}
		return currnode;
	}
	
	public void putItem(int newitem) {
		root = insert(root,newitem);
	}
	
	private boolean isEmpty() {
		return root == null;
	}
	
	private void printNodes(TNode currnode) {
		if (currnode != null) {
			printNodes(currnode.left);
			System.out.print(""+currnode.item+ " ");
			printNodes(currnode.right);
		}
		
	}
	
	public void printTree() {
		if(isEmpty()) {
			System.out.println("Empty Tree");
		} else {
			printNodes(root);
		}
	}
}
