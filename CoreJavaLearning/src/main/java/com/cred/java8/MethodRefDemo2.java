package com.cred.java8;


public class MethodRefDemo2 {

	public static void main(String[] args) {

		Runnable runnable=MethodRefDemo2::print;
		/*Runnable runnable=()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread: "+i);
			}
		};*/

		Thread thread=new Thread(runnable);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Started");
		for(int i=11;i<=20;i++) {
			System.out.println("Main Thread: "+i);
		}
		
	}
	
	public static void print() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread: "+i);
		}
		
	}

}
