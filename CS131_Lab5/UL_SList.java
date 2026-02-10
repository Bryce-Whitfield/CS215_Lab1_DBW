public class UL_SList {
	private class LNode
	{
		public int item;
	    public LNode next;
	    public LNode prev;
	    public LNode(int newitem)
	    {
	    	item = newitem;
	    	next = null;
	    	prev = null;
	    }
	}
	private LNode ListEnd;
//	private LNode currentPos;	

	public UL_SList() {
		ListEnd = new LNode(Integer.MAX_VALUE);
		ListEnd.next = ListEnd;
		ListEnd.prev = ListEnd;
//		currentPos = null;
	}
	
	
	boolean isFull()  {
		return false; //Assume the size of a linked-list based implementation is UNBOUNDED for simplicity		
	}
	boolean isEmpty() {
		return ListEnd.next == ListEnd;
	}
	
	int getLength() {
		if(isEmpty()) {
			return 0;
		} else {
			LNode iterPos = ListEnd.next;
			int length = 0;
			while (iterPos.next != ListEnd) {
				iterPos = iterPos.next;
				length++;
			}
			return length;
		}
	}
	
	private LNode findItemNode(int fitem, int[] position) {
		position[0] = 0;
		LNode iterPos = ListEnd.next;
		while(iterPos != ListEnd && iterPos.item<fitem) {
			iterPos = iterPos.next;
			position[0]++;
		}
		if(iterPos.item != fitem) {
			position[0] = -1;
		}
		return iterPos;
	}
	
	int getItem(int gitem) {
		int[] position = {0};
		findItemNode(gitem, position);
		return position[0];
	}
	
	void makeEmpty() {
		ListEnd.next = ListEnd;
		ListEnd.prev = ListEnd;
	}
	
	void putItem(int pitem) throws Exception {
		if (this.isFull()) { //Note -- this should NEVER execute with this implementation!
			throw new Exception("List is full -- unable to add new item."); 
		}
		LNode newNode = new LNode(pitem);
		LNode nodeCurr = findItemNode(pitem, new int[1]);
		newNode.prev = nodeCurr.prev;
		newNode.next = nodeCurr;
		nodeCurr.prev.next = newNode;
		nodeCurr.prev = newNode;
	}
	
	void deleteItem(int ditem) throws Exception {		
		int[] testarr = new int[0];
		LNode currNode = findItemNode(ditem, testarr);
		if (testarr[0] == -1) {
			throw new Exception("Item not in list");
		}
		currNode.next.prev = currNode.prev;
		currNode.prev.next = currNode.next;
	}
	

	void printList() { 
		LNode iterPos = ListEnd.next;
		System.out.print("(");
		while (iterPos != ListEnd) {
			System.out.print(iterPos.item);
			if (iterPos.next != ListEnd)
				System.out.print(", ");
			iterPos = iterPos.next;
		}				
		System.out.println(")");
	}
}
