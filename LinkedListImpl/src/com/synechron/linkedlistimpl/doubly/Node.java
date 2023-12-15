package com.synechron.linkedlistimpl.doubly;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node {
	
	Node pre;
	int data;
	Node next;

}
