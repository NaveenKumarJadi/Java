package com.naveen.stack;

public class Runner {

	public static void main(String[] args) {

//		Stack nums = new Stack();
		DStack nums = new DStack();
		nums.push(15);
		nums.show();
		nums.push(8);

		nums.show();
		nums.push(10);
		nums.show();
		nums.push(7);
		nums.show();
		nums.push(17);
		nums.show();
		nums.push(77);
		nums.show();
		
//		System.out.println(nums.peek());
		
//		System.out.println(nums.pop());
	
//		System.out.println( "size is : " + nums.size());

//		System.out.println( "Empty =  : " + nums.isEmpty());
		
		
//		System.out.println(nums.pop());
//		System.out.println(nums.pop());
//		System.out.println(nums.pop());
//		System.out.println(nums.pop());
//		System.out.println(nums.pop());
//		System.out.println(nums.pop());
//		nums.size();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
	}

}
