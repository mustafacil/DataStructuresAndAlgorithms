package datastructures._06.hashtable;

public class Entry {

	private int key;
	private Object value;
	private Entry nextEntry;

	public Entry() {
		
	}

	public Entry(int key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Entry getNextEntry() {
		return nextEntry;
	}

	public void setNextEntry(Entry nextEntry) {
		this.nextEntry = nextEntry;
	}

}
