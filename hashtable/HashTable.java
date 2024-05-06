package com.hashtable;

public class HashTable {
	
	private HashTable[] buckets;
	private int numOfBuckets;  //capacity
	private int size;  // number of key value pairs in hashtable
	
	
	
	
	public HashTable() {
		this(10);   //Default capacity
	}

	public HashTable(int numOfBuckets) {
		super();
		this.numOfBuckets = numOfBuckets;
		buckets = new HashTable[numOfBuckets];
		this.size = 0;
	}
	
	public int size() {
		return size;
		
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	private class HashNode{
		private Integer key;  //can be generic
		private String value; //can be generic
		private HashTable next;
		public HashNode(Integer key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		
		
		
	}
	
	public void put(Integer key, String value) {
		if(key == null || value == null) {
			throw new IllegalArgumentException("Key or value is null");
		}
		
		int bucketindex = getBucketIndex(key);
		HashTable head = buckets[bucketindex];
		
	}

	private int getBucketIndex(Integer key) {
		// TODO Auto-generated method stub
		return key% numOfBuckets;
	}
	
	

}
