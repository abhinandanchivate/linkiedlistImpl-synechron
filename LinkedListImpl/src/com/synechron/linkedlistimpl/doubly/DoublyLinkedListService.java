package com.synechron.linkedlistimpl.doubly;

public class DoublyLinkedListService {
	
	private Node headNode;
	
	
	public String addNodeAtTheBegining(Node node) {
		
		if(headNode==null) {
			
			node.setPre(null);
			node.setNext(null);
			headNode = node;
			return "success";
		}
		else {
			node.setPre(null);
			node.setNext(headNode);
			headNode.setPre(node);
			//
			headNode = node;
			return "success";
			
		}
	}
	
	public String addNodeAtTheEnd(Node node) {
		
		Node traversal, follower = null;
		traversal = headNode;
		
		while(traversal!=null) {
			//System.out.println(traversal.getData());
			follower = traversal;
			traversal = traversal.getNext();
			
			
		}
		follower.setNext(node);
		node.setPre(follower);
		node.setNext(null);
		
		return "success";
		
	}
	
//	public String deleteFirstNode() {
//		
//	}
	
	public void printList() {
		
	}
	
	public void printReverseList() {
		
		Node traversal, follower = null;
		traversal = headNode;
		
		while(traversal!=null) {
			//System.out.println(traversal.getData());
			follower = traversal;
			traversal = traversal.getNext();
		}
		// follower will refer to the last node.
		
		while(follower!=null) {
			System.out.println(follower.getData());
			follower = follower.getPre();
		}
		
	}

}
