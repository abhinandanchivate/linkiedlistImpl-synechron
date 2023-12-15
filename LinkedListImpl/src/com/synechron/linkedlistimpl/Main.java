package com.synechron.linkedlistimpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListService linkedListService = new LinkedListService();
		
		String result = linkedListService.addNodeAtTheBegining(new Node(10,null));
		
		System.out.println(result);
		String result2 = linkedListService.addNodeAtTheBegining(new Node(20,null));
		
		String result3 = linkedListService.addNodeAtTheEnd(new Node(30,null));
		
		linkedListService.deleteFirstNode();
		
		linkedListService.printList();

	}// 10 30

}
