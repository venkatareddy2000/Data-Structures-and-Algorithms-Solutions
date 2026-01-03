package hashmap_fundamental_implementation;

public class HashMapFundamentalImplementation<K, V> {

	private int capacity;
	private Entry<K, V>[] table;

	class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	public HashMapFundamentalImplementation(int capacity) {
		this.capacity = capacity;
		this.table = new Entry[capacity];
	}

	private int hash(K key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % capacity;
	}

	private void put(K key, V value) {
		int index = hash(key);
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
			entry = entry.next;
		}
		Entry<K, V> newEntry = new Entry<K, V>(key, value);
		newEntry.next = table[index];
		table[index] = newEntry;
	}

	private V get(K key) {
		int index = hash(key);
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}

	private void remove(K key) {
		int index = hash(key);
		Entry<K, V> entry = table[index];
		Entry<K, V> previous = null;
		while (entry != null) {
			if (entry.key.equals(key)) {
				if (previous == null) {
					table[index] = entry.next;
				} else {
					previous.next = entry.next;
				}
				return;
			}
			previous = entry;
			entry = entry.next;
		}
	}

	private boolean containsKey(K key) {
		int index = hash(key);
		Entry<K, V> entry = table[index];
		while (entry != null) {
			if (entry.key.equals(key)) {
				return true;
			}
			entry = entry.next;
		}
		return false;
	}

	private void display() {
		for (int index = 0; index < capacity; index++) {
			Entry<K, V> entry = table[index];
			while (entry != null) {
				System.out.println(entry.key + "=" + entry.value);
				entry = entry.next;
			}
		}
	}

	public static void main(String[] args) {
		HashMapFundamentalImplementation<Integer, Integer> hashMapFundamentalImplementation = new HashMapFundamentalImplementation<>(
				10);
		hashMapFundamentalImplementation.put(10, 1);
		hashMapFundamentalImplementation.put(11, 2);
		hashMapFundamentalImplementation.put(12, 3);
		hashMapFundamentalImplementation.put(13, 4);
		hashMapFundamentalImplementation.put(14, 5);
		hashMapFundamentalImplementation.display();
		System.out.println(hashMapFundamentalImplementation.get(10));
		System.out.println(hashMapFundamentalImplementation.containsKey(13));
		hashMapFundamentalImplementation.remove(14);
		hashMapFundamentalImplementation.display();

	}

}
