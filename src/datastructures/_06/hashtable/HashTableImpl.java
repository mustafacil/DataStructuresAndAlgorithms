package datastructures._06.hashtable;

public class HashTableImpl <T>{
	
	private Entry baseArr[];
	private int size;
	public HashTableImpl(int size) {
		
		this.size = size;
		baseArr = new Entry[size];
		for (int i = 0; i < baseArr.length; i++) {
			baseArr[i] = new Entry();
		}
	}
	
	private int getHashCode(int key) {
		return key % size;
	}
	
	public void put(int key, T value) {
		
		int hashCode = getHashCode(key);
		
		Entry newEntry = new Entry(key, value);
		Entry baseEntry = baseArr[hashCode];
		newEntry.setNextEntry(baseEntry.getNextEntry());
		baseEntry.setNextEntry(newEntry);
		
	}
	
	public T get(int key) {
		
		int hashCode = getHashCode(key);
		Entry baseEntry = baseArr[hashCode];
		T value = null;
		
		while(baseEntry!=null) {
			
			if(key == baseEntry.getKey()) {
				value = (T) baseEntry.getValue();
			}
			
			baseEntry = baseEntry.getNextEntry();
		}
		return value;
	}

}
