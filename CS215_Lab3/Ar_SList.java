public class Ar_SList {
	public static final int MAXSIZE = 10;
	private int[] List_Items;
	private int length;
	private int currentPos = 0;
	
	public Ar_SList() {
		this.length = 0;
		this.List_Items = new int[MAXSIZE];
	}
	
	public void putItem(int pitem) {
		int aloc = 0;
		boolean moreToSearch = aloc<length;
		while(moreToSearch) {
			if(pitem<List_Items[aloc]) {
				moreToSearch = false;
			} else {
				aloc ++;
				moreToSearch = aloc<length;
			}
		}
		for(int i=length;i>aloc;i--) {
			List_Items[i] = List_Items[i-1];
		}
		List_Items[aloc] = pitem;
		length++;
	}
	public void deleteItem(int ditem) {
		int aloc = 0;
		boolean moreToSearch = true;
		while(moreToSearch && aloc<length){
			if(ditem==List_Items[aloc]) {
				moreToSearch = false;
			} else {
				aloc++;
			}
		}
		for(int i = aloc;i<length;i++) {
			if(i<MAXSIZE-1) {
				List_Items[i] = List_Items[i+1];
			}
		}
		length--;
	}
	public int getItem(int gitem) {
	    int midpoint=0, first=0, last=length-1;
	    boolean moreToSearch = first <= last;
	    while (moreToSearch) {
	    	midpoint = (first+last)/2;
	    	if(gitem == List_Items[midpoint]) {
	    		return midpoint;
	    	} else if (gitem<List_Items[midpoint]) {
	    		last = midpoint -1;
	    	} else {
	    		first = midpoint+1;
	    	}
	    	moreToSearch = first <= last;
	    }
	    return -1;
	}
	public void makeEmpty() {
		length = 0;
	}
	public boolean isFull() {
		return length == MAXSIZE;
	}
	public void resetList() {
		currentPos = 0;
	}
	public int getNextItem() {
		currentPos++;
		return List_Items[currentPos-1];
	}
	public void printList() {
		System.out.print("(");
		for(int loc = 0;loc<length;loc++) {
			System.out.print(List_Items[loc]);
			if(loc<length-1) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
	public int getLength() {
		return length;
	}

}
