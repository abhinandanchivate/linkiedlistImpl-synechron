package com.synechron.linkedlistimpl;

public class LinkedListService {
	
	// Singly LL.
	
	// 1. addNode()
	
	private Node headNode;// 1st node (benining of SLL)
	
	public String addNodeAtTheBegining(Node node) {
		
		if(headNode==null) {
			// there is no node
			
			headNode = node;
			return "success";
		}
		else {
			// we do have a headNode.
			
			Node temp = node;
			// temp node
			
			temp.setNext(headNode); // temp node's next part will refer the current headNode from the list.
			headNode = temp;
			return "success";
			
		}
		
	}
	
	public String addNodeAtTheEnd(Node node) {
Node traversal= headNode;
Node follower = null;
		
		while(traversal!=null) {
			//System.out.println(traversal.getData());
			follower = traversal;
			traversal = traversal.getNext();
			
			
		}
		
		follower.setNext(node);
		return "success";
	}
	
	public void printList() {
		Node traversal= headNode;
		
		while(traversal!=null) {
			System.out.println(traversal.getData());
			traversal = traversal.getNext();
			
			
		}
		
	}
	
	public String deleteFirstNode() {
		Node temp = headNode;
		
		headNode = headNode.getNext();
		
		temp = null;
		return "success";
		
		
		
	}

}








