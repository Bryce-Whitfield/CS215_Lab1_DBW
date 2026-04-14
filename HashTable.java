public class HashTable {
    public static final int CAPACITY = 100;
    private LL_UList[] hashChains;

    public HashTable(){
        hashChains = new LL_UList[CAPACITY];
    }

    private int hash(int key){
        return key % CAPACITY;
    }

    public int countKeys(){
        int totalKeys = 0;
        for(int i=0;i<CAPACITY;i++){
            if(hashChains[i] != null){
                totalKeys += hashChains[i].getLength();
            }
        }
        return totalKeys;
    }
    public void putItem(int key){
        int index = hash(key);
        if(hashChains[index] == null){
            hashChains[index] = new LL_UList();
        }
        hashChains[index].putItem(key);
    }

    public void deleteItem(int key) throws Exception{
        int index = hash(key);
        hashChains[index].deleteItem(key);
    }

    public void printTable(){
        for(int i=0;i<CAPACITY;i++){
            if(hashChains[i] != null){
                hashChains[i].printList();
            } else {
                System.out.println("()");
            }
        }
    }

}
