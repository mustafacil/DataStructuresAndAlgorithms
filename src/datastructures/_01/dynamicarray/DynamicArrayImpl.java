package datastructures._01.dynamicarray;

import java.util.Arrays;

public class DynamicArrayImpl <T>{
	
	private Object[] arr;
	private int lastIndex;
	
	public DynamicArrayImpl() {
		arr = new Object[1];
	}
	
	public int getSize() {
		return arr.length;
	}
	
	public T get(int index) {
		return (T) arr[index];
	}
	
	public void add(T value) {
		
		ensureCapacity(lastIndex+1);
		arr[lastIndex++] = value; 
		
	}

	private void ensureCapacity(int desiredCapacity) {
		
		int oldCapacity = this.getSize();
		if(desiredCapacity>oldCapacity) {
			arr = Arrays.copyOf(arr, this.getSize()*2);
		}
		
	}
}
