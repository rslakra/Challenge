package com.rslakra.java.datastructure;

import com.rslakra.java.Node;

/**
 * 
 * @author Rohtash Singh Lakra
 * @date 11/03/2016 04:28:44 PM
 *
 */
public class LinkedList<E> {
	
	private Node<E> head;
	
	/**
	 * 
	 * @param newNode
	 */
	public LinkedList() {
	}
	
	/**
	 * Returns true if the linked list is empty otherwise false.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (head == null);
	}
	
	/**
	 * Inserts the new node at the first position of the linked list.
	 * 
	 * Time complexity of insertion is O(1), because it takes constant amount of
	 * time.
	 * 
	 * @param newNode
	 */
	public void push(Node<E> newNode) {
		if(head != null) {
			newNode.setNext(head);
		}
		head = newNode;
	}
	
	/**
	 * Inserts the new node after the specified parent node.
	 * 
	 * Time complexity of insertAfter() is O(1) as it does constant amount of
	 * work.
	 * 
	 * @param parentNode
	 * @param newNode
	 */
	public void insertAfter(Node<E> parentNode, Node<E> newNode) {
		if(parentNode == null) {
			parentNode = newNode;
		} else {
			newNode.setNext(parentNode.getNext());
			parentNode.setNext(newNode);
		}
	}
	
	/**
	 * Inserts the new node at the end of the linked list.
	 * 
	 * @param newNode
	 */
	public void append(Node<E> newNode) {
		// new node will be the last node, so set it's next to be null;
		newNode.setNext(null);
		
		if(head == null) {
			head = newNode;
		} else {
			Node<E> last = head;
			while(last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}
	
	/**
	 * Removes the provided node.
	 * 
	 * @param node
	 */
	public void remove(Node<E> node) {
		Node<E> currentNode = head;
		while(currentNode != null) {
			if(currentNode.equals(node)) {
				
				break;
			}
			currentNode = currentNode.getNext();
		}
	}
	
	/**
	 * Returns the string representation of this oject.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		Node<E> tempNode = head;
		sBuilder.append("[");
		
		while(tempNode != null) {
			sBuilder.append(tempNode.getData());
			tempNode = tempNode.getNext();
			if(tempNode != null) {
				sBuilder.append(", ");
			}
		}
		
		sBuilder.append("]");
		return sBuilder.toString();
	}
	
}
