package com.naveen.queue;

public class Queue {

	int[] queue = new int[5];
	int size;
	int front;
	int rear;

	public void enQueue(int data) 
	{
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		}

	}

	public int deQueue() 
	{
		int data = queue[front];
		if (isEmpty()) 
		{
			System.out.println("Queue is Empty");
		} else {
			front = (front + 1) % 5;
			size = size - 1;
		}

		return data;
	}

	public void show() {
		System.out.print("Elements : ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();

		for (int n : queue) {
			System.out.print(n + " ");
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 5;
	}
	
}

/*
output:
is Empty : false
is Full : false
size : 4
Elements : 7 3 9 1 
1 2 7 3 9 
*/