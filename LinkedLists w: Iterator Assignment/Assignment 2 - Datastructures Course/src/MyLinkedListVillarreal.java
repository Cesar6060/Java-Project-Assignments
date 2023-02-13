//Class:	CS5040	
//Term:		Spring 2023
//Name:		Cesar Villarreal
//Program Number: Assignment 2
//IDE	Eclipse

public class MyLinkedListVillarreal <E> {
	
	private class Node{
		E data;
		Node next; 
		Node(E newData){
			data = newData;
			next = null;
		}
	}
	
	private int size;
	private Node head;
	private Node tail;
	
	MyLinkedListVillarreal(){
		size = 0;
		head = null;
		tail = null;
	}
	
	public E getFirst() throws RuntimeException{
		if(isEmpty()) {
			throw new RuntimeException("In getFirst method: Index out of bounds");
		}	
		return head.data; 
	}
	
	public E getLast() throws RuntimeException{
		if(isEmpty()) {
			throw new RuntimeException("In getFirst method: Index out of bounds");
		}	
		return tail.data; 
	}
	
	public void addLast(E newElement){
		var node = new Node(newElement);
		if(isEmpty()) {
			head = node;
			tail = node;
		}
		else {
		tail.next = node;
		tail = node;
		
		}
		size++;
		
	}
	
	public void removeLast(){
		if(isEmpty()) {
			throw new RuntimeException("In removeLast: the list is empty");
		}	
		if(head == tail) {
			head = tail = null;
		}
		else {
		var currentNode = head;
		while(currentNode.next != tail) {
			currentNode = currentNode.next;
		}
			currentNode.next = null;
			tail = currentNode;
		}
		size--;
	}
	
	public int indexOf(E targetElement){
		int index = 0;
		var currentNode = head;
		
		while (currentNode != null) {
			if(currentNode.data == targetElement)
				return index;
			currentNode = currentNode.next;
				index++;	
		}
		return -1;
	}
		
	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	public void addFirst(E newElement){
		Node newNode = new Node(newElement);
		newNode.next = head;
		head = newNode;
		if(newNode.next == null) {
			tail = newNode;
		}
		size++;
	}
	
	
	public void add(int index, E newElement) throws RuntimeException {
		if(index<0 || index>size)
			throw new RuntimeException("In add method: Index out of bounds");
		if (index == 0) {
			addFirst(newElement);
		} else {
			Node temp = head;
			while (--index > 0) {
				temp = temp.next;
			}
			Node newNode = new Node(newElement);
			newNode.next = temp.next;
			temp.next = newNode;
			if (newNode.next == null) {
				tail = newNode;
			}
			size++;
		}
	}
	
	
	public void removeFirst() throws RuntimeException {
		if(head == null) {
			throw new RuntimeException("In removeFirst: the list is empty");
		}
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
	}
	
	public void remove(int index) throws RuntimeException {
		if(index<0 || index>=size)
			throw new RuntimeException("In remove method: Index out of bounds");
		if (index == 0) {
			removeFirst();
		} else {
			Node temp = head;
			while (--index > 0) {
				temp = temp.next;
			}
			Node targetNode = temp.next;
			temp.next = targetNode.next;
			size--;
			if(temp.next == null) {
				tail = temp;
			}
			
		}
		
	}
	
	
	public String toString() {
		String str = "[";
		Node temp = head;
		
		while(temp != null) {
			str = str + temp.data;
			if(temp != tail) {
				str = str + ", ";
			}
			temp = temp.next;
		}		
		
		return str + "]";
	}
	
	
	public Iterator iterator(){

		return new Iterator();
	}
	
	class Iterator implements java.util.Iterator<E>{
		Node nextNode; 
		Node lastReturned; 
		Node prevNode; 
		Iterator(){
			this.nextNode = head;
			this.lastReturned = null;
			this.prevNode = null;	
		}
		
		public E next() throws RuntimeException{
			if(!hasNext()) {
				throw new RuntimeException("No more elements");
			}
			
			prevNode = lastReturned;
			lastReturned = nextNode;
			nextNode = nextNode.next;
			
			return lastReturned.data;

		}
		public boolean hasNext(){
			return nextNode != null;
		}
		
		public void remove() {
			if(lastReturned == null) {
				throw new IllegalStateException("No element remove");
			}
			if(prevNode == null) {
				head = nextNode;
			}
			else {
				prevNode.next = nextNode;
			}
			
			lastReturned = null;

		}
	}	
	
}
