public class Ar_UList {
	private int[] List_Items;
	private int length;
	private static final int MAXSIZE = 10;
	private int currentPos;
	
	public Ar_UList(){
		this.length = 0;
		List_Items = new int[MAXSIZE];
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean isFull() {
		return length == MAXSIZE;
	}
	public void putItem(int pitem) {
		List_Items[length] = pitem;
		System.out.println(""+List_Items[length]+" added to list");
		length ++;
	}
	
	public void deleteItem(int element) {
		for(int i=0;i<List_Items.length;i++) {
			if(List_Items[i] == element) {
				List_Items[i] = List_Items[length-1];
				length--;
				break;
			}
		}
	}
	public void makeEmpty() {
		length = 0;
	}
	public void resetList() {
		currentPos = 0;
	}
	public int getNextItem() {
		currentPos++;
		return List_Items[currentPos-1];
	}
	public int getItem(int element) {
		for(int i=0;i<length;i++) {
			if(List_Items[i] == element) {
				return i;
			}
		}
		return -1;
	}
	public void printList() {
		for(int i=0;i<length;i++) {
			System.out.print(""+List_Items[i]+" ");
		}
		System.out.println();
	}
}
