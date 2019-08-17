package datastructures._06.hashtable;

public class TestHashTableImpl {

	public static void main(String[] args) {

		HashTableImpl<String> hashTableImpl = new HashTableImpl<>(8);

		hashTableImpl.put(1, "String - 1");
		hashTableImpl.put(2, "String - 2");
		hashTableImpl.put(3, "String - 3");
		hashTableImpl.put(4, "String - 4");
		hashTableImpl.put(5, "String - 5");
		hashTableImpl.put(6, "String - 6");
		hashTableImpl.put(7, "String - 7");
		hashTableImpl.put(8, "String - 8");

		System.out.println(hashTableImpl.get(6));
		System.out.println(hashTableImpl.get(4));
		System.out.println(hashTableImpl.get(8));

	}

}
